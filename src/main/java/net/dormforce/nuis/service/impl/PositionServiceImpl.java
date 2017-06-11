package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.support.dao.PositionDao;
import net.dormforce.nuis.support.pojo.Position;
import net.dormforce.nuis.service.PositionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuwenzhe on 2017/4/14.
 */
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionDao positionDao;

    @Override
    public List<Position> getPositions(){
        return positionDao.findPositions();
    }

    @Override
    public Position getPosition(String positionCode) {
        return positionDao.findPosition(positionCode);
    }
}
