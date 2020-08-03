package com.chins.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 采购信息
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WmsPurchase implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 采购单id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * 采购人id
   */
  private Long assigneeId;

  /**
   * 采购人名
   */
  private String assigneeName;

  /**
   * 联系方式
   */
  private String phone;

  /**
   * 优先级
   */
  private Integer priority;

  /**
   * 状态
   */
  private Integer status;

  /**
   * 仓库id
   */
  private Long wareId;

  /**
   * 总金额
   */
  private BigDecimal amount;

  /**
   * 创建日期
   */
  private LocalDateTime createTime;

  /**
   * 更新日期
   */
  private LocalDateTime updateTime;


}
