package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.WeeklyWork;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/27 0027.
 */
public interface WeeklyWorkService {

    public List<WeeklyWork> getWeeklyWorks();

    public WeeklyWork getWeeklyWorkById(int weeklyWorkId);

    // 根据负责人查询每周任务情况
    public List<WeeklyWork> getWeeklyWorksByMId(int managerId);

    // 根据新成员查询每周任务情况
    public List<WeeklyWork> getWeeklyWorksByTId(int traineeId);

    public Boolean saveWeeklyWork(WeeklyWork weeklyWork);

    public Boolean removeWeeklyWork(int weekyWorkId);
}
