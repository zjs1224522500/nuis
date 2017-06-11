package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.StatisticServiceImpl;
import net.dormforce.nuis.support.pojo.Statistic;
import net.dormforce.nuis.support.util.TimeUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Created by ZhangJianshun on 2017/4/27 0027.
 */
public class StatisticServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private StatisticServiceImpl statisticService = (StatisticServiceImpl) applicationContext.getBean("statisticService");

    private Statistic statistic;

    {
        statistic = new Statistic();
        statistic.setCreateTime(TimeUtil.getFormatTime());
        statistic.setSubject("subject1");
        statistic.setType("type1");
    }

    @Test
    public void getStatistic() throws Exception {
        System.out.println(statisticService.getStatistic());
    }

    @Test
    public void getStatisticById() throws Exception {
        System.out.println(statisticService.getStatisticById(1));
    }

    @Test
    public void saveStatistic() throws Exception {
        statistic.setStatisticId(2);
        statistic.setType("类型");
        System.out.println(statisticService.saveStatistic(statistic));
    }

    @Test
    public void removeStatistic() throws Exception {
        System.out.println(statisticService.removeStatistic(2));
    }
}
