package com.example.lab1

import kotlin.random.Random

class NumberList {
    private var numbers: List<Int> = List(10) { Random.nextInt(1, 100) }

    private fun getCountAndUpdateList(num: Int): Int {
        val count = numbers.count {it > num}
        numbers = numbers.map{if(it > num) num else it}

        return count
    }

    fun getBasicListToText(): String {
        return "Исходный список: " + numbers.joinToString()
    }

    fun getUpdatedListToText(num: Int): String {
        return getBasicListToText() + "\n" +
                "Кол-во заменных чисел: " + getCountAndUpdateList(num) + "\n"+
                "Измененный список: " + numbers.joinToString()
    }
}