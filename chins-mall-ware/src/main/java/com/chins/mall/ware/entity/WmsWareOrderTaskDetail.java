package com.chins.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 库存工作单
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WmsWareOrderTaskDetail implements Serializable {

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
   * sku_name
   */
  private String skuName;

  /**
   * 购买个数
   */
  private Integer skuNum;

  /**
   * 工作单id
   */
  private Long taskId;


}
