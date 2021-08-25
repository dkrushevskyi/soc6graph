package com.soc6graph.socgraph.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.social.facebook")
@Getter
@Setter
public class FacebookSettings {

    private String appId;
    private String appSecret;
}
