package com.jk.service;

import com.jk.mapper.StaffMapper;
import com.jk.model.Staff;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StaffServiceImpl implements StaffServiceF {

    @Resource
    private StaffMapper staffMapper;

    @Override
    public List<Staff> queryStaff(Staff staff) {
        return staffMapper.queryStaff(staff);
    }

    @Override
    public void addStaff(Staff staff) {
        staffMapper.addStaff(staff);
    }

    @Override
    public void delStaff(String id) {
        String[] idsArr = id.split(",");
        Map m = new HashMap();
        m.put("idsArr",idsArr);
        staffMapper.delStaff(m);
    }
}
