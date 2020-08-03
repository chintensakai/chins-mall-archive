package com.chins.mall.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chins.mall.order.entity.OmsOrder;
import com.chins.mall.order.mapper.OmsOrderMapper;
import com.chins.mall.order.service.IOmsOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements
    IOmsOrderService {

}
