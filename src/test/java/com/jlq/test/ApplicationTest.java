package com.jlq.test;

import com.jlq.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author ：jlq
 * @date ：Created in 2020/11/20 20:09
 *
 * @SpringBootTest (webEnvironment = WebEnvironment.RANDOM_PORT)随机端口
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest {

    @LocalServerPort   //将本地服务端口号注入到port变量中
    private Integer port;

    private URL base;     //定义请求地址

    @Autowired
    private TestRestTemplate template;   //发送请求对象

    @Before
    public void setUp(){
        try {
            //初始化路径
            base = new URL("http://localhost:" + port+"/list");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void contextLoads(){
        //发送请求，使用TestRestTemplate对象来发送请求              请求地址          返回数据类型
        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
        //getBoy()  获取响应内容
        System.out.println(response.getBody());
    }

}


