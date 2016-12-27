package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Orddetail;
import java.util.List;

public interface OrddetailMapper {
    int insert(Orddetail record);

    List<Orddetail> selectAll();
}