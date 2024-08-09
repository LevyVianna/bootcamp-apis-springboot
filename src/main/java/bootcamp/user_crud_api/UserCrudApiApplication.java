package bootcamp.user_crud_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Users API", version = "1", description = "Bootcamp DIO: CRUD /users api"))

public class UserCrudApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserCrudApiApplication.class, args);
	}
}
