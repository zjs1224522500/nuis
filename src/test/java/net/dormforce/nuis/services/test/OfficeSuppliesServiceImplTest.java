package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.OfficeSuppliesServiceImpl;
import net.dormforce.nuis.support.pojo.OfficeSupplies;
import net.dormforce.nuis.support.util.TimeUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ZhangJianshun on 2017/4/22 0022.
 */
public class OfficeSuppliesServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private OfficeSuppliesServiceImpl officeSuppliesService =
            (OfficeSuppliesServiceImpl)applicationContext.getBean("officeSuppliesService");

    private OfficeSupplies officeSupplies;

    {
        officeSupplies = new OfficeSupplies();
        officeSupplies.setCreateTime(TimeUtil.getFormatTime());
        officeSupplies.setDescription("Java后台");
        officeSupplies.setName("JavaWeb实战");
        officeSupplies.setStatus("free");
        officeSupplies.setType("Book");
    }

    @Test
    public void getOfficeSuppliesList() throws Exception {
        System.out.println(officeSuppliesService.getOfficeSuppliesList());
    }

    @Test
    public void getOfficeSupplies() throws Exception {
        System.out.println(officeSuppliesService.getOfficeSuppliesById(1));
        System.out.println(officeSuppliesService.getOfficeSuppliesByName("JavaScript"));
        System.out.println(officeSuppliesService.getOfficeSuppliesByType("Book"));
        System.out.println(officeSuppliesService.getOfficeSuppliesByDesc("Java后台"));
    }

    @Test
    public void saveOfficeSupplies() throws Exception {
        System.out.println(officeSuppliesService.saveOfficeSupplies(officeSupplies));
    }

    @Test
    public void removeOfficeSupplies() throws Exception {
        System.out.println(officeSuppliesService.removeOfficeSupplies(3));
    }

    @Test
    public void importOfficeSuppliesFromFile() throws Exception {
        List<OfficeSupplies> list = new ArrayList<OfficeSupplies>();
        OfficeSupplies officeSupplies2 = new OfficeSupplies();

        officeSupplies2.setCreateTime(TimeUtil.getFormatTime());
        officeSupplies2.setDescription("前端");
        officeSupplies2.setName("JavaScript");
        officeSupplies2.setStatus("free");
        officeSupplies2.setType("Book");
        officeSupplies2.setOfficeSuppliesId(3);

        officeSupplies.setOfficeSuppliesId(4);

        list.add(officeSupplies);
        list.add(officeSupplies2);

        System.out.println(officeSuppliesService.importOfficeSuppliesFromFile(list));

    }

}