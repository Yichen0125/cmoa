package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Protask;
import java.util.List;

public interface ProtaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Protask record);

    Protask selectByPrimaryKey(Integer id);

    List<Protask> selectAll();

    int updateByPrimaryKey(Protask record);
}