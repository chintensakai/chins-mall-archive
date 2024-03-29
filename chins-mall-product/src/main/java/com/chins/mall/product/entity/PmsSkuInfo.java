package com.chins.mall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * sku信息
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsSkuInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * skuId
   */
  @TableId(value = "sku_id", type = IdType.AUTO)
  private Long skuId;

  /**
   * spuId
   */
  private Long spuId;

  /**
   * sku名称
   */
  private String skuName;

  /**
   * sku介绍描述
   */
  private String skuDesc;

  /**
   * 所属分类id
   */
  private Long catalogId;

  /**
   * 品牌id
   */
  private Long brandId;

  /**
   * 默认图片
   */
  private String skuDefaultImg;

  /**
   * 标题
   */
  private String skuTitle;

  /**
   * 副标题
   */
  private String skuSubtitle;

  /**
   * 价格
   */
  private BigDecimal price;

  /**
   * 销量
   */
  private Long saleCount;


}
