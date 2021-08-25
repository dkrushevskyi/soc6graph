package com.soc6graph.socgraph;

import com.soc6graph.socgraph.config.FacebookSettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(FacebookSettings.class)
public class SocgraphApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocgraphApplication.class, args);
    }

}
