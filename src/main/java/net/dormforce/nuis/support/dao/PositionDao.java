package net.dormforce.nuis.support.dao;

import net.dormforce.nuis.support.pojo.Position;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liuwenzhe on 2017/4/14.
 */
@Component
public interface PositionDao {

    public List<Position> findPositions();

    public Position findPosition(String positionCode);
}
