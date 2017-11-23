package com.thrstones.web.controller;

import com.thrstones.bean.Demo;
import com.thrstones.bean.NovelInfo;
import com.thrstones.services.DemoService;
import com.thrstones.services.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/11/22.
 */
@Controller
@RequestMapping("/novel")
public class NovelController {

    @Autowired
    NovelService novelService;

    /**
     * 返回所有Novel List
     */
    @RequestMapping("/novelList")
    @ResponseBody
    public List<NovelInfo> novelList() {
        return novelService.findAll();
    }
    /**
     * 返回novel
     */
    @RequestMapping("/getNovelById")
    @ResponseBody
    public NovelInfo getNovelById(@RequestParam(value = "novelId", required = true) int novelId) {
        return novelService.findOne(novelId);
    }
}
