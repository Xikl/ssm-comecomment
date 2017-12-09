package com.ximo.controller.content;

import com.ximo.dto.AdDTO;
import com.ximo.enums.PageCodeEnum;
import com.ximo.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: 朱文赵
 * @date: 2017/11/27
 */
@Controller
@RequestMapping("/ad")
public class AdController {

    @Autowired
    private AdService adService;

    @GetMapping
    public String init(){
        return "content/adList";
    }

    @GetMapping("/addInit")
    public String addInit(){
        return "content/adAdd";
    }

    @PostMapping("/add")
    public String add(AdDTO adDTO, Model model){
        if (adService.add(adDTO)) {
            model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.ADD_SUCCESS.getMsg());
        } else {
            model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.ADD_FAIL.getMsg());
        }
        return "content/adAdd";
    }
}
