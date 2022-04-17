package com.nowger.admin.security;


import com.alibaba.fastjson.JSON;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class JsonWebToken {
    public static void main(String[] args) {
        //模拟从前端获得的密码
        String password = "123456";
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String newPassword = bCryptPasswordEncoder.encode(password);
        System.out.println("加密的密码为: "+newPassword);
        boolean same_password_result = bCryptPasswordEncoder.matches(password,newPassword);
        //返回true
        System.out.println("相同代码对比: "+same_password_result);
        boolean other_password_result = bCryptPasswordEncoder.matches("1234456",newPassword);
        //返回false
        System.out.println("其他密码对比: " + other_password_result);
    }

}
