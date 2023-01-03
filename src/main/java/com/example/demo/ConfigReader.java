package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfigReader {
    @Autowired
    private ApplicationSetting setting;

    public String getName(){
        return setting.getName();
    }

    public String getRegion() {
        return setting.getS3().get("region");
    }

    public String getBucket() {
        return setting.getS3().get("bucket");
    }

    public int getPort() {
        return Integer.parseInt(setting.getS3().get("port"));
    }
}
