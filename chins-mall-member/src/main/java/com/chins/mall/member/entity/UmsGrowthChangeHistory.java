package com.chins.mall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 成长值变化历史记录
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsGrowthChangeHistory implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * member_id
   */
  private Long memberId;

  /**
   * create_time
   */
  private LocalDateTime createTime;

  /**
   * 改变的值（正负计数）
   */
  private Integer changeCount;

  /**
   * 备注
   */
  private String note;

  /**
   * 积分来源[0-购物，1-管理员修改]
   */
  private Integer sourceType;


}
