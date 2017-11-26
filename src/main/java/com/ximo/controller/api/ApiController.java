package com.ximo.controller.api;

import com.ximo.domain.Ad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: apiController
 * @author: 朱文赵
 * @date: 2017/11/26
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/homead")
    public String homead(){
        return "你好";
    }


}
