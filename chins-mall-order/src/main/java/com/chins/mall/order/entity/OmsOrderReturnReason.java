package com.chins.mall.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 退货原因
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OmsOrderReturnReason implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * 退货原因名
   */
  private String name;

  /**
   * 排序
   */
  private Integer sort;

  /**
   * 启用状态
   */
  private Boolean status;

  /**
   * create_time
   */
  private LocalDateTime createTime;


}
