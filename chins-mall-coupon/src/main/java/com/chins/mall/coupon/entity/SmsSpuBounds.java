package com.chins.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品spu积分设置
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsSpuBounds implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  private Long spuId;

  /**
   * 成长积分
   */
  private BigDecimal growBounds;

  /**
   * 购物积分
   */
  private BigDecimal buyBounds;

  /**
   * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 -
   * 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
   */
  private Boolean work;


}
