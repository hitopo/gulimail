package com.hitopo.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hitopo.common.utils.PageUtils;
import com.hitopo.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author hitopo
 * @email 919832386@qq.com
 * @date 2020-04-09 15:12:03
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

