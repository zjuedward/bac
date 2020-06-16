package com.uad.infocenter.bac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统页面视图
 */
@Controller
public class SysPageController {


    @RequestMapping("{url}.html")
    public String module(@PathVariable("url") String url){
        return "/" + url;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("test.html")
    public String test() {
        return "test";
    }

    @RequestMapping("pdf/web/viewer.html")
    public String pdf() {
        return "pdf/web/viewer";
    }

}
