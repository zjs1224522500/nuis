package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.AnnoucementServiceImpl;
import net.dormforce.nuis.support.pojo.Announcement;
import net.dormforce.nuis.support.util.TimeUtil;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by ZhangJianshun on 2017/4/19 0019.
 */
public class AnnoucementServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private AnnoucementServiceImpl annoucementService ;

    private Announcement announcement = null;

    {
        annoucementService = (AnnoucementServiceImpl) applicationContext.getBean("announcementService");
        announcement = new Announcement();
        announcement.setCreateTime(TimeUtil.getFormatTime());
        announcement.setRelUsers("zhangsan");
        announcement.setStatus("onTime");
        announcement.setSubject("你好");
        announcement.setTitle("公告1");
        announcement.setType("类型1");
        announcement.setUserId(1);
    }

    @Test
    public void getAnnouncements() throws Exception {
        System.out.println(annoucementService.getAnnouncements());
    }

    @Test
    public void getAnnouncement() throws Exception {
    }

    @Test
    public void saveAnnouncement() throws Exception {
        //System.out.println(announcement.getAnnouncementId());
        //System.out.println(annoucementService.saveAnnouncement(announcement));
//        announcement.setAnnouncementId(1);
        System.out.println(annoucementService.saveAnnouncement(announcement));
    }

    @Test
    public void removeAnnouncement() throws Exception {
        System.out.println(annoucementService.removeAnnouncement(3));
    }

}