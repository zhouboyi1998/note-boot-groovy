package com.cafe.config

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

/**
 * @Project: note-boot-groovy
 * @Date: 2025/1/18 2:48
 * @Description: OpenAPI 配置类
 */
@Profile("dev")
@Configuration
@EnableKnife4j
class SwaggerConfig {

    @Bean
    OpenAPI openAPI() {
        new OpenAPI()
            .info(
                new Info()
                    .title("note-boot-groovy")
                    .description("note-boot-groovy")
                    .contact(
                        new Contact()
                            .name("zhouboyi")
                            .url("https://github.com/zhouboyi1998")
                            .email("1144188685@qq.com")
                    )
                    .termsOfService("https://github.com/zhouboyi1998/note-boot-groovy")
                    .version("version 1.0")
                    .license(
                        new License()
                            .name("MIT")
                            .url("https://opensource.org/licenses/MIT")
                    )
            )
    }
}
