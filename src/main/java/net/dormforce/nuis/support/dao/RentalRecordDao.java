package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.RentalRecord;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RentalRecordDao {

    public List<RentalRecord> findRentalRecordsList();

    public RentalRecord findRentalRecordById(int rentalRecordId);

    public List<RentalRecord> findRentalRecordsByUser(int userId);

    public List<RentalRecord> findRentalRecordsByStock(int stockId);

    public Boolean addRentalRecord(RentalRecord rentalRecord);

    public Boolean deleteRentalRecord(int rentalRecordId);

    public Boolean updateRentalRecord(RentalRecord rentalRecord);
}