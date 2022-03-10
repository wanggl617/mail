package com.mail.ware.dao;

import com.mail.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-10 15:53:14
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
