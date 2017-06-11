package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.StatisticService;
import net.dormforce.nuis.support.dao.StatisticDao;
import net.dormforce.nuis.support.pojo.Statistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/27 0027.
 */
@Service("statisticService")
public class StatisticServiceImpl implements StatisticService{

    @Autowired
    private StatisticDao statisticDao;

    @Override
    public List<Statistic> getStatistic() {
        return statisticDao.findStatistic();
    }

    @Override
    public Statistic getStatisticById(int statisticId) {
        return statisticDao.findStatisticById(statisticId);
    }

    @Override
    public Boolean saveStatistic(Statistic statistic) {
        if(statistic.getStatisticId() != null){
            return statisticDao.updateStatistic(statistic);
        }else {
            return statisticDao.addStatistic(statistic);
        }
    }

    @Override
    public Boolean removeStatistic(int statisticId) {
        return statisticDao.deleteStatistic(statisticId);
    }
}
