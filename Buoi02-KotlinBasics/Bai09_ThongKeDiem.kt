// Nguyen Van Sy - 25810064

fun main() {
    val diemSo = arrayOf(7.5, 8.0, 6.5, 9.0, 5.5, 4.0, 8.5, 7.0, 9.5, 6.0)

    var tongDiem = 0.0
    var diemCaoNhat = diemSo[0]
    var diemThapNhat = diemSo[0]

    for (diem in diemSo) {
        tongDiem += diem
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTrungBinh = tongDiem / diemSo.size

    println("Điểm trung bình cả lớp: ${"%.2f".format(diemTrungBinh)}")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}