package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@RestController
@SpringBootApplication
public class MyApplication {
    @Autowired
    private ConfigReader configReader;

    @Autowired
    private Settings settings;

    @RequestMapping("/")
    Map home() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", configReader.getName());
        map.put("s3.region", configReader.getRegion());
        map.put("s3.bucket", configReader.getBucket());
        map.put("s3.port", configReader.getPort());
        map.put("proxy.host", settings.getHost());
        map.put("proxy.port", settings.getPort());
        return map;
    }
    
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
