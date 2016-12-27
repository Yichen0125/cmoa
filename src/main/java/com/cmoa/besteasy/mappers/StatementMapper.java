package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Statement;
import java.util.List;

public interface StatementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Statement record);

    Statement selectByPrimaryKey(Integer id);

    List<Statement> selectAll();

    int updateByPrimaryKey(Statement record);
}