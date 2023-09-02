package com.curso.android.app.practica.uno

import com.curso.android.app.practica.myapplication.MainViewModel
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testCompareTexts() {
        val viewModel = MainViewModel()

        // Act: Llama a la función que quieres probar
        val result1 = viewModel.compareTexts("hello", "hello")
        val result2 = viewModel.compareTexts("hello", "world")

        // Assert: Verifica los resultados esperados
        assertEquals("Los textos son iguales", result1)
        assertEquals("Los textos son diferentes", result2)
    }
}