# Giải thuật tìm bội chung nhỏ nhất
Theo định nghĩa, BCNN của 2 số a và b <br>
--> là số nhỏ nhất chia hết cho cả 2 số a và b.

Nắm rõ tính chất này, ta có thể đi vào thuật toán tìm BCNN như sau:
1. Ta chỉ cần tiến hành lặp từ nhỏ tới lớn các số trong đoạn từ [max(a, b),a*b]
2. Số đầu tiên chia hết cho cả a và b sẽ là BCNN của a và b.
3. Tìm được bội chung nhỏ nhất rồi thì break khỏi vòng lặp for.
