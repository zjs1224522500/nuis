package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.StockServiceImpl;
import net.dormforce.nuis.support.pojo.Stock;
import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by ZhangJianshun on 2017/4/24 0024.
 */
public class StockServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private StockServiceImpl stockService = (StockServiceImpl) applicationContext.getBean("stockService");

    private Stock stock;

    {
        stock = new Stock();
        stock.setStatus("Y");
        stock.setSurplus("9");
        stock.setTotalCount("10");
        stock.setOfficeSuppliesId(2);
    }

    @Test
    public void getStocks() throws Exception {
        System.out.println(stockService.getStocks());
    }

    @Test
    public void getStockById() throws Exception {
        System.out.println(stockService.getStockById(1));
    }

    @Test
    public void getStockBySupplyId() throws Exception {
        System.out.println(stockService.getStockBySupplyId(1));
    }

    @Test
    public void saveStock() throws Exception {
        stock.setStockId(2);
        stock.setStatus("N");
        System.out.println(stockService.saveStock(stock));
    }

    @Test
    public void removeStock() throws Exception {
        System.out.println(stockService.removeStock(2));
    }

}