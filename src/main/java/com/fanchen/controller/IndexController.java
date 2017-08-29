package com.fanchen.controller;

import com.fanchen.mapper.TeacherMapper;
import com.fanchen.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/29.
 */

@Controller
public class IndexController {

    @Autowired
    @SuppressWarnings("all")
    TeacherMapper teacherMapper;

    @RequestMapping("/")
    public String index(Model model){
        Teacher t=teacherMapper.get(1);
        model.addAttribute("teacher",t);
        return "index";
    }
}
