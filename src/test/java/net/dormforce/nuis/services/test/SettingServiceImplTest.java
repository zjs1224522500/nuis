package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.SettingServiceImpl;
import net.dormforce.nuis.support.pojo.Settings;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Created by ZhangJianshun on 2017/4/24 0024.
 */
public class SettingServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private SettingServiceImpl settingService = (SettingServiceImpl) applicationContext.getBean("settingService");

    private Settings settings;

    {
        settings = new Settings();
        settings.setSettingsCode("set-1");
        settings.setName("settings1");
        settings.setStatus("Y");
        settings.setType("type1");
        settings.setValue("value1");
    }

    @Test
    public void getAllSettings() throws Exception {
        System.out.println(settingService.getAllSettings());
    }

    @Test
    public void getSettingByCode() throws Exception {
        System.out.println(settingService.getSettingByCode("set-1"));
    }

    @Test
    public void saveSettings() throws Exception {
        System.out.println(settingService.saveSettings(settings));
        System.out.println(settingService.updateSettings(settings));
    }

    @Test
    public void removeSettings() throws Exception {
        System.out.println(settingService.removeSettings("set-2"));
    }

}