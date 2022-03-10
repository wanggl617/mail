package com.mail.member.feign.Impl;

import com.mail.common.utils.R;
import com.mail.member.entity.MemberEntity;
import com.mail.member.feign.CouponFeignService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Component
public class CouponFeignServiceFallback implements CouponFeignService {


    @Override
    public R membercoupon() {
//        MemberEntity memberEntity = new MemberEntity();
//        memberEntity.setNickname("我是会员");
        return R.ok().put("coupons","服务器繁忙");
    }
}
