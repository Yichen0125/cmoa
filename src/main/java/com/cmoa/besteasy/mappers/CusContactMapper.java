package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.CusContact;
import java.util.List;

public interface CusContactMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CusContact record);

    CusContact selectByPrimaryKey(Integer id);

    List<CusContact> selectAll();

    int updateByPrimaryKey(CusContact record);
}