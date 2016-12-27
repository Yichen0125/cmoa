package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Department;
import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    Department selectByPrimaryKey(Integer id);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);

	long getTotal();

	int getDeptByName(String deptName);
}