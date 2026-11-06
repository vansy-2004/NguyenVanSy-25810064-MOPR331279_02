// Nguyen Van Sy - 25810064

fun main() {
    val danhSachSach = mutableListOf(
        "Đắc Nhân Tâm",
        "Nhà Giả Kim",
        "Dế Mèn Phiêu Lưu Ký",
        "Tắt Đèn",
        "Mắt Biếc"
    )
    println("Danh sách ban đầu: $danhSachSach")

    danhSachSach.add("Sapiens")
    danhSachSach.add("Cho Tôi Xin Một Vé Đi Tuổi Thơ")
    danhSachSach.remove("Tắt Đèn")
    danhSachSach.sort()

    println("Danh sách sau khi thêm, xoá, sắp xếp: $danhSachSach")
}