@file:Suppress("DEPRECATION")

package com.curso.android.app.practica.uno

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testButtonClick() {
        // Espera a que el botón sea visible y realiza un clic en él
        onView(withId(R.id.compareButton)).perform(click())

        // Verifica que el TextView tenga el texto esperado después del clic
        onView(withId(R.id.resultTextView)).check(matches(withText("Texto esperado")))
    }
}