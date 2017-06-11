/*
 * 网络管理委员会信息管理系统 ( NetUnion Information System )
 * Copyright (c) 2017.
 */

package net.dormforce.nuis.controller;

import net.dormforce.nuis.NuisConstants;
import net.dormforce.nuis.exception.NotFoundException;
import net.dormforce.nuis.support.pojo.JsonResult;
import net.dormforce.nuis.util.FileHelper;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletResponse;

/**
 * Description: 文件处理器
 * Author: liuwenzhe
 * Date: 2017/4/19, 星期三
 */
@RestController
@RequestMapping("file")
public class FileController {

    @RequestMapping("fileUpload")
    public JsonResult fileUploadDemo(@RequestParam MultipartFile file, HttpServletResponse response) throws IOException {

        if (file.isEmpty()) {
            throw new NotFoundException();
        }
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        file.transferTo(new File(getFileStoragePath(fileName)));
        return new JsonResult(0, "file upload success" + getFileStoragePath(file.getOriginalFilename()), "true");
    }

    @RequestMapping("download")
    public void fileDownloadDemo(HttpServletResponse response) throws IOException {

        Path file = Paths.get(NuisConstants.TMP_DIR, "aaa.txt");
        Files.copy(file, response.getOutputStream());

        String fileName = URLEncoder.encode("测试.txt", "UTF-8");
        response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"; filename*=utf-8''" + fileName);
    }

    /**
     * 获得文件存放路径
     */
    public String getFileStoragePath(String fileName) {
        return FileHelper.generateFilePath(NuisConstants.TMP_DIR, fileName);
    }
}
