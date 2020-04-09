package com.hitopo.gulimall.member.dao;

import com.hitopo.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hitopo
 * @email 919832386@qq.com
 * @date 2020-04-09 15:12:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
