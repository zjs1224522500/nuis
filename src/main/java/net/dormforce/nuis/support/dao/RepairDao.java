package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.Repair;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RepairDao {

    public List<Repair> findRepairs();

    public Repair findRepairById(int repairId);

    public Boolean addRepair(Repair repair);

    public Boolean updateRepair(Repair repair);

    public Boolean deleteRepair(int repairId);
}