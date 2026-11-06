// Nguyen Van Sy - 25810064

fun main() {

    val soDuBanDau: Int = 5_000_000

    var soDuHienTai: Int = soDuBanDau

    println("Số dư ban đầu: ${"%,d".format(soDuBanDau)} VNĐ")

    soDuHienTai += 2_000_000        // gửi thêm 2 triệu
    println("Sau khi gửi 2.000.000: ${"%,d".format(soDuHienTai)} VNĐ")

    soDuHienTai -= 1_500_000        // rút 1,5 triệu
    println("Sau khi rút 1.500.000: ${"%,d".format(soDuHienTai)} VNĐ")
}