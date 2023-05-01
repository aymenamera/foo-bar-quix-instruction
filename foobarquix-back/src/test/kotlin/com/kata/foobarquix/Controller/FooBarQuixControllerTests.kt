package com.kata.foobarquix

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.*


@SpringBootTest
@AutoConfigureMockMvc
internal class FooBarQuixControllerTest @Autowired constructor(
		val mockMvc: MockMvc,
		val objectMapper: ObjectMapper
) {
	val baseUrl = "/foo-bar-quix"

	@Nested
	@DisplayName("GET /foo-bar-quix/{inputNumber}")
	@TestInstance(TestInstance.Lifecycle.PER_CLASS)
	inner class GetBank {
		@Test
		fun `1234 should return Foo`() {
			// given
			val inputNumber = 1234
			// when/then
			mockMvc.get("$baseUrl/$inputNumber")
					.andDo { print() }
					.andExpect {
						status { isOk() }
						content { contentType(MediaType.APPLICATION_JSON) }
						jsonPath("$.result") { value("Foo") }
					}
		}


		@Test
		fun `15 should return FooBarBar`() {
			// given
			val inputNumber = 15
			// when/then
			mockMvc.get("$baseUrl/$inputNumber")
					.andDo { print() }
					.andExpect {
						status { isOk() }
						content { contentType(MediaType.APPLICATION_JSON) }
						jsonPath("$.result") { value("FooBarBar") }
					}
		}

		@Test
		fun `7 should return Quix`() {
			// given
			val inputNumber = 7
			// when/then
			mockMvc.get("$baseUrl/$inputNumber")
					.andDo { print() }
					.andExpect {
						status { isOk() }
						content { contentType(MediaType.APPLICATION_JSON) }
						jsonPath("$.result") { value("Quix") }
					}
		}

	}
}