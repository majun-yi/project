package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description swagger的配置类
 * @Date 2020/10/11 13:46
 */

//@Profile({"local", "dev", "pred", "prepred"}) 配置生效环境
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("学生相关")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.demo.controller"))
                .build().apiInfo(new ApiInfoBuilder()
                        .title("学生信息")
                        .build())
                .globalOperationParameters(this.getParameterList());
    }

    @Bean
    public Docket authorizationApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.allqj.prd.warrant.ledger.infrastructure.configure.eureka.authorization.controller"))
                .paths(PathSelectors.any())
                .build()
                .groupName("权限API");
    }

    private List<Parameter> getParameterList() {
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(parameterBuilder.name("token") //参数名
                .description("请求凭证,按需传")
                .modelRef(new ModelRef("String")) // date类型
                .parameterType("header")
                .required(false) // 是否必须填
                .build());

        ParameterBuilder projectMark = new ParameterBuilder();
        parameters.add(projectMark.name("projectMark") //参数名
                .description("资源id,按需传")
                .modelRef(new ModelRef("String")) // date类型
                .parameterType("header")
                .required(false) // 是否必须填
                .build());
        return parameters;
    }
}
