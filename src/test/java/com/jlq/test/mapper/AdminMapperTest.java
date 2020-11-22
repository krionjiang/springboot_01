package com.jlq.test.mapper;

import com.jlq.Application;
import com.jlq.domain.Admin;
import com.jlq.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @author ：jlq
 * @date ：Created in 2020/11/21 11:22
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AdminMapperTest {

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void testAdd(){
        Admin admin = new Admin();
        admin.setName("玩尼玛");
        admin.setCreatTime(new Date());
        admin.setPassword("1223");
        admin.setRemake("卢本伟牛逼");
        adminMapper.insert(admin);
        System.out.println(admin);

    }

    @Test
    public void testFindAll(){
        List<Admin> admins = adminMapper.selectAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }
}


