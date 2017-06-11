package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.OfficeSupplies;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OfficeSuppliesDao {

    public List<OfficeSupplies> findOfficeSuppliesList();

    public OfficeSupplies findOfficeSuppliesById(int officeSuppliesId);

    public List<OfficeSupplies> findOfficeSuppliesByName(String name);

    public List<OfficeSupplies> findOfficeSuppliesByType(String type);

    public List<OfficeSupplies> findOfficeSuppliesByDesc(String desc);

    public Boolean addOfficeSupplies(OfficeSupplies officeSupplies);

    public Boolean updateOfficeSupplies(OfficeSupplies officeSupplies);

    public Boolean deleteOfficeSupplies(int officeSuppliesId);

    public Boolean addOfficeSuppliesByList(List<OfficeSupplies> officeSupplies);
}