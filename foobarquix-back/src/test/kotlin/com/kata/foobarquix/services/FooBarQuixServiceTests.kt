package com.kata.foobarquix

import com.kata.foobarquix.services.FooBarQuixService
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat


internal class FooBarQuixServiceTests {


	private val fooBarQuixService = FooBarQuixService()

	@Test
	fun `5 should return BarBar`() {
		// where
		val result =fooBarQuixService.convertNumber(5)
		// then
		assertThat(result).isEqualTo("BarBar")
	}

	@Test
	fun `7 should return Quix`() {
		// where
		val result =fooBarQuixService.convertNumber(7)
		// then
		assertThat(result).isEqualTo("Quix")
	}


	@Test
	fun `51 should return FooBar`() {
		// where
		val result =fooBarQuixService.convertNumber(51)
		// then
		assertThat(result).isEqualTo("FooBar")
	}
}

