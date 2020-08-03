package com.chins.mall.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chins.mall.order.entity.OmsPaymentInfo;
import com.chins.mall.order.mapper.OmsPaymentInfoMapper;
import com.chins.mall.order.service.IOmsPaymentInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付信息表 服务实现类
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Service
public class OmsPaymentInfoServiceImpl extends
    ServiceImpl<OmsPaymentInfoMapper, OmsPaymentInfo> implements IOmsPaymentInfoService {

}
