package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Cuscontact;
import java.util.List;

public interface CuscontactMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cuscontact record);

    Cuscontact selectByPrimaryKey(Integer id);

    List<Cuscontact> selectAll();

    int updateByPrimaryKey(Cuscontact record);
}