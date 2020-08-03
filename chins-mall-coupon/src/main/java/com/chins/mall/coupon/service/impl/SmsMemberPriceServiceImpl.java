package com.chins.mall.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chins.mall.coupon.entity.SmsMemberPrice;
import com.chins.mall.coupon.mapper.SmsMemberPriceMapper;
import com.chins.mall.coupon.service.ISmsMemberPriceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品会员价格 服务实现类
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Service
public class SmsMemberPriceServiceImpl extends
    ServiceImpl<SmsMemberPriceMapper, SmsMemberPrice> implements ISmsMemberPriceService {

}
