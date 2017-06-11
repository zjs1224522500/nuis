package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.Statistic;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StatisticDao {

    public List<Statistic> findStatistic();

    public Statistic findStatisticById(int statisticId);

    public Boolean addStatistic(Statistic statistic);

    public Boolean updateStatistic(Statistic statistic);

    public Boolean deleteStatistic(int statisticId);

}