package com.mail.product.dao;

import com.mail.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-09 20:43:09
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
