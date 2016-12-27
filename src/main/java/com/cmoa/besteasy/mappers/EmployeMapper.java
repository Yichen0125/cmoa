package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Employe;
import java.util.List;
import java.util.Map;

public interface EmployeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employe record);

    Employe selectByPrimaryKey(Integer id);

    List<Employe> selectAll();

    int updateByPrimaryKey(Employe record);

	List<Employe> selectPage(Map<String, Object> myBatisParmas);
}