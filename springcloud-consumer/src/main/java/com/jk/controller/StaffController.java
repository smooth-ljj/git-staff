package com.jk.controller;

import com.jk.model.Staff;
import com.jk.service.StaffService;
import com.netflix.client.IResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class StaffController {

    @Resource
    private StaffService staffService;

    @RequestMapping("/toShowUser")
    public String toShowUser(){
        return "showUser";
    }

    @RequestMapping("/toAddStaff")
    public String toAddStaff(){
        return "addStaff";
    }


    @RequestMapping("/queryStaff")
    @ResponseBody
    public List<Staff> queryStaff(Staff staff, HttpServletResponse response) throws IOException {
        List<Staff> staffList = staffService.queryStaff(staff);
        if(staffList == null){
            /* 设置格式为text/json */
            response.setContentType("text/json");
            /* 设置字符集为'UTF-8' */
            response.setCharacterEncoding("UTF-8");
            PrintWriter printWriter = response.getWriter();
            printWriter.write("网络异常！！！");
            printWriter.flush();
            printWriter.close();
        }
        return staffList;
    }

    @RequestMapping("/addStaff")
    @ResponseBody
    public void addStaff(Staff staff){
        staffService.addStaff(staff);
    }

    @RequestMapping("/delStaff")
    @ResponseBody
    public void delStaff(String id){
        staffService.delStaff(id);
    }

}
