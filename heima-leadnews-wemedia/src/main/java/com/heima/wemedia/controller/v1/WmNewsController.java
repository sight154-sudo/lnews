package com.heima.wemedia.controller.v1;

import com.heima.model.admin.dtos.NewsAuthDto;
import com.heima.model.common.dtos.PageResponseResult;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.WmNewsDto;
import com.heima.model.wemedia.dtos.WmNewsPageReqDto;
import com.heima.model.wemedia.pojos.WmNews;
import com.heima.wemedia.WmNewsControllerApi;
import com.heima.wemedia.service.WmNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: tang
 * @date: Create in 10:18 2021/9/4
 * @description: 内容管理
 */
@RestController
@RequestMapping("api/v1/news")
public class WmNewsController implements WmNewsControllerApi {

    @Autowired
    private WmNewsService wmNewsService;

    @PostMapping("list")
    @Override
    public ResponseResult findAll(@RequestBody WmNewsPageReqDto dto) {
        return wmNewsService.findAll(dto);
    }

    @PostMapping("submit")
    @Override
    public ResponseResult submitNews(@RequestBody WmNewsDto dto) {
        return wmNewsService.submitNews(dto);
    }

    @GetMapping("one/{id}")
    @Override
    public ResponseResult findOne(@PathVariable("id") Integer newsId) {
        return wmNewsService.findOne(newsId);
    }

    @GetMapping("del_news/{id}")
    @Override
    public ResponseResult deleteOne(@PathVariable("id") Integer newsId) {
        return wmNewsService.deleteOne(newsId);
    }

    @PostMapping("down_or_up")
    @Override
    public ResponseResult downOrUp(@RequestBody WmNewsDto dto) {
        return wmNewsService.downOrUp(dto);
    }

    @GetMapping("findOne/{id}")
    @Override
    public WmNews findById(@PathVariable Integer id) {
        return wmNewsService.findById(id);
    }
    /**
     * 修改文章状态
     * @param wmNews
     * @return
     */
    @PostMapping("update")
    @Override
    public ResponseResult updateWmNews(@RequestBody WmNews wmNews) {
        return wmNewsService.updateWmNews(wmNews);
    }

    /**
     * 查询需要发布的文章id
     * @return
     */
    @GetMapping("findRelease")
    @Override
    public List<Integer> findRelease() {
        //查询文章状态为4 或为8的文章信息
        return wmNewsService.findRelease();
    }

    /**
     * 查询文章详情信息包含作者信息
     * @return
     */
    @PostMapping("findList")
    @Override
    public PageResponseResult findListAndAuthorName(@RequestBody NewsAuthDto dto) {
        return wmNewsService.findListByDto(dto);
    }
    @GetMapping("/findOneAndAuthorName/{id}")
    @Override
    public ResponseResult findNewsAndAuthorNameById(@PathVariable Integer id) {
        return wmNewsService.findOneAndAuthorNameById(id);
    }

    @PostMapping("updateStatus")
    @Override
    public ResponseResult updateNewsStatus(@RequestBody NewsAuthDto dto){
        return wmNewsService.updateWmNewsStatus(dto);
    }
}
