package vn.udn.ute.week08.s2415053122226.helper

object HocPhanHelper {
    fun kiemTraTenHocPhan(ten: String): Boolean {
        val tenTrim = ten.trim()
        return tenTrim.length in 1..40
    }
    fun kiemTraDiem(diemStr: String): Double? {
        val diem = diemStr.trim().toDoubleOrNull() ?: return null
        if (diem.isNaN() || diem.isInfinite()) return null
        if (diem < 0.0 || diem >10.0) return null
        return diem
    }
    fun tinhDiemTongKet(qt: Double, ck: Double) {
        return 0.4 * qt +0.6 * ck
    }
    fun xepLoai(t: Double, ck: Double): String {
        return if (t >= 5.0 && ck >= 3.0) "Đạt" else "Chưa đạt"
    }
}