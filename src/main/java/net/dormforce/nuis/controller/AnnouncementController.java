package net.dormforce.nuis.controller;

import net.dormforce.nuis.service.AnnouncementService;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/4/19 0019.
 */
@Controller
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    @RequestMapping("test")
    public String test(){
        System.out.println(announcementService.getAnnouncements());
        return "success";
    }
}
