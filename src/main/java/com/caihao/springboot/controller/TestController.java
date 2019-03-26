package com.caihao.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

        mv.addObject("c1","他是谁？");
        mv.setViewName("redirect:/caihao");

        return mv;

    }


    @RequestMapping("/caihao")
    public String init3(){
        System.err.println("=====zoudaozhegli===2==");
        return "caihao";

    }
}
