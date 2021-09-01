package com.heima.wemedia.service;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.pojos.WmUser;

/**
 * @author: tang
 * @date: Create in 21:39 2021/8/30
 * @description:
 */
public interface WmUserService {

    /**
     * 保存自媒体用户
     * @param wmUser
     * @return
     */
    ResponseResult save(WmUser wmUser);

    /**
     * 根据自媒体用户名查询
     * @param name
     * @return
     */
    WmUser findByName(String name);
}