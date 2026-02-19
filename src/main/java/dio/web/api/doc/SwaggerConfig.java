package dio.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("FirstAPI - Rest API")
                        .description("API exemplo de uso de Spring Boot REST API")
                        .version("1.0")
                        .termsOfService("Termo de uso: Open Source")
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Licença - Sua Empresa")
                                .url("http://www.firtsapi.com.br"))
                        .contact(new Contact()
                                .name("Pedro Henrique")
                                .url("http://www.firstapi.com.br")
                                .email("pedroph.nunes05@gmail.com"))
                );
    }
}
