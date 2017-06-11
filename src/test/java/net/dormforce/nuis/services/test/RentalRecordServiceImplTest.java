package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.RentalRecordServiceImpl;
import net.dormforce.nuis.support.pojo.RentalRecord;
import net.dormforce.nuis.support.util.TimeUtil;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by ZhanJianshun on 2017/4/23 0023.
 */
public class RentalRecordServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private RentalRecordServiceImpl rentalRecordService = (RentalRecordServiceImpl) applicationContext.getBean("rentalRecordService");

    private RentalRecord rentalRecord;

    {
        rentalRecord = new RentalRecord();
        rentalRecord.setCreateTime(TimeUtil.getFormatTime());
        rentalRecord.setStockId(1);
        rentalRecord.setUserId(2);
    }

    @Test
    public void getRentalRecordsList() throws Exception {
        System.out.println(rentalRecordService.getRentalRecordsList());
    }

    @Test
    public void getRentalRecordById() throws Exception {
        System.out.println(rentalRecordService.getRentalRecordById(1));
    }

    @Test
    public void getRentalRecordByUser() throws Exception {
        System.out.println(rentalRecordService.getRentalRecordByUser(2));
    }

    @Test
    public void getRentalRecordByStock() throws Exception {
        System.out.println(rentalRecordService.getRentalRecordByStock(1));
    }

    @Test
    public void saveRentalRecord() throws Exception {
        rentalRecord.setRentalRecordId(2);
        rentalRecord.setReturnTime("2017.5.11");
        System.out.println(rentalRecordService.saveRentalRecord(rentalRecord));
    }

    @Test
    public void removRentalRecord() throws Exception {
        System.out.println(rentalRecordService.removRentalRecord(3));
    }

}