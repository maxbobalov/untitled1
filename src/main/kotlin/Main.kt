package org.example

import java.time.Duration
import kotlin.random.Random
import kotlin.io.readln as readln

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val spisok = mutableListOf(1, 2, 2, 4)
    if (spisok.contains(6) == true)
    {
        println("правда")
    }
    else{
        println("loz")
    }
    println(spisok.reverse())
    }

