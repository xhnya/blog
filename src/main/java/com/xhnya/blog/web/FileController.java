package com.xhnya.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author xhn
 * @data 2021/1/25 - 13:04
 */
@Controller
public class FileController {


    @GetMapping(value = "/uploads")
    public String file() {
        return "uploads";
    }

    @PostMapping(value = "/fileUpload")
    public String fileUpload(@RequestParam(value = "file") MultipartFile file,
                             Model model, HttpServletRequest request,
                             RedirectAttributes attributes) {
        if (file.isEmpty()) {
            System.out.println("文件为空空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "/usr/local/blog/upload/"; // 上传后的路径
        //  /usr/local/blog/upload
        //F://java xhn//blog//target//classes//upload//
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String urls = "http://www.xhnya.top//upload/";
        String urlName = "[![404](" + urls + fileName + " \"404\")](" + urls + fileName + " \"404\")";

        String urlSrc = "/upload/" + fileName;
        attributes.addFlashAttribute("urlSrc", urlSrc);
        attributes.addFlashAttribute("urlName", urlName);
        return "redirect:/uploads";
    }
    // [![404](http://www.xhnya.top//upload/132050a2-458f-4556-a8bd-d02b7cf37c18.jpg "404")]
    // (http://www.xhnya.top//upload/132050a2-458f-4556-a8bd-d02b7cf37c18.jpg "404")
}
