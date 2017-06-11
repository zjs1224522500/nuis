package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.RentalRecord;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/23 0023.
 */
public interface RentalRecordService {

    public List<RentalRecord> getRentalRecordsList();

    public RentalRecord getRentalRecordById(int rentalRecordId);

    public List<RentalRecord> getRentalRecordByUser(int userId);

    public List<RentalRecord> getRentalRecordByStock(int stockId);

    public Boolean saveRentalRecord(RentalRecord rentalRecord);

    public Boolean removRentalRecord(int rentalRecordId);

}
