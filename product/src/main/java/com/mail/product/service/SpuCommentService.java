package com.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mail.common.utils.PageUtils;
import com.mail.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-09 20:43:09
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

