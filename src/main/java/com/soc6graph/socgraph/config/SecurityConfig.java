package com.soc6graph.socgraph.config;

import com.soc6graph.socgraph.config.dto.FacebookSettings;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig {

    private final FacebookSettings facebookSettings;
}
