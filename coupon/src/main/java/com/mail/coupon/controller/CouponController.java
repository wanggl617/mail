package com.mail.coupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.mail.coupon.entity.CouponEntity;
import com.mail.coupon.service.CouponService;
import com.mail.common.utils.PageUtils;
import com.mail.common.utils.R;



/**
 * 优惠券信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-10 14:07:33
 */
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {

    @Value("${feign.hystrix.enabled}")
    String hystrixTime;

    @GetMapping("test_nacosConfigs")
    public R nacos_config(){
        return R.ok().put("hystrix",hystrixTime);
    }

    @Autowired
    private CouponService couponService;
    @GetMapping("/member/list")
    public R membercoupon(){
        CouponEntity couponEntity = new CouponEntity();

        couponEntity.setCouponName("八折");
        return R.ok().put("coupon",Arrays.asList(couponEntity));
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
