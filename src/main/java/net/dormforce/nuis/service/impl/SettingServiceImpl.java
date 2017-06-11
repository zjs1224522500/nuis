package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.SettingService;
import net.dormforce.nuis.support.dao.SettingsDao;
import net.dormforce.nuis.support.pojo.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/24 0024.
 */
@Service("settingService")
public class SettingServiceImpl implements SettingService {

    @Autowired
    private SettingsDao settingsDao;

    @Override
    public List<Settings> getAllSettings() {
        return settingsDao.findAllSettings();
    }

    @Override
    public Settings getSettingByCode(String code) {
        return settingsDao.findSettingByCode(code);
    }

    @Override
    public Boolean saveSettings(Settings settings) {
        return settingsDao.addSettings(settings);
    }

    @Override
    public Boolean updateSettings(Settings settings) {
        return settingsDao.updateSettings(settings);
    }

    @Override
    public Boolean removeSettings(String settingCode) {
        return settingsDao.deleteSettings(settingCode);
    }
}
