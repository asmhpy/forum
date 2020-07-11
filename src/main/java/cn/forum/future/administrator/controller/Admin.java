package cn.forum.future.administrator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Admin {
    @RequestMapping("/quick")
    @ResponseBody
    public String administrator(){
        return "超级管理员！";
    }

}
