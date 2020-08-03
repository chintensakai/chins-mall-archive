package com.chins.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品会员价格
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsMemberPrice implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * sku_id
   */
  private Long skuId;

  /**
   * 会员等级id
   */
  private Long memberLevelId;

  /**
   * 会员等级名
   */
  private String memberLevelName;

  /**
   * 会员对应价格
   */
  private BigDecimal memberPrice;

  /**
   * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
   */
  private Boolean addOther;


}
