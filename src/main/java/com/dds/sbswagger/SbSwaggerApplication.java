package com.dds.sbswagger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dds
 */
@SpringBootApplication
@Slf4j
public class SbSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbSwaggerApplication.class, args);
        log.info("\n----------------------------------------------------------\n\t" +
                "Application zsxc is running! Access URLs:\n\t" +
                "swagger-ui: \thttp://127.0.0.1:8080/swagger-ui.html\n\t" +
                "----------------------------------------------------------");
    }

}
