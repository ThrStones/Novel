package com.thrstones.web.controller;

import com.thrstones.bean.Demo;
import com.thrstones.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by yl on 2017/7/7.
 */
@Controller
@RequestMapping("/demoRpc")
public class DemoController {

    @Autowired
    DemoService demoService1;

    /**
     * 返回所有Demo List
     */
    @RequestMapping("/demoList")
    @ResponseBody
    public List<Demo> demoList() {
        return demoService1.findAll();
    }

    /**
     * 返回demo
     */
    @RequestMapping("/getDemoById")
    @ResponseBody
    public Demo getdemoById(@RequestParam(value = "demoId", required = true) int demoId) {
        return demoService1.findOne(demoId);
    }

}
