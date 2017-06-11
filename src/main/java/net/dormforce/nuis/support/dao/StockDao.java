package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.Stock;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StockDao {

    public List<Stock> findStocks();

    public Stock findStockById(int stockId);

    public Stock findStockBySuppliesId(int suppliesId);

    public Boolean addStock(Stock stock);

    public Boolean updateStock(Stock stock);

    public Boolean deleteStock(int stockId);
}