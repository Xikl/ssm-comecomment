package com.ximo.enums;

import lombok.Data;
import lombok.Getter;

/**
 * @description:
 * @author: 朱文赵
 * @date: 2017/12/9
 */
@Getter
public enum PageCodeEnum {

    /** 添加成功*/
    ADD_SUCCESS(1000, "成功"),
    /** 添加失败*/
    ADD_FAIL(1001, "失败"),
    ;

    private Integer code;
    private String msg;

    public static final String KEY = "pageCode";

    PageCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
