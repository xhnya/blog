package com.xhnya.blog.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author xhn
 * @data 2021/2/1 - 19:32
 */
public interface OssService {
    String uploadFileAvatar(MultipartFile file);
}
