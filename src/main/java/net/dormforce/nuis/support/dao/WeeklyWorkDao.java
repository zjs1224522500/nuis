package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.WeeklyWork;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface WeeklyWorkDao {

    public List<WeeklyWork> findWeeklyWorks();

    public WeeklyWork findWeeklyWorkById(int weeklyWorkId);

    // 根据负责人查询每周任务情况
    public List<WeeklyWork> findWeeklyWorkByMId(int managerId);

    // 根据新成员查询每周任务情况
    public List<WeeklyWork> findWeeklyWorkByTId(int traineeId);

    public Boolean addWeeklyWork(WeeklyWork weeklyWork);

    public Boolean updateWeeklyWork(WeeklyWork weeklyWork);

    public Boolean deleteWeeklyWork(int weeklyWorkId);

}