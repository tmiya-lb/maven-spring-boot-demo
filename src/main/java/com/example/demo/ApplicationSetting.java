package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "com.example.demo.application")
@PropertySource(value={"classpath:demo.properties"})
public class ApplicationSetting {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Map<String,String> s3;
}
