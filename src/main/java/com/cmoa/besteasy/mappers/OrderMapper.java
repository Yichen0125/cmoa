package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Order;
import java.util.List;
import java.util.Map;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    Order selectByPrimaryKey(Integer id);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);

	List<Order> selectPage(Map<String, Object> myBatisParmas);
}