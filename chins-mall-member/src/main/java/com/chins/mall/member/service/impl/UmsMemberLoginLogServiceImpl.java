package com.chins.mall.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chins.mall.member.entity.UmsMemberLoginLog;
import com.chins.mall.member.mapper.UmsMemberLoginLogMapper;
import com.chins.mall.member.service.IUmsMemberLoginLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员登录记录 服务实现类
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Service
public class UmsMemberLoginLogServiceImpl extends
    ServiceImpl<UmsMemberLoginLogMapper, UmsMemberLoginLog> implements IUmsMemberLoginLogService {

}
