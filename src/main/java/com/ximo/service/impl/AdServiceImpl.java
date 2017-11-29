package com.ximo.service.impl;

import com.ximo.dao.AdDao;
import com.ximo.domain.Ad;
import com.ximo.dto.AdDTO;
import com.ximo.service.AdService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @description: 实现类
 * @author: 朱文赵
 * @date: 2017/11/29
 */
@Service
@Slf4j
public class AdServiceImpl implements AdService{

    @Autowired
    private AdDao adDao;

    /** 从配置文件中加载保存路径*/
    @Value("${adImg.savePath}")
    private String adImgSavePath;

    /**
     * 插入广告
     *
     * @param adDTO
     * @return
     */
    @Override
    public boolean add(AdDTO adDTO) {
        Ad ad = new Ad();
        BeanUtils.copyProperties(adDTO, ad);
        MultipartFile imgFile = adDTO.getImgFile();
        if (imgFile != null && imgFile.getSize() > 0) {
            /*文件名*/
            String fileName = String.valueOf(System.currentTimeMillis())
                    .concat("_")
                    .concat(imgFile.getOriginalFilename());
            /*文件上传路径*/
            File file = new File(adImgSavePath.concat(fileName));
            /*文件保存路径*/
            File fileFolder = new File(adImgSavePath);
            if (!fileFolder.exists()){
                boolean mkdirs = fileFolder.mkdirs();
            }
            try {
                /*文件写入*/
                imgFile.transferTo(file);
                ad.setImgFileName(fileName);
                adDao.insert(ad);
                return true;
            } catch (IOException e) {
                log.error("【上传文件】上传文件错误， e={}", e);
                return false;
            }
        }
        return false;
    }
}
