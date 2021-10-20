package com.qizi.controller;

import com.qizi.pojo.FileNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * @author : qizidog
 * @date : 2021-10-17 16:41
 * @description : 测试
 **/

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg", "hello world!");
        return "index";
    }

    @RequestMapping("/home")
    public String homePage(Model model){
        ArrayList<FileNode> fileList = new ArrayList<>();
        fileList.add(new FileNode().setFileName("file1").setFileSize("12KB"));
        fileList.add(new FileNode().setFileName("file2").setFileSize("24KB"));
        model.addAttribute("fileList", fileList);
        return "home";
    }
}