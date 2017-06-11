package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.RepairServiceImpl;
import net.dormforce.nuis.support.pojo.Repair;
import net.dormforce.nuis.support.util.TimeUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by ZhangJianshun on 2017/4/23 0023.
 */
public class RepairServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private RepairServiceImpl repairService = (RepairServiceImpl) applicationContext.getBean("repairService");

    private Repair repair;

    {
        repair = new Repair();
        repair.setStatus("Y");
        repair.setSubject("路由器");
        repair.setType("硬件设施");
        repair.setTransactor(2);
    }

    @Test
    public void getRepairs() throws Exception {
        System.out.println(repairService.getRepairs());
    }

    @Test
    public void getRepairById() throws Exception {
        System.out.println(repairService.getRepairById(1));
    }

    @Test
    public void saveRepair() throws Exception {
        repair.setRepairId(2);
        repair.setSubject("交换机");
        System.out.println(repairService.saveRepair(repair));
    }

    @Test
    public void removeRepair() throws Exception {
        System.out.println(repairService.removeRepair(2));
    }

}