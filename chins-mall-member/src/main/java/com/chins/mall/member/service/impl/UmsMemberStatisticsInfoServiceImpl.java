package com.chins.mall.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chins.mall.member.entity.UmsMemberStatisticsInfo;
import com.chins.mall.member.mapper.UmsMemberStatisticsInfoMapper;
import com.chins.mall.member.service.IUmsMemberStatisticsInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员统计信息 服务实现类
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Service
public class UmsMemberStatisticsInfoServiceImpl extends
    ServiceImpl<UmsMemberStatisticsInfoMapper, UmsMemberStatisticsInfo> implements
    IUmsMemberStatisticsInfoService {

}
