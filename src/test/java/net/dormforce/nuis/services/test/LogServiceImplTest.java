package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.LogServiceImpl;
import net.dormforce.nuis.support.pojo.Log;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by ZhangJianshun on 2017/4/27 0027.
 */
public class LogServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private LogServiceImpl logService = (LogServiceImpl) applicationContext.getBean("logService");

    private Log log;

    {
        log = new Log();
        log.setActor("aa");
        log.setInfo("asd");
        log.setStatus("Y");
        log.setType("type");
    }

    @Test
    public void getLogs() throws Exception {
        System.out.println(logService.getLogs());
    }

    @Test
    public void getLogsByUser() throws Exception {
        System.out.println(logService.getLogsByUser("aa"));
    }

    @Test
    public void getLogById() throws Exception {
        System.out.println(logService.getLogById(1));
    }

    @Test
    public void saveLog() throws Exception {
        System.out.println(logService.saveLog(log));
    }

    @Test
    public void removeLog() throws Exception {
        System.out.println(logService.removeLog(2));
    }
}