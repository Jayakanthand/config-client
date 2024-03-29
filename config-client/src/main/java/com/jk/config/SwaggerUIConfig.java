package com.jk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerUIConfig {
	
	 @Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	        		.apiInfo(apiInfo())
	                .select()                 
	                .apis(RequestHandlerSelectors.basePackage("com.jk.controller"))
	                .build()
	                .pathMapping("/");

}
	 
	 private ApiInfo apiInfo() {
		 return new ApiInfoBuilder().title("Config Client Demo")
				 .description("Swagger documentation for Config Client Demo")
				 .termsOfServiceUrl("www.jk.com")
				 .contact("JK")
				 .license("JK License")
				 .licenseUrl("www.jk.com")
				 .version("0.1")
				 .build();
	 }
	 
}
