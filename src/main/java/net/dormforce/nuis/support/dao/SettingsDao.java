package net.dormforce.nuis.support.dao;

import net.dormforce.nuis.support.pojo.Settings;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SettingsDao {

    public List<Settings> findAllSettings();

    public Settings findSettingByCode(String settingCode);

    public Boolean addSettings(Settings settings);

    public Boolean updateSettings(Settings settings);

    public Boolean deleteSettings(String settingCode);

}