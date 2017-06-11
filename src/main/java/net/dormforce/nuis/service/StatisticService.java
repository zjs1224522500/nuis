package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.Statistic;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/27 0027.
 */
public interface StatisticService {

    public List<Statistic> getStatistic();

    public Statistic getStatisticById(int statisticId);

    public Boolean saveStatistic(Statistic statistic);

    public Boolean removeStatistic(int statisticId);
}
