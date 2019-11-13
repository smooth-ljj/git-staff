package com.jk.mapper;

import com.jk.model.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StaffMapper {
    List<Staff> queryStaff(Staff staff);

    void addStaff(Staff staff);

    void delStaff(Map m);

}


