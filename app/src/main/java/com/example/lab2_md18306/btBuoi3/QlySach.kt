package com.example.lab2_md18306.btBuoi3


fun main() {
    val sinhVien1 = SinhVien("Nguyen Van A", 20, "K62")
    val sinhVien2 = SinhVien("Tran Thi B", 21, "K63")

    val theMuon1 = TheMuon("M001", 10, 15, "S001", sinhVien1)
    val theMuon2 = TheMuon("M002", 12, 17, "S002", sinhVien2)

    themTheMuon(theMuon1)
    themTheMuon(theMuon2)

    hienThiThongTinTheMuon()

    xoaTheMuon("M002")

    println("Danh sách thẻ mượn sau khi xóa:")
    hienThiThongTinTheMuon()
}


private val danhSachTheMuon = mutableListOf<TheMuon>()

fun themTheMuon(theMuon: TheMuon) {
    danhSachTheMuon.add(theMuon)
}

fun xoaTheMuon(maMuon: String) {
    danhSachTheMuon.removeIf { it.maMuon == maMuon }
}

fun hienThiThongTinTheMuon() {
    danhSachTheMuon.forEach { theMuon ->
        println("Mã phiếu mượn: ${theMuon.maMuon}")
        println("Ngày mượn: ${theMuon.ngayMuon}")
        println("Hạn trả: ${theMuon.hanTra}")
        println("Số hiệu sách: ${theMuon.soHieuSach}")
        println("Họ tên: ${theMuon.sinhVien.hoTen}")
        println("Tuổi: ${theMuon.sinhVien.tuoi}")
        println("Lớp: ${theMuon.sinhVien.lop}")
        println()
    }
}



class QlySach {
}