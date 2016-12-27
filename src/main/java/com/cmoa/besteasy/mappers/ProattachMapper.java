package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Proattach;
import java.util.List;

public interface ProattachMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Proattach record);

    Proattach selectByPrimaryKey(Integer id);

    List<Proattach> selectAll();

    int updateByPrimaryKey(Proattach record);
}