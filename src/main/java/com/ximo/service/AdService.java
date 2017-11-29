package com.ximo.service;

import com.ximo.dto.AdDTO;

/**
 * @description: 广告service类
 * @author: 朱文赵
 * @date: 2017/11/27
 */
public interface AdService {

    /**
     * 插入广告
     * @param adDTO
     * @return
     */
    boolean add(AdDTO adDTO);



}
