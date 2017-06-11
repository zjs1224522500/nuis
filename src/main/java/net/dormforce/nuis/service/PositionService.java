package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.Position;

import java.util.List;

/**
 * Created by liuwenzhe on 2017/4/14.
 */
public interface PositionService {

    public List<Position> getPositions();

    public Position getPosition(String positionCode);
}
