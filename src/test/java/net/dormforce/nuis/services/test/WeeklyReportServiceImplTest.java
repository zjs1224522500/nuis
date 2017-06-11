package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.WeeklyReportService;
import net.dormforce.nuis.service.impl.WeeklyReportServiceImpl;
import net.dormforce.nuis.support.pojo.WeeklyReport;
import net.dormforce.nuis.support.util.TimeUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by ZhangJianshun on 2017/4/26 0026.
 */
public class WeeklyReportServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private WeeklyReportServiceImpl weeklyReportService = (WeeklyReportServiceImpl) applicationContext.getBean("weeklyReportService");

    private WeeklyReport weeklyReport;

    {
        weeklyReport = new WeeklyReport();
        weeklyReport.setCreateTime(TimeUtil.getFormatTime());
        weeklyReport.setStatus("Y");
        weeklyReport.setSubject("完成");
        weeklyReport.setTitle("第一周");
        weeklyReport.setTraineeId(2);
    }

    @Test
    public void getWeeklyReports() throws Exception {
        System.out.println(weeklyReportService.getWeeklyReports());
    }

    @Test
    public void getWeeklyReportById() throws Exception {
        System.out.println(weeklyReportService.getWeeklyReportById(1));
    }

    @Test
    public void getWeeeklyReportByT() throws Exception {
        System.out.println(weeklyReportService.getWeeeklyReportByT(2));
    }

    @Test
    public void saveWeeklyReport() throws Exception {
        weeklyReport.setWeeklyReportId(2);
        weeklyReport.setTitle("你好");
        System.out.println(weeklyReportService.saveWeeklyReport(weeklyReport));
    }

    @Test
    public void removeWeeklyReport() throws Exception {
        System.out.println(weeklyReportService.removeWeeklyReport(2));
    }

}