package br.com.apirest.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;

import br.com.apilocar.controller.VeiculoController;
import io.restassured.http.ContentType;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

@WebMvcTest
public class VeiculoControllerTest {
	

	@Autowired
	private VeiculoController veiculoController;
	
	@BeforeEach
	public void setup() {
		standaloneSetup(this.veiculoController);
	}
	
	@Test
	public void deveRetornarSucesso_QuandoBuscarVeiculo() {
		
		 given()
		.accept(ContentType.JSON)
		.when().get("/veiculo/{id}", 32L).then()
		.statusCode(HttpStatus.OK.value());
	}
	
	@Test
	public void deveRetornarSucesso_QuandoBuscarListVeiculos() {
		
		 given()
		.accept(ContentType.JSON)
		.when().get("/veiculo").then()
		.statusCode(HttpStatus.OK.value());
	}
	

}
