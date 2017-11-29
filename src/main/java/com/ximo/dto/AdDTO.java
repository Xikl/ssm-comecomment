package com.ximo.dto;

import com.ximo.domain.Ad;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:
 * @author: 朱文赵
 * @date: 2017/11/27
 */
@Data
public class AdDTO extends Ad{

    /** 图片地址*/
    private String img;

    /** 上传文件*/
    private MultipartFile imgFile;


}
