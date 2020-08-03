package com.chins.mall.member.feign;

import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("chins-mall-coupon")
public interface SmsCouponFeignService {

  @GetMapping("/coupon/sms-coupon/member/list")
  R memberCoupons();

}
