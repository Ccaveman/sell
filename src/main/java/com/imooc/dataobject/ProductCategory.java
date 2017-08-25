package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: Ccaveman
 * @Description: 商品类目表对应的实体类
 * @Date: Created in 12:27 2017/7/20
 */
@Entity //对应数据库类目表的实体类
@DynamicUpdate //动态更新
@Data //自动为属性创建get set 方法
public class ProductCategory {
   /*类目ID*/
   @Id //主键
   @GeneratedValue//自增长
   private Integer categoryId;

   /*类目名字*/
   private String categoryName;

   /*类目编号*/
   private Integer categoryType;

   private Date createTime;

   private Date updateTime;

   public ProductCategory() {
   }

   public ProductCategory(String categoryName, Integer categoryType) {
      this.categoryName = categoryName;
      this.categoryType = categoryType;
   }

}
