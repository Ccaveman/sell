package com.imooc.controller;

import com.imooc.dataobject.ProductInfo;
import com.imooc.exception.SellException;
import com.imooc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Author: Ccaveman
 * @Description: 卖家端商品
 * @Date: Created in 20:23 2017/8/25
 */
@Controller
@RequestMapping("/seller/product")
public class SellProductController {

    @Autowired
    private ProductService productService;

    /**
     * 卖家端商品列表
     * @param page 总共多少页
     * @param size 一页有多少数据
     * @param map 商品和分页对象
     * @return 视图解析对象
     */
    @GetMapping("/list")
    public ModelAndView list(@RequestParam(value = "page", defaultValue = "1") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size,
                             Map<String, Object> map){
        PageRequest request = new PageRequest(page-1,size);

        Page<ProductInfo> productInfoPage = productService.findAll(request);

        map.put("productInfoPage",productInfoPage);

        map.put("currentPage",page);

        map.put("size",size);
        return new ModelAndView("product/list",map);

    }

    /**
     * 商品上架
     * @param productId
     * @param map
     * @return
     */
    @GetMapping("/on_sale")
    public ModelAndView onSale(@RequestParam("productId") String productId,
                               Map<String,Object> map){
        try {
            productService.onSale(productId);
        }catch (SellException e){
            map.put("msg",e.getMessage());
            map.put("url","/sell/seller/product/list");
            return new ModelAndView("common/error");
        }
        map.put("msg","商品上架成功");
        map.put("url","/sell/seller/product/list");
        return new ModelAndView("common/success",map);
    }

    /**
     * 商品下架
     * @param productId
     * @param map
     * @return
     */
    @GetMapping("/off_sale")
    public ModelAndView offSale(@RequestParam("productId") String productId,
                               Map<String,Object> map){
        try {
            productService.offSale(productId);
        }catch (SellException e){
            map.put("msg",e.getMessage());
            map.put("url","/sell/seller/product/list");
            return new ModelAndView("common/error");
        }
        map.put("msg","商品下架成功");
        map.put("url","/sell/seller/product/list");
        return new ModelAndView("common/success",map);
    }
}
