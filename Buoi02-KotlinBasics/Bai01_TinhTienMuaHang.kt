// Nguyen Van Sy - 25810064
fun main() {
    val soLuong: Int = 5
    val donGia: Double = 24500.5


    val tienHang: Double = soLuong.toDouble() * donGia
    val tienThue: Double = tienHang * 0.08
    val tongTien: Double = tienHang + tienThue

    println("Tiền hàng: ${"%,.2f".format(tienHang)} VNĐ")
    println("Thuế 8%: ${"%,.2f".format(tienThue)} VNĐ")
    println("Tổng tiền phải trả: ${"%,.2f".format(tongTien)} VNĐ")
}