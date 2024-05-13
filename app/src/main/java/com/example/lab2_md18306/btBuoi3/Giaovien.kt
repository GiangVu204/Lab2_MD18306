package com.example.lab2_md18306.btBuoi3.Bai7


fun main() {
    val giaoVien1 = Nguoi("Nguyễn Văn An", 35, "Hà Nội", "GV001")
    val giaoVien2 = Nguoi("Trần Thị Hương", 40, "Hồ Chí Minh", "GV002")

    val cbgv1 = CBGV(giaoVien1, 5000.0, 500.0, 200.0)
    val cbgv2 = CBGV(giaoVien2, 6000.0, 700.0, 300.0)

    themCBGV(cbgv1)
    themCBGV(cbgv2)

    println("Lương thực lĩnh của giáo viên 1: ${cbgv1.tinhLuongThucLinh()}")
    println("Lương thực lĩnh của giáo viên 2: ${cbgv2.tinhLuongThucLinh()}")

    xoaCBGV("GV002")
    println("Danh sách cán bộ giáo viên sau khi xóa:")
    danhSachCBGV.forEach { println(it.nguoi.hoTen) }
}


private val danhSachCBGV = mutableListOf<CBGV>()

fun themCBGV(cbgv: CBGV) {
    danhSachCBGV.add(cbgv)
}

fun xoaCBGV(maSoGiaoVien: String) {
    danhSachCBGV.removeIf { it.nguoi.maSoGiaoVien == maSoGiaoVien }
}

class Giaovien {
}