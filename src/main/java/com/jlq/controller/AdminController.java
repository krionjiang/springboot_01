package com.jlq.controller;

import com.jlq.domain.Admin;
import com.jlq.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;

/**
 * @author ：jlq
 * @date ：Created in 2020/11/21 11:48
 */

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("adminList")
    public String list(Model model){
        List<Admin> adminList = adminService.queryList();
        model.addAttribute("list",adminList);
        return "list";
    }

//    @ResponseBody
    @RequestMapping("del/{id}")
    public String delAdmin(@PathVariable Integer id, RedirectAttributes attributes){
        //获取参数，校验参数
        if(id == null || id <0 ){
            attributes.addFlashAttribute("message","参数有误");
        }else {
            adminService.delAdmin(id);
        }
        return "redirect:../adminList"; //重定向list
    }

    @RequestMapping("edit/{id}")
    public String editAdmin(@PathVariable Integer id,Model model){
        if(id == null || id <0 ){
            model.addAttribute("message","参数有误");
            return "redirect:../adminList";
        }
        Admin admin = adminService.queryAdminById(id);
        if(admin == null){
            model.addAttribute("message","ID不存在");
            return "redirect:../adminList";
        }
        model.addAttribute("admin",admin);
        return "edit1";
    }

    @RequestMapping("commit")
    public String commit(Admin admin){
        adminService.updAdmin(admin);
        return "redirect:adminList";
    }

    @RequestMapping("{href}")
    public String href(@PathVariable String href){
        return href;
    }

    @RequestMapping("addcommit")
    public String addAdmin(Admin admin){
        admin.setCreatTime(new Date());
        adminService.addAdmin(admin);
        return "redirect:adminList";
    }

}


