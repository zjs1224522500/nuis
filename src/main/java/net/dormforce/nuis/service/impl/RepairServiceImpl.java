package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.RepairService;
import net.dormforce.nuis.support.dao.RepairDao;
import net.dormforce.nuis.support.pojo.Repair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/23 0023.
 */
@Service("repairService")
public class RepairServiceImpl implements RepairService{

    @Autowired
    private RepairDao repairDao;

    @Override
    public List<Repair> getRepairs() {
        return repairDao.findRepairs();
    }

    @Override
    public Repair getRepairById(int repairId) {
        return repairDao.findRepairById(repairId);
    }

    @Override
    public Boolean saveRepair(Repair repair) {
        if(repair.getRepairId() != null){
            return repairDao.updateRepair(repair);
        }else {
            return repairDao.addRepair(repair);
        }
    }

    @Override
    public Boolean removeRepair(int repairId) {
        return repairDao.deleteRepair(repairId);
    }
}
