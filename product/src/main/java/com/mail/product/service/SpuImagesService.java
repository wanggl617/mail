package com.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mail.common.utils.PageUtils;
import com.mail.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-09 20:43:09
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

