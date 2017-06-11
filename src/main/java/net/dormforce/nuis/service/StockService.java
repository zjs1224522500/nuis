package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.Stock;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/24 0024.
 */
public interface StockService {

    public List<Stock> getStocks();

    public Stock getStockById(int stockId);

    public Stock getStockBySupplyId(int suppLiesId);

    public Boolean saveStock(Stock stock);

    public Boolean removeStock(int stockId);
}
