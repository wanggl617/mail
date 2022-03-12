package com.mail.member.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.mail.member.feign.CouponFeignService;
<<<<<<< HEAD
import com.mail.member.feign.Impl.CouponFeignServiceFallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
=======
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> origin/master
import org.springframework.web.bind.annotation.*;

import com.mail.member.entity.MemberEntity;
import com.mail.member.service.MemberService;
import com.mail.common.utils.PageUtils;
import com.mail.common.utils.R;

<<<<<<< HEAD
import javax.annotation.Resource;
=======
>>>>>>> origin/master


/**
 * 会员
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-10 14:41:42
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
<<<<<<< HEAD
    private final MemberService memberService;
    @Resource
    private CouponFeignService couponFeignService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

=======
    @Autowired
    private MemberService memberService;
    @Autowired
    private CouponFeignService couponFeignService;
>>>>>>> origin/master
    /**
     *  测试 调用远程服务
     */
    @GetMapping("/coupons")
<<<<<<< HEAD

    public R test_coupon(){
        return couponFeignService.membercoupon();
//        MemberEntity memberEntity = new MemberEntity();
//        memberEntity.setNickname("我是会员");
//        R membercoupon = couponFeignService.membercoupon();
//        return R.ok().put("mebmer",memberEntity).put("coupons",membercoupon.get("coupon"));
=======
    public R test_coupon(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("我是会员");
        R membercoupon = couponFeignService.membercoupon();
        return R.ok().put("memver",memberEntity).put("coupons",membercoupon.get("coupon"));
>>>>>>> origin/master
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
