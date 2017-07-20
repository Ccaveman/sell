package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Ccaveman
 * @Description: 商品信息对应的Dao
 * @Date: Created in 12:25 2017/7/20
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{
    /**
     * 根据商品的状态来查找商品
     * @param productStatus 商品状态
     * @return 商品对象
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);

}
