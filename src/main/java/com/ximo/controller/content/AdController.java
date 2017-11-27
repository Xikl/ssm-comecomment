package com.ximo.controller.content;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: 朱文赵
 * @date: 2017/11/27
 */
@Controller
@RequestMapping("/ad")
public class AdController {

    @GetMapping
    public String init(){
        return "content/adList";
    }

    @GetMapping("addInit")
    public String addInit(){
        return "content/adAdd";
    }


}
