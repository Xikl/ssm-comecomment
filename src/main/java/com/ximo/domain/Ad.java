package com.ximo.domain;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: 朱文赵
 * @date: 2017/11/25
 */
@Data
public class Ad {

    /** 广告id*/
    private Integer adId;

    /** 广告标题*/
    private String adTitle;

    /** 广告图片名称*/
    private String adImg;

    /** 广告链接*/
    private String adLink;

    /** 广告权重 据此来排名*/
    private Integer adWight;

    /** 广告创建时间*/
    private Date createTime;

    /** 广告修改时间*/
    private Date modifiedTime;

}
