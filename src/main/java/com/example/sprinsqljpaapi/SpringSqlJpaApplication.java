package com.example.sprinsqljpaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@EnableSwagger2
public class SpringSqlJpaApplication {

//    private static final Logger log = LoggerFactory.getLogger(SprinsqljpaApiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringSqlJpaApplication.class, args);
    }
//    @Bean
//    public Docket postsApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo()).select().build();
//    }
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("simplifyingtech API")
//                .description("simplifyingtech API for developers")
//                .termsOfServiceUrl("https://simplifyingtechcode.wordpress.com/")
//                .licenseUrl("simplifyingtech@gmail.com").version("2.0").build();
    }
