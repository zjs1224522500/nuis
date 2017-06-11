package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.MeetingMinutesServiceImpl;
import net.dormforce.nuis.support.pojo.MeetingMinutes;
import net.dormforce.nuis.support.util.TimeUtil;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by ZhangJianshun on 2017/4/22 0022.
 */
public class MeetingMinutesServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private MeetingMinutesServiceImpl meetingMinutesService = (MeetingMinutesServiceImpl) applicationContext.getBean("meetingMinutesService");

    private MeetingMinutes meetingMinutes;

    {
        meetingMinutes = new MeetingMinutes();
        meetingMinutes.setCreateTime(TimeUtil.getFormatTime());
        meetingMinutes.setDeptId("1");
        meetingMinutes.setSubject("开会");
        meetingMinutes.setUserId(1);
    }

    @Test
    public void getMeetingMinutesList() throws Exception {
        System.out.println(meetingMinutesService.getMeetingMinutesList());
    }

    @Test
    public void getMeetingMinutesById() throws Exception {
        System.out.println(meetingMinutesService.getMeetingMinutesById(1));
    }

    @Test
    public void saveMeetingMinutes() throws Exception {
        meetingMinutes.setMeetingMinutesId(2);
        meetingMinutes.setDeptId("2");
        System.out.println(meetingMinutesService.saveMeetingMinutes(meetingMinutes));
    }

    @Test
    public void removeMeetingMinutes() throws Exception {
        System.out.println(meetingMinutesService.removeMeetingMinutes(2));
    }

}