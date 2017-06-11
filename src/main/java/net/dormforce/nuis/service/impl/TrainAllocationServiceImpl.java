package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.TrainAllocationService;
import net.dormforce.nuis.support.dao.TrainAllocationDao;
import net.dormforce.nuis.support.pojo.TrainAllocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/26 0026.
 */
@Service("trainAllocationService")
public class TrainAllocationServiceImpl implements TrainAllocationService {

    @Autowired
    private TrainAllocationDao trainAllocationDao;

    @Override
    public List<TrainAllocation> getTrainAllocations() {
        return trainAllocationDao.findTrainAllocationsList();
    }

    @Override
    public TrainAllocation getTrainAllocationById(int managerId, int traineeId) {
        return trainAllocationDao.findTrainAllocationById(managerId,traineeId);
    }

    @Override
    public List<TrainAllocation> getTrainAllocationByM(int managerId) {
        return trainAllocationDao.findTrainAllocationByM(managerId);
    }

    @Override
    public List<TrainAllocation> getTrainAllocationByT(int traineeId) {
        return trainAllocationDao.findTrainAllocationByT(traineeId);
    }

    @Override
    public Boolean saveTrainAllocation(TrainAllocation trainAllocation) {
        return trainAllocationDao.addTrainAllocation(trainAllocation);
    }

    @Override
    public Boolean removeTrainAllocation(int managerId, int traineeId) {
        return trainAllocationDao.deleteTrainAllocation(managerId,traineeId);
    }
}
