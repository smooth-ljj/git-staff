package com.jk.service;

        import com.jk.model.Staff;
        import org.springframework.cloud.openfeign.FeignClient;
        import org.springframework.cloud.openfeign.SpringQueryMap;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@FeignClient(value = "staff-provider",fallback = StaffServiceError.class)
public interface StaffService {

    @GetMapping("/queryStaff")
    List<Staff> queryStaff(@SpringQueryMap Staff staff);

    @PostMapping("/addStaff")
    void addStaff(@RequestBody Staff staff);

    @DeleteMapping("/delStaff")
    void delStaff(@RequestParam("id") String id);

}
