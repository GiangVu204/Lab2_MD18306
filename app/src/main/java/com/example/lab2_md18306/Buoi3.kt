package com.example.lab2_md18306


fun main() {

    val soA = 5
    var soB = 10

    with(soB) {
        soB = this.inc()
        println("Số B: $soB")
    }

    val sv1 = SinhVienModel("Long", "PH11321", 8f)
    sv1.apply {
        tenSV = "Tuan"
        diemTB = 9f
    }
    println(sv1)


    val title: String? = "Buổi 3 -  Android Kotlin"
    val length = title?.run {
        if (isEmpty()) {
            0
        } else {
            length
        }
    }
    println("Độ dài chuỗi $title là $length")

    val luyThuaBac3CuaA = soA.let {
        val kq = it * it * it
        kq
    }
    println("Lũy thừa bậc 3 của $soA = " + luyThuaBac3CuaA)

    println("Tổng 2 số $soA va $soB = ${tinhTong(soA, soB)}")
    println("Tích 2 số $soA va $soB = ${phepNhan(soA, soB)}")
    println("Lũy thừa của số $soA = ${luyThua(soA)}")
    println("Thương 2 số $soA va $soB = ${phepChia(soA.toFloat(), soB.toFloat())()}")
}

val tinhTong = { soA: Int, soB: Int -> (soA + soB) }
val phepNhan: (Int, Int) -> Int = { soA: Int, soB: Int -> (soA * soB) }

val luyThua: (Int) -> Int = { it * it }

val phepChia = { soA: Float, soB: Float ->
    {
        if (soB == 0f) {
            "so bị chia phải khác 0!"
        } else {
            val kq = soA / soB
            kq
        }
    }
}
