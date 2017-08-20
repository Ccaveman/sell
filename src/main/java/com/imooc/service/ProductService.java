package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Ccaveman
 * @Description: 商品信息
 * @Date: Created in 13:03 2017/7/20
 */
@Service
public interface ProductService {
    /**
     * 根据商品ID查找商品
     * @param productId 商品ID
     * @return 商品对象
     */
    ProductInfo findOne(String productId);

    /**
     * 查找所有上架商品
     * @return 所有上架商品对象组成的集合
     */
    List<ProductInfo> findUpAll();

    /**
     * 查找所有商品
     * @param pageable 分页信息
     * @return 所有商品对象组成的集合
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 保存商品
     * @param productInfo 商品对象
     * @return 保存的商品对象
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     * @param cartDTOList 购物车信息
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
