package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Dispatch;
import java.util.List;

public interface DispatchMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dispatch record);

    Dispatch selectByPrimaryKey(Integer id);

    List<Dispatch> selectAll();

    int updateByPrimaryKey(Dispatch record);
}