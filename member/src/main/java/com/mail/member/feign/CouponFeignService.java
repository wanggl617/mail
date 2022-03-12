package com.mail.member.feign;

import com.mail.common.utils.R;

import com.mail.member.feign.Impl.CouponFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
//@Component
@FeignClient(value="mail-coupon",fallback = CouponFeignServiceFallback.class)
//告诉SpringCloud 这个模块要调用哪个远程服务
public interface CouponFeignService {

    /**
     *  声明接口的每一个方法都是调用 远程服务的哪一个请求
     * @return
     */

    //将需要调用的模块 的完整签名加入
    @GetMapping("/coupon/coupon/member/list")
    public R membercoupon();
}
