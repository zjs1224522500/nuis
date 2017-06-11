package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.WeeklyReport;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface WeeklyReportDao {

    public List<WeeklyReport> findWeeklyReports();

    public WeeklyReport findWeeklyReportById(int reportId);

    // 根据新成员编号查询每周学习报告
    public List<WeeklyReport> findWeeklyReportsByTid(int traineeId);

    public Boolean addWeeklyReport(WeeklyReport weeklyReport);

    public Boolean updateWeeklyReport(WeeklyReport weeklyReport);

    public Boolean deleteWeeklyReport(int reportId);
}