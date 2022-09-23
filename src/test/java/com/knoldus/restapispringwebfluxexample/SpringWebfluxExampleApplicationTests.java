package com.knoldus.restapispringwebfluxexample;

import static org.mockito.Mockito.doNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.knoldus.restapispringwebfluxexample.controller.AnimalController;
import com.knoldus.webfluxexample.entity.Animal;

@SpringBootTest
class SpringWebfluxExampleApplicationTests {

	@Autowired
	private MockMvc mvc;
	private AnimalController animalController;

	@Test
	public void testAddAnimal() throws Exception {
		Animal animal = getAnimal();
		doNothing().when(animalController).saveDataIntoDatabase(animal);
		mvc.perform(post("/animal/add/"));
	}

	private Animal getAnimal() {
		Animal animal = new Animal();
		animal.setId(1560);
		animal.setName("Lion");
		animal.setAddress("Kajiranga Park");
		return animal;
	}
}
