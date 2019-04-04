package com.caihao.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author CaiHao
 * @create 2019-03-26 下午 19:44:20
 */
@Controller
public class TestController {


    @RequestMapping("/t1")
    public String init(){
        System.err.println("=====zoudaozhegli=====");
        return "index";

    }



    @RequestMapping("/t2")
    public ModelAndView  init2(ModelAndView mv){

        mv.addObject("c1","访问者");
        mv.setViewName("redirect:/caihao");

        return mv;

    }


    @RequestMapping("/caihao")
    public String init3(){
        System.err.println("=====zoudaozhegli===2==");
        return "caihao";

    }

    @RequestMapping("/tm")
    public String maptest(Map<String,Object> map){

        map.put("name","蔡浩");
        map.put("gender","男");

        return "mapTest";
    }


}
