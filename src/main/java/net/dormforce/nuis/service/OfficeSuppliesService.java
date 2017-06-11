package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.OfficeSupplies;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/22 0022.
 */
public interface OfficeSuppliesService {

    public List<OfficeSupplies> getOfficeSuppliesList();

    public OfficeSupplies getOfficeSuppliesById(int officeSuppliesId);

    public List<OfficeSupplies> getOfficeSuppliesByName(String name);

    public List<OfficeSupplies> getOfficeSuppliesByType(String type);

    public List<OfficeSupplies> getOfficeSuppliesByDesc(String description);

    public Boolean saveOfficeSupplies(OfficeSupplies officeSupplies);

    public Boolean removeOfficeSupplies(int officeSuppliesId);

    public Boolean importOfficeSuppliesFromFile(List<OfficeSupplies> officeSupplies);
}
