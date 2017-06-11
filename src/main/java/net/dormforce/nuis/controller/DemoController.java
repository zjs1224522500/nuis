package net.dormforce.nuis.controller;

import net.dormforce.nuis.service.PositionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuwenzhe on 2017/4/14.
 */
@Controller
public class DemoController {

    public static final String SUCCESS = "success";

    @Autowired
    private PositionService positionService;
    
    @RequestMapping("demo")
    public String demo(){
        System.out.println(positionService.getPositions());
        return SUCCESS;
    }

}
