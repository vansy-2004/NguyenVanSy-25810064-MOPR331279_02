// Nguyen Van Sy - 25810064

// So sánh: dùng while khi số lần lặp phụ thuộc vào một điều kiện (chưa biết trước số lần),
// dùng repeat khi đã biết chắc số lần lặp cố định.

fun main() {
    // Đếm ngược bằng while
    var soDem = 10
    while (soDem >= 1) {
        println(soDem)
        soDem--
    }

    // In dòng cố định 5 lần bằng repeat
    repeat(5) {
        println("Xin chào Kotlin!")
    }
}