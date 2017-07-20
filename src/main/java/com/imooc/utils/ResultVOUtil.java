package com.imooc.utils;

import com.imooc.vo.ResultVO;

/**
 * @Author: Ccaveman
 * @Description: ResultVO 工具类
 * @Date: Created in 23:22 2017/7/20
 */
public class ResultVOUtil {
    /**
     * 当返回数据成功时调用方法
     * @param object 查询到的商品类目的集合
     * @return ResultVO 对象
     */
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();

        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }

    /**
     * 未查询到商品但也成功返回
     * @return ResultVO 对象
     */
    public static ResultVO success(){
        return success(null);
    }

    /**
     * 当返回结果出现异常时
     * @param code 异常码
     * @param msg 异常信息
     * @return ResultVO 对象
     */
    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
