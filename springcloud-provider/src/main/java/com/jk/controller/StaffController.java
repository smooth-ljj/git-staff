package com.jk.controller;

import com.jk.model.Staff;
import com.jk.service.StaffService;
import com.jk.service.StaffServiceF;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StaffController implements StaffService {

    @Resource
    private StaffServiceF staffServiceF;

    @GetMapping("/queryStaff")
    @ResponseBody
    @Override
    public List<Staff> queryStaff(@SpringQueryMap Staff staff) {
        return staffServiceF.queryStaff(staff);
    }

    @PostMapping("/addStaff")
    @ResponseBody
    @Override
    public void addStaff(Staff staff) {
        staffServiceF.addStaff(staff);
    }

    @DeleteMapping("/delStaff")
    @ResponseBody
    @Override
    public void delStaff(String id) {
        staffServiceF.delStaff(id);
    }
}
