package com.hitopo.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hitopo.common.utils.PageUtils;
import com.hitopo.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author hitopo
 * @email 919832386@qq.com
 * @date 2020-04-09 15:31:41
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

