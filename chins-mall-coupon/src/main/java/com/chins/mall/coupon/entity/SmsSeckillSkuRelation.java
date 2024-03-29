package com.chins.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 秒杀活动商品关联
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsSeckillSkuRelation implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * 活动id
   */
  private Long promotionId;

  /**
   * 活动场次id
   */
  private Long promotionSessionId;

  /**
   * 商品id
   */
  private Long skuId;

  /**
   * 秒杀价格
   */
  private BigDecimal seckillPrice;

  /**
   * 秒杀总量
   */
  private BigDecimal seckillCount;

  /**
   * 每人限购数量
   */
  private BigDecimal seckillLimit;

  /**
   * 排序
   */
  private Integer seckillSort;


}
