package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.Repair;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/23 0023.
 */
public interface RepairService {

    public List<Repair> getRepairs();

    public Repair getRepairById(int repairId);

    public Boolean saveRepair(Repair repair);

    public Boolean removeRepair(int repairId);
}
