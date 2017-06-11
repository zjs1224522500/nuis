/*
 * 网络管理委员会信息管理系统 ( NetUnion Information System )
 * Copyright (c) 2017.
 */

package net.dormforce.nuis.controller;

import net.dormforce.nuis.support.pojo.Position;
import net.dormforce.nuis.service.PositionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: Json 控制器
 * Author: liuwenzhe
 * Date: 2017/4/19, 星期三
 */
@RestController
@Controller
public class JsonController {

    @Autowired
    private PositionService positionService;

    @RequestMapping("json/{positionCode}")
    public Position getJson(@PathVariable String positionCode){

        return positionService.getPosition(positionCode);
    }
}
