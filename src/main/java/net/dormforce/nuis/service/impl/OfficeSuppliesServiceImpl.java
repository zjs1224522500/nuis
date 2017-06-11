package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.OfficeSuppliesService;
import net.dormforce.nuis.support.dao.OfficeSuppliesDao;
import net.dormforce.nuis.support.pojo.OfficeSupplies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/22 0022.
 */
@Service("officeSuppliesService")
public class OfficeSuppliesServiceImpl implements OfficeSuppliesService{

    @Autowired
    private OfficeSuppliesDao officeSuppliesDao;

    @Override
    public List<OfficeSupplies> getOfficeSuppliesList() {
        return officeSuppliesDao.findOfficeSuppliesList();
    }

    @Override
    public OfficeSupplies getOfficeSuppliesById(int officeSuppliesId) {
        return officeSuppliesDao.findOfficeSuppliesById(officeSuppliesId);
    }

    @Override
    public List<OfficeSupplies> getOfficeSuppliesByName(String name) {
        return officeSuppliesDao.findOfficeSuppliesByName(name);
    }

    @Override
    public List<OfficeSupplies> getOfficeSuppliesByType(String type) {
        return officeSuppliesDao.findOfficeSuppliesByType(type);
    }

    @Override
    public List<OfficeSupplies> getOfficeSuppliesByDesc(String description) {
        return officeSuppliesDao.findOfficeSuppliesByDesc(description);
    }

    @Override
    public Boolean saveOfficeSupplies(OfficeSupplies officeSupplies) {
        if(officeSupplies.getOfficeSuppliesId() != null){
            return officeSuppliesDao.updateOfficeSupplies(officeSupplies);
        }else {
            return officeSuppliesDao.addOfficeSupplies(officeSupplies);
        }
    }

    @Override
    public Boolean removeOfficeSupplies(int officeSuppliesId) {
        return officeSuppliesDao.deleteOfficeSupplies(officeSuppliesId);
    }

    @Override
    public Boolean importOfficeSuppliesFromFile(List<OfficeSupplies> officeSupplies) {
        return officeSuppliesDao.addOfficeSuppliesByList(officeSupplies);
    }
}
