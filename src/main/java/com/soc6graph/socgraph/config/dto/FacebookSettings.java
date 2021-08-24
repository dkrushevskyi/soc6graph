package com.soc6graph.socgraph.config.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.social.facebook")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FacebookSettings {

    private String appId;
    private String appSecret;
}
