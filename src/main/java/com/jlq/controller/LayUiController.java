package com.jlq.controller;

import com.jlq.domain.Admin;
import com.jlq.service.AdminService;
import com.jlq.util.LayUiCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ：jlq
 * @date ：Created in 2020/11/23 14:15
 */

@RestController
public class LayUiController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("layUiAdminList")
    public Map<String, Object> list(Model model){
        List<Admin> adminList = adminService.queryList();
        model.addAttribute("list",adminList);
        LayUiCode.ok(adminList);
        return LayUiCode.ok(adminList);
    }

    @RequestMapping("layUiAddCommit")
    public Map<String, Object> addAdmin(Admin admin){
        admin.setCreatTime(new Date());
        adminService.addAdmin(admin);
        return LayUiCode.ok();
    }

    @RequestMapping("layUiUpdateCommit")
    public Map<String, Object> commit(Admin admin){
        adminService.updAdmin(admin);
        return LayUiCode.ok();
    }

}


