package com.chins.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WmsPurchaseDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * 采购单id
   */
  private Long purchaseId;

  /**
   * 采购商品id
   */
  private Long skuId;

  /**
   * 采购数量
   */
  private Integer skuNum;

  /**
   * 采购金额
   */
  private BigDecimal skuPrice;

  /**
   * 仓库id
   */
  private Long wareId;

  /**
   * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
   */
  private Integer status;


}
