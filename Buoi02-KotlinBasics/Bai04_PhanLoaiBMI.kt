// Nguyen Van Sy - 25810064

fun main() {
    val canNang = 65.0
    val chieuCao = 1.70
    val chiSoBmi = canNang / (chieuCao * chieuCao)

    val phanLoai: String
    if (chiSoBmi < 18.5) {
        phanLoai = "Gầy"
    } else if (chiSoBmi < 25.0) {
        phanLoai = "Bình thường"
    } else if (chiSoBmi < 30.0) {
        phanLoai = "Thừa cân"
    } else {
        phanLoai = "Béo phì"
    }

    println("Chỉ số BMI: ${"%.2f".format(chiSoBmi)}")
    println("Phân loại: $phanLoai")
}