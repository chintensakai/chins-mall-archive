package com.chins.mall.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 订单操作历史记录
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OmsOrderOperateHistory implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * 订单id
   */
  private Long orderId;

  /**
   * 操作人[用户；系统；后台管理员]
   */
  private String operateMan;

  /**
   * 操作时间
   */
  private LocalDateTime createTime;

  /**
   * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
   */
  private Integer orderStatus;

  /**
   * 备注
   */
  private String note;


}
