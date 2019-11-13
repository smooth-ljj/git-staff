package com.jk.service;

import com.jk.model.Staff;

import java.util.List;

public interface StaffServiceF {
    List<Staff> queryStaff(Staff staff);

    void addStaff(Staff staff);

    void delStaff(String id);
}
