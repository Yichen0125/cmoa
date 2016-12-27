package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Industryp;
import java.util.List;

public interface IndustrypMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Industryp record);

    Industryp selectByPrimaryKey(Integer id);

    List<Industryp> selectAll();

    int updateByPrimaryKey(Industryp record);
}