package com.chins.mall.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chins.mall.product.entity.PmsBrand;
import com.chins.mall.product.mapper.PmsBrandMapper;
import com.chins.mall.product.service.IPmsBrandService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌 服务实现类
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements
    IPmsBrandService {

}
