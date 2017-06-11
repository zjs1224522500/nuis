package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.StockService;
import net.dormforce.nuis.support.dao.StockDao;
import net.dormforce.nuis.support.pojo.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/24 0024.
 */
@Service("stockService")
public class StockServiceImpl implements StockService{

    @Autowired
    public StockDao stockDao;

    @Override
    public List<Stock> getStocks() {
        return stockDao.findStocks();
    }

    @Override
    public Stock getStockById(int stockId) {
        return stockDao.findStockById(stockId);
    }

    @Override
    public Stock getStockBySupplyId(int suppLiesId) {
        return stockDao.findStockBySuppliesId(suppLiesId);
    }

    @Override
    public Boolean saveStock(Stock stock) {
        if(stock.getStockId() != null){
            return stockDao.updateStock(stock);
        }else{
            return stockDao.addStock(stock);
        }
    }

    @Override
    public Boolean removeStock(int stockId) {
        return stockDao.deleteStock(stockId);
    }
}
