package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.WeeklyWorkServiceImpl;
import net.dormforce.nuis.support.pojo.WeeklyWork;
import net.dormforce.nuis.support.util.TimeUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by ZhangJianshun on 2017/4/27 0027.
 */
public class WeeklyWorkServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private WeeklyWorkServiceImpl weeklyWorkService = (WeeklyWorkServiceImpl) applicationContext.getBean("weeklyWorkService");

    private WeeklyWork weeklyWork;

    {
        weeklyWork = new WeeklyWork();
        weeklyWork.setCreateTime(TimeUtil.getFormatTime());
        weeklyWork.setManagerId(1);
        weeklyWork.setTraineeId(2);
        weeklyWork.setTitle("title1");
        weeklyWork.setScore("100");
        weeklyWork.setStatus("Y");
        weeklyWork.setType("Exercise");
        weeklyWork.setSubject("subject1");
    }
    @Test
    public void getWeeklyWorks() throws Exception {
        System.out.println(weeklyWorkService.getWeeklyWorks());
    }

    @Test
    public void getWeeklyWorkById() throws Exception {
        System.out.println(weeklyWorkService.getWeeklyWorkById(1));
    }

    @Test
    public void getWeeklyWorksByMId() throws Exception {
        System.out.println(weeklyWorkService.getWeeklyWorksByMId(1));
    }

    @Test
    public void getWeeklyWorksByTId() throws Exception {
        System.out.println(weeklyWorkService.getWeeklyWorksByTId(2));
    }

    @Test
    public void saveWeeklyWork() throws Exception {
        weeklyWork.setWeeklyWorkId(2);
        weeklyWork.setType("类型");
        System.out.println(weeklyWorkService.saveWeeklyWork(weeklyWork));
    }

    @Test
    public void removeWeeklyWork() throws Exception {
        System.out.println(weeklyWorkService.removeWeeklyWork(2));
    }

}