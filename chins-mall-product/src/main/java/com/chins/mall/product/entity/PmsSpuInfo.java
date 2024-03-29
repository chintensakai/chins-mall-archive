package com.chins.mall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * spu信息
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsSpuInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 商品id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * 商品名称
   */
  private String spuName;

  /**
   * 商品描述
   */
  private String spuDescription;

  /**
   * 所属分类id
   */
  private Long catalogId;

  /**
   * 品牌id
   */
  private Long brandId;

  private BigDecimal weight;

  /**
   * 上架状态[0 - 下架，1 - 上架]
   */
  private Integer publishStatus;

  private LocalDateTime createTime;

  private LocalDateTime updateTime;


}
