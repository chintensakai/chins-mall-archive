package com.chins.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 秒杀活动
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsSeckillPromotion implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * 活动标题
   */
  private String title;

  /**
   * 开始日期
   */
  private LocalDateTime startTime;

  /**
   * 结束日期
   */
  private LocalDateTime endTime;

  /**
   * 上下线状态
   */
  private Integer status;

  /**
   * 创建时间
   */
  private LocalDateTime createTime;

  /**
   * 创建人
   */
  private Long userId;


}
