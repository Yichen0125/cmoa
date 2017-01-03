package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Protash;
import java.util.List;

public interface ProtashMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Protash record);

    Protash selectByPrimaryKey(Integer id);

    List<Protash> selectAll();

    int updateByPrimaryKey(Protash record);
}