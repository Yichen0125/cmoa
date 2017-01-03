package com.cmoa.besteasy.mappers;

import com.cmoa.besteasy.entities.Invoices;
import java.util.List;

public interface InvoicesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Invoices record);

    Invoices selectByPrimaryKey(Integer id);

    List<Invoices> selectAll();

    int updateByPrimaryKey(Invoices record);
}