/**
 * 
 */
package com.platzi.ereservation.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
<<<<<<< HEAD
 * Clase para configurar Swagger
 * @author tuzol
=======
 * Clase para configurar Swagger 
 * @author Luis Rey Jaime Calva
>>>>>>> 34c6a2375e3f4793129bbd72d61d0303fd0c4d48
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	public Docket documentation() {
<<<<<<< HEAD
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.paths(PathSelectors.any())
=======
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).paths(PathSelectors.any())
>>>>>>> 34c6a2375e3f4793129bbd72d61d0303fd0c4d48
				.build();
	}
}
