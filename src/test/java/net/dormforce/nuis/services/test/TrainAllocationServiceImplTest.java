package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.TrainAllocationServiceImpl;
import net.dormforce.nuis.support.pojo.TrainAllocation;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by ZhangJianshun on 2017/4/29 0029.
 */
public class TrainAllocationServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private TrainAllocationServiceImpl trainAllocationService = (TrainAllocationServiceImpl) applicationContext.getBean("trainAllocationService");

    private TrainAllocation trainAllocation;

    {
        trainAllocation = new TrainAllocation();
        trainAllocation.setManagerId(1);
        trainAllocation.setTraineeId(3);
    }

    @Test
    public void getTrainAllocations() throws Exception {
        System.out.println(trainAllocationService.getTrainAllocations());
    }

    @Test
    public void getTrainAllocationByM() throws Exception {
        System.out.println(trainAllocationService.getTrainAllocationByM(1));
    }

    @Test
    public void getTrainAllocationByT() throws Exception {
        System.out.println(trainAllocationService.getTrainAllocationByT(2));
    }

    @Test
    public void saveTrainAllocation() throws Exception {
        System.out.println(trainAllocationService.saveTrainAllocation(trainAllocation));
    }

    @Test
    public void removeTrainAllocation() throws Exception {
        System.out.println(trainAllocationService.removeTrainAllocation(1,2));
    }

}