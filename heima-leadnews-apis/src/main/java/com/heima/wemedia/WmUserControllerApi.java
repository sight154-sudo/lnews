package com.heima.wemedia;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.pojos.WmUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: tang
 * @date: Create in 21:33 2021/8/30
 * @description:
 */
@Api(value = "自媒体用户管理",tags = "wemedia")
public interface WmUserControllerApi {

    /**
     * 保存自媒体用户
     * @param wmUser
     * @return
     */
    @ApiOperation("保存自媒体用户")
    ResponseResult save(WmUser wmUser);

    /**
     * 根据用户名查询自媒体用户
     * @param name
     * @return
     */
    @ApiOperation("根据用户名查询自媒体用户")
    WmUser findByName(String name);

    /**
     * 查询自媒体用户信息
     * @param id
     * @return
     */
    @ApiOperation("查询自媒体用户信息")
    public WmUser findWmUserById(@PathVariable Integer id);
}
