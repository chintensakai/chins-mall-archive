package com.chins.mall.coupon.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.chins.mall.coupon.entity.SmsCoupon;
import com.chins.mall.coupon.service.ISmsCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 优惠券信息 前端控制器
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@RestController
@RequestMapping("/coupon/sms-coupon")
public class SmsCouponController {

  @Autowired
  private ISmsCouponService couponService;

  /***
   * 测试member服务远程调用
   * @return
   */
  @GetMapping("/member/list")
  public R memberCoupons() {
    SmsCoupon coupon = new SmsCoupon();
    coupon.setCouponName("满100减20");
    return R.ok(coupon);
  }

}
