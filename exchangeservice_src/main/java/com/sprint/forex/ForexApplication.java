package com.sprint.forex;

 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

 

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
@EnableFeignClients
public class ForexApplication {

 

    public static void main(String[] args) {
        SpringApplication.run(ForexApplication.class, args);
        System.out.println("Spring rinning....");
    }

       @Bean
        public Docket productApi() {
            return new Docket(DocumentationType.SWAGGER_2).select()
                    .apis(RequestHandlerSelectors.basePackage("com.sprint.forex")).build();
        }
       
       @Bean
       public RestTemplate restTemplateBean() {
    	   return new RestTemplate();
       }

 

}