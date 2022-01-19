package com.xhnya.blog.web;



import com.xhnya.blog.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author xhn
 * @data 2021/2/1 - 19:32
 */
@RestController
@RequestMapping("/img")
@CrossOrigin
public class OssController {

    @Autowired
    private OssService ossService;

    @PostMapping("/upload")
    public String uploadOssFile(@RequestParam(value = "file")MultipartFile file,
                                RedirectAttributes attributes){

        String url=ossService.uploadFileAvatar(file);
        attributes.addFlashAttribute("urlSrc", url);
        System.out.println(url);
        return "uploads";
    }
}
