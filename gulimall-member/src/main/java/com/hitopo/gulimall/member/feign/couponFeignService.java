package com.hitopo.gulimall.member.feign;

import com.hitopo.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hitopo
 * @version v1.0
 * @classname couponFeignService
 * @time 2020/4/9 16:02
 * @description 远程接口
 */
@FeignClient("gulimall-coupon")
public interface couponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    R memberCoupons();
}