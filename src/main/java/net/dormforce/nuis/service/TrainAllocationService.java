package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.TrainAllocation;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/26 0026.
 */
public interface TrainAllocationService {

    public List<TrainAllocation> getTrainAllocations();

    // 根据负责人和新成员唯一确定培训分配情况
    public TrainAllocation getTrainAllocationById(int managerId,int traineeId);

    // 根据负责人查询培训分配情况
    public List<TrainAllocation> getTrainAllocationByM(int managerId);

    // 根据新成员查询培训分配情况
    public List<TrainAllocation> getTrainAllocationByT(int traineeId);

    public Boolean saveTrainAllocation(TrainAllocation trainAllocation);

    public Boolean removeTrainAllocation(int managerId,int traineeId);
}
