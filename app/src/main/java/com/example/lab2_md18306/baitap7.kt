package com.example.lab2_md18306

fun main(){
    var number = mutableListOf (1, 2, 3)
    val nums = listOf(1, 2, 3, 4, 5, 6, 7)

    println("Danh sách số là ${number}")

    number.add(6)
    number.remove(3)
    number[1] = 10

    nums.forEach{
        println("The number is $it")
    }

    println(nums.filter { it > 4 })

}

class baitap7 {
}