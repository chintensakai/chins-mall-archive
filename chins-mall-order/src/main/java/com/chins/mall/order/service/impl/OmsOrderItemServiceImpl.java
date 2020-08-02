package com.chins.mall.order.service.impl;

import com.chins.mall.order.entity.OmsOrderItem;
import com.chins.mall.order.mapper.OmsOrderItemMapper;
import com.chins.mall.order.service.IOmsOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项信息 服务实现类
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements IOmsOrderItemService {

}
