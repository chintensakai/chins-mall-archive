package com.chins.mall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 会员登录记录
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsMemberLoginLog implements Serializable {

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
   * 创建时间
   */
  private LocalDateTime createTime;

  /**
   * ip
   */
  private String ip;

  /**
   * city
   */
  private String city;

  /**
   * 登录类型[1-web，2-app]
   */
  private Boolean loginType;


}
