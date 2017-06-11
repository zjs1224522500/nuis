package net.dormforce.nuis.service;


import net.dormforce.nuis.support.pojo.Settings;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/24 0024.
 */
public interface SettingService {

    public List<Settings> getAllSettings();

    public Settings getSettingByCode(String code);

    public Boolean saveSettings(Settings settings);

    public Boolean updateSettings(Settings settings);

    public Boolean removeSettings(String settingCode);

}
