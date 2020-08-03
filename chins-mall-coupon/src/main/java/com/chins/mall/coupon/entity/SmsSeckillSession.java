package com.chins.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 秒杀活动场次
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsSeckillSession implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * 场次名称
   */
  private String name;

  /**
   * 每日开始时间
   */
  private LocalDateTime startTime;

  /**
   * 每日结束时间
   */
  private LocalDateTime endTime;

  /**
   * 启用状态
   */
  private Boolean status;

  /**
   * 创建时间
   */
  private LocalDateTime createTime;


}
