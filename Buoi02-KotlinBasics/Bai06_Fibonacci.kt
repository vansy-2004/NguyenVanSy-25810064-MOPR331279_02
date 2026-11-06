// Nguyen Van Sy - 25810064

fun main() {
    var soHienTai = 0
    var soKeTiep = 1

    for (viTri in 0 until 100) {
        if (soHienTai >= 100) break

        println("F($viTri) = $soHienTai")

        val tong = soHienTai + soKeTiep
        soHienTai = soKeTiep
        soKeTiep = tong
    }
}