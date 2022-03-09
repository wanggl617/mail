package com.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mail.common.utils.PageUtils;
import com.mail.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-09 20:43:09
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

