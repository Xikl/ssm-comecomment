package com.ximo.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: 朱文赵
 * @date: 2017/11/26
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    public String init(){
        return "system/index";
    }

}
