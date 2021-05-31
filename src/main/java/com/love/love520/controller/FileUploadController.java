package com.love.love520.controller;

import com.love.love520.utils.FileUploadUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping(value = "/upload")
@CrossOrigin
public class FileUploadController {
    @PostMapping(value = "/upload")
    // @RequestParam中的file名应与前端的值保持一致
    public String upload(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        // replaceAll 用来替换windows中的\\ 为 /
        System.out.println("访问");
        return FileUploadUtil.upload(multipartFile).replaceAll("\\\\", "/");
    }

}
