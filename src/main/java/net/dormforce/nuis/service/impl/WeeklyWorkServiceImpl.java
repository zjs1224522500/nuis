package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.WeeklyWorkService;
import net.dormforce.nuis.support.dao.WeeklyWorkDao;
import net.dormforce.nuis.support.pojo.WeeklyWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/27 0027.
 */
@Service("weeklyWorkService")
public class WeeklyWorkServiceImpl implements WeeklyWorkService {

    @Autowired
    private WeeklyWorkDao weeklyWorkDao;

    @Override
    public List<WeeklyWork> getWeeklyWorks() {
        return weeklyWorkDao.findWeeklyWorks();
    }

    @Override
    public WeeklyWork getWeeklyWorkById(int weeklyWorkId) {
        return weeklyWorkDao.findWeeklyWorkById(weeklyWorkId);
    }

    @Override
    public List<WeeklyWork> getWeeklyWorksByMId(int managerId) {
        return weeklyWorkDao.findWeeklyWorkByMId(managerId);
    }

    @Override
    public List<WeeklyWork> getWeeklyWorksByTId(int traineeId) {
        return weeklyWorkDao.findWeeklyWorkByTId(traineeId);
    }

    @Override
    public Boolean saveWeeklyWork(WeeklyWork weeklyWork) {
        if(weeklyWork.getWeeklyWorkId() != null){
            return weeklyWorkDao.updateWeeklyWork(weeklyWork);
        }else {
            return weeklyWorkDao.addWeeklyWork(weeklyWork);
        }
    }

    @Override
    public Boolean removeWeeklyWork(int weekyWorkId) {
        return weeklyWorkDao.deleteWeeklyWork(weekyWorkId);
    }
}
