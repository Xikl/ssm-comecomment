package com.ximo.dao;

import com.ximo.domain.Ad;

/**
 * @description: 广告类dao层
 * @author: 朱文赵
 * @date: 2017/11/27
 */
public interface AdDao {

    /**
     * 新增一条数据
     * @param ad
     * @return
     */
    int insert(Ad ad);

}
