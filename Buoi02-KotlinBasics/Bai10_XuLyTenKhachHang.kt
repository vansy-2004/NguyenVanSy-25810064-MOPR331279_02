// Nguyen Van Sy - 25810064

// Hàm nhận tên khách hàng có thể null (kiểu String?)
fun xuLyTenKhachHang(tenKhachHang: String?) {
    // 1. Safe call (?.): nếu tenKhachHang là null thì cả biểu thức trả về null, không bị lỗi
    val doDaiTen: Int? = tenKhachHang?.length
    println("Độ dài tên (safe call): $doDaiTen")

    // 2. Elvis (?:): nếu bên trái là null thì lấy giá trị mặc định bên phải
    val tenHienThi: String = tenKhachHang ?: "Khách vãng lai"
    println("Tên hiển thị (Elvis): $tenHienThi")
}

fun main() {
    xuLyTenKhachHang("Trần Thị B")
    xuLyTenKhachHang(null)

    // 3. Toán tử !! (not-null assertion)
    // Cách này ép Kotlin tin rằng biến KHÔNG null. Nếu biến thực sự null thì chương trình
    // ném NullPointerException và bị crash khi chạy. Chỉ nên dùng khi chắc chắn tuyệt đối
    // biến không rỗng; thông thường nên ưu tiên safe call hoặc Elvis.
    val tenChacChan: String? = "Lê Văn C"
    println("Dùng !! khi biến có giá trị: ${tenChacChan!!.length}")

    val tenRong: String? = null
    try {
        println(tenRong!!.length)   // biến null -> gây lỗi
    } catch (loi: NullPointerException) {
        println("Lỗi NullPointerException: dùng !! trên biến null sẽ làm chương trình dừng đột ngột")
    }
}