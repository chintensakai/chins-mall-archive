package com.chins.mall.member.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 会员统计信息
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsMemberStatisticsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 会员id
     */
    private Long memberId;

    /**
     * 累计消费金额
     */
    private BigDecimal consumeAmount;

    /**
     * 累计优惠金额
     */
    private BigDecimal couponAmount;

    /**
     * 订单数量
     */
    private Integer orderCount;

    /**
     * 优惠券数量
     */
    private Integer couponCount;

    /**
     * 评价数
     */
    private Integer commentCount;

    /**
     * 退货数量
     */
    private Integer returnOrderCount;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 关注数量
     */
    private Integer attendCount;

    /**
     * 粉丝数量
     */
    private Integer fansCount;

    /**
     * 收藏的商品数量
     */
    private Integer collectProductCount;

    /**
     * 收藏的专题活动数量
     */
    private Integer collectSubjectCount;

    /**
     * 收藏的评论数量
     */
    private Integer collectCommentCount;

    /**
     * 邀请的朋友数量
     */
    private Integer inviteFriendCount;


}
