package com.chins.mall.member.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.chins.mall.member.entity.UmsMember;
import com.chins.mall.member.feign.SmsCouponFeignService;
import com.chins.mall.member.service.IUmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员 前端控制器
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@RestController
@RequestMapping("/member/ums-member")
public class UmsMemberController {

    @Autowired
    private SmsCouponFeignService couponFeignService;


    @GetMapping("/member/all-coupons")
    public R getMemberAllCoupons() {
        UmsMember member = new UmsMember();
        member.setNickname("张三");
        R r = couponFeignService.memberCoupons();
        r.ok(member);
        return r;
    }
}
