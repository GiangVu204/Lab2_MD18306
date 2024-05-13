package com.example.lab2_md18306.btBuoi3.Bai7

data class CBGV(
    val nguoi: Nguoi,
    var luongCung: Double,
    var luongThuong: Double,
    var luongPhat: Double
) {
    fun tinhLuongThucLinh(): Double {
        return luongCung + luongThuong - luongPhat
    }
}