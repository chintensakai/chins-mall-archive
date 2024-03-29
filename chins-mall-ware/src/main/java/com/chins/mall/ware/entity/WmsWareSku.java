package com.chins.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品库存
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WmsWareSku implements Serializable {

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
   * 仓库id
   */
  private Long wareId;

  /**
   * 库存数
   */
  private Integer stock;

  /**
   * sku_name
   */
  private String skuName;

  /**
   * 锁定库存
   */
  private Integer stockLocked;


}
