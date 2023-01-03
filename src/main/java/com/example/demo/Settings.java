package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "com.example.demo.settings")
public class Settings {
    @Getter
    private String host;

    @Getter
    private int port;

    public void setProxy(Map<String, Object> proxy) {
        this.host = (String) proxy.get("host");
        this.port = (int) proxy.get("port");
    }
}
