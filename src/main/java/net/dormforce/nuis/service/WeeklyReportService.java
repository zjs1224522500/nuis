package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.WeeklyReport;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/26 0026.
 */
public interface WeeklyReportService {

    public List<WeeklyReport> getWeeklyReports();

    public WeeklyReport getWeeklyReportById(int reportId);

    // 根据新成员编号查询每周学习报告
    public List<WeeklyReport> getWeeeklyReportByT(int traineeId);

    public Boolean saveWeeklyReport(WeeklyReport weeklyReport);

    public Boolean removeWeeklyReport(int reportId);
}
