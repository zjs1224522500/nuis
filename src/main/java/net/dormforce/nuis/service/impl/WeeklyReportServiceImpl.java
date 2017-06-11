package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.WeeklyReportService;
import net.dormforce.nuis.support.dao.WeeklyReportDao;
import net.dormforce.nuis.support.pojo.WeeklyReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/26 0026.
 */
@Service("weeklyReportService")
public class WeeklyReportServiceImpl implements WeeklyReportService {

    @Autowired
    private WeeklyReportDao weeklyReportDao;

    @Override
    public List<WeeklyReport> getWeeklyReports() {
        return weeklyReportDao.findWeeklyReports();
    }

    @Override
    public WeeklyReport getWeeklyReportById(int reportId) {
        return weeklyReportDao.findWeeklyReportById(reportId);
    }

    @Override
    public List<WeeklyReport> getWeeeklyReportByT(int traineeId) {
        return weeklyReportDao.findWeeklyReportsByTid(traineeId);
    }

    @Override
    public Boolean saveWeeklyReport(WeeklyReport weeklyReport) {
        if(weeklyReport.getWeeklyReportId() != null){
            return weeklyReportDao.updateWeeklyReport(weeklyReport);
        }else {
            return weeklyReportDao.addWeeklyReport(weeklyReport);
        }
    }

    @Override
    public Boolean removeWeeklyReport(int reportId) {
        return weeklyReportDao.deleteWeeklyReport(reportId);
    }
}
