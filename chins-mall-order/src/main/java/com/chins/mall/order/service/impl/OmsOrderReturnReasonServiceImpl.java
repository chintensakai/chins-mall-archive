package com.chins.mall.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chins.mall.order.entity.OmsOrderReturnReason;
import com.chins.mall.order.mapper.OmsOrderReturnReasonMapper;
import com.chins.mall.order.service.IOmsOrderReturnReasonService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 退货原因 服务实现类
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Service
public class OmsOrderReturnReasonServiceImpl extends
    ServiceImpl<OmsOrderReturnReasonMapper, OmsOrderReturnReason> implements
    IOmsOrderReturnReasonService {

}
