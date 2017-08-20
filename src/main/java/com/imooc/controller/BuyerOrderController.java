package com.imooc.controller;

import com.imooc.converter.OrderForm2OrderDTOConverter;
import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDTO;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.form.OrderForm;
import com.imooc.service.BuyerService;
import com.imooc.service.OrderService;
import com.imooc.utils.ResultVOUtil;
import com.imooc.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Ccaveman
 * @Description: 买家端controller层开发
 * @Date: Created in 13:50 2017/8/20
 */
@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private BuyerService buyerService;

    /**
     * 创建订单
     * @param orderForm 提交表单信息由spring转换成对象
     * @param bindingResult 表单验证对象
     * @return json格式的视图对象
     */
    @PostMapping("/create")
    public ResultVO<Map<String,String>> create(@Valid OrderForm orderForm, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            log.error("【创建订单】参数不正确，orderForm={}",orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("【创建订单】购物车不能为空");
            throw new SellException(ResultEnum.CART_EMPTY);
        }
        OrderDTO createResult = orderService.create(orderDTO);

        Map<String,String> map = new HashMap<>();
        map.put("orderId",createResult.getOrderId());

        return ResultVOUtil.success(map);
    }

    /**
     * 订单列表
     * @param openid 买家的openid
     * @param page 分页的页数
     * @param size 每页的记录数
     * @return json格式的视图对象
     */
    @GetMapping("/list")
    public ResultVO<List<OrderDetail>> list(@RequestParam("openid") String openid,
                                            @RequestParam(value = "page",defaultValue = "0") Integer page,
                                            @RequestParam(value = "size",defaultValue = "10") Integer size){
        if (StringUtils.isEmpty(openid)) {
            log.error("【查询订单列表】openid为空");
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        PageRequest request = new PageRequest(page,size);
        Page<OrderDTO> orderDTOPage = orderService.findList(openid,request);
        return ResultVOUtil.success(orderDTOPage.getContent());

    }

    /**
     * 订单详情 根据买家的openid查询订单详情
     * @param openid 买家的openid
     * @param orderId 订单id
     * @return json格式的视图对象
     */
    @GetMapping("/detail")
    public ResultVO<OrderDTO> detail(@RequestParam("openid") String openid,
                                     @RequestParam("orderId") String orderId){
        OrderDTO orderDTO = buyerService.findOrderOne(openid,orderId);
        return ResultVOUtil.success(orderDTO);
    }

    /**
     * 取消订单 根据买家的openid和orderId取消该订单
     * @param openid 买家的openid
     * @param orderId 订单id
     * @return json格式的视图对象
     */
    @PostMapping("/cancel")
    public ResultVO cancel(@RequestParam("openid") String openid,
                          @RequestParam("orderId") String orderId){
        buyerService.cancelOrder(openid,orderId);
        return ResultVOUtil.success();
    }
}
