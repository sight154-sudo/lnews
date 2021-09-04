package com.heima.model.wemedia.pojos;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: tang
 * @date: Create in 23:33 2021/9/3
 * @description: 自媒体图文内容信息表
 */
@Data
public class WmNews implements Serializable {

    private Integer id;
    /**
     *自媒体用户id
     */
    private Integer userId;
    /**
     *标题
     */
    private String title;
    /**
     *文章内容
     */
    private String content;
    /**
     *文章布局  0 无图文章 1 单图文章  3 多图文章
     */
    private Short type;
    /**
     *频道id
     */
    private Integer channelId;
    /**
     *文章内容
     */
    private String labels;
    /**
     *创建时间
     */
    private String createdTime;
    /**
     *提交时间
     */
    private String submitedTime;
    /**
     *当前状态  0 草稿   1提交（待审核） 2 审核失败  3人工审核   4人工审核通过  8 审核通过（待发布）   9 已发布
     */
    private Short status;
    /**
     *定时发布的时间
     */
    private String publishTime;
    /**
     * 拒绝理由
     */
    private String reason;
    /**
     * 文章id
     */
    private Long articleId;
    /**
     * 图片地址
     */
    private String images;
    /**
     * 是否可用
     */
    private Boolean enable;
}