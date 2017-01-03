package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Cuscontact;
import java.util.List;
import java.util.Map;

public interface CuscontactMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cuscontact record);

    Cuscontact selectByPrimaryKey(Integer id);

    List<Cuscontact> selectAll();

    int updateByPrimaryKey(Cuscontact record);

	List<Cuscontact> selectPage(Map<String, Object> myBatisParmas);
}