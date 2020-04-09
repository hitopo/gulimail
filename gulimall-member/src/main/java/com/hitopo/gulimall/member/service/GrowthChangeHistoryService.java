package com.hitopo.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hitopo.common.utils.PageUtils;
import com.hitopo.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author hitopo
 * @email 919832386@qq.com
 * @date 2020-04-09 15:12:03
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

