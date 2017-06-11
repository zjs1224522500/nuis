package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.RentalRecordService;
import net.dormforce.nuis.support.dao.RentalRecordDao;
import net.dormforce.nuis.support.pojo.RentalRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/23 0023.
 */
@Service("rentalRecordService")
public class RentalRecordServiceImpl implements RentalRecordService{

    @Autowired
    public RentalRecordDao rentalRecordDao;

    @Override
    public List<RentalRecord> getRentalRecordsList() {
        return rentalRecordDao.findRentalRecordsList();
    }

    @Override
    public RentalRecord getRentalRecordById(int rentalRecordId) {
        return rentalRecordDao.findRentalRecordById(rentalRecordId);
    }

    @Override
    public List<RentalRecord> getRentalRecordByUser(int userId) {
        return rentalRecordDao.findRentalRecordsByUser(userId);
    }

    @Override
    public List<RentalRecord> getRentalRecordByStock(int stockId) {
        return rentalRecordDao.findRentalRecordsByStock(stockId);
    }

    @Override
    public Boolean saveRentalRecord(RentalRecord rentalRecord) {
        if(rentalRecord.getRentalRecordId() != null){
            return rentalRecordDao.updateRentalRecord(rentalRecord);
        }else{
            return rentalRecordDao.addRentalRecord(rentalRecord);
        }
    }

    @Override
    public Boolean removRentalRecord(int rentalRecordId) {
        return rentalRecordDao.deleteRentalRecord(rentalRecordId);
    }
}
