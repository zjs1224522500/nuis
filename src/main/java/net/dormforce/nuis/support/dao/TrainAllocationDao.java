package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.TrainAllocation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TrainAllocationDao {

    public List<TrainAllocation> findTrainAllocationsList();

    // 根据负责人和新成员唯一确定培训分配情况
    public TrainAllocation findTrainAllocationById(@Param("managerId") int managerId,@Param("traineeId") int traineeId);

    // 根据负责人查询培训分配情况
    public List<TrainAllocation> findTrainAllocationByM(int managerId);

    // 根据新成员查询培训分配情况
    public List<TrainAllocation> findTrainAllocationByT(int traineeId);

    public Boolean addTrainAllocation(TrainAllocation trainAllocation);

    // 根据联合主键删除培训分配记录
    public Boolean deleteTrainAllocation(@Param("managerId") int managerId,@Param("traineeId") int traineeId);

}