package com.jk.service;

import com.jk.model.Staff;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class StaffServiceError implements StaffService{
    public List<Staff> queryStaff(Staff staff) {
        System.out.println("查询失败");
        return null;
    }

    public void addStaff(Staff staff) {
        System.out.println("新增失败");
    }

    public void delStaff(String id) {
        System.out.println("删除失败");
    }
}
