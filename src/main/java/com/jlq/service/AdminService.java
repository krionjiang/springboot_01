package com.jlq.service;

import com.jlq.domain.Admin;
import com.jlq.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：jlq
 * @date ：Created in 2020/11/21 11:39
 */

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public void addAdmin(Admin admin){
        adminMapper.insert(admin);
    }

    public void delAdmin(Integer id){
        adminMapper.deleteByPrimaryKey(id);
    }

    public void updAdmin(Admin admin){
        adminMapper.updateByPrimaryKeySelective(admin);
    }

    public List<Admin> queryList(){
        return adminMapper.selectAll();
    }

    public Admin queryAdminById(Integer id){
        return adminMapper.selectByPrimaryKey(id);
    }

}


