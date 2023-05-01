package com.kata.foobarquix.services

import org.springframework.stereotype.Component
import java.util.regex.Pattern


@Component
class FooBarQuixService {
    private val EMPTY = ""
    fun convertNumber(inputNumber: Int): String {
        var result = EMPTY

        if (isMultiplicityOf(3,inputNumber)) {
            result += "Foo"
        }

        if (isMultiplicityOf(5,inputNumber)) {
            result += "Bar"
        }

        result = isNumberContains(3, inputNumber, result);
        result = isNumberContains(5,inputNumber,result);
        result = isNumberContains(7,inputNumber,result);

        return if (isEmpty(result!!)) java.lang.String.valueOf(inputNumber) else result!!
    }
    private fun isNotZero(input: Int): Boolean {
        return input != 0
    }

    private fun isEmpty(output: String): Boolean {
        return EMPTY == output
    }


    private fun isMultiplicityOf(divider: Int, input: Int): Boolean {
        return input % divider == 0 && isNotZero(input)
    }

    private fun isNumberContains(ref: Int, input: Int, result: String): String {
        var result: String? = result
        var concatRef = ""
        when (ref) {
            3 -> concatRef = "Foo"
            5 -> concatRef = "Bar"
            7 -> concatRef = "Quix"
        }
        val matcher = Pattern.compile(Integer.toString(ref)).matcher(Integer.toString(input))
        while (matcher.find()) {
            result += concatRef
        }
        return result.toString()
    }


}