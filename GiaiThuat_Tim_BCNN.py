# Yêu cầu:
# 1. nhập vào a
# 2. nhập vào b
# 3. nhập vào c
# 4. nhập vào d

# 5. tìm bội chung nhỏ nhất của a, b, c, d

# ký hiệu BCNN(a, b, c, d)

a = int(input("Nhap vao a: "))
b = int(input("Nhap vao b: "))
c = int(input("Nhap vao c: "))
d = int(input("Nhap vao d: "))

# hàm tìm bội chung nhỏ nhất
def Ham_Tim_BCNN(thamSo1, thamSo2, thamSo3, thamSo4):
    BoiChungNhoNhat = 0
    
    index_bat_dau = max(thamSo1, thamSo2, thamSo3, thamSo4)

    index_ket_thuc = thamSo1 * thamSo2 * thamSo3 * thamSo4

    for i in range (index_bat_dau, index_ket_thuc + 1, 1):
        kiemTra1 = True if i % thamSo1 == 0 else False
        kiemTra2 = True if i % thamSo2 == 0 else False
        kiemTra3 = True if i % thamSo3 == 0 else False
        kiemTra4 = True if i % thamSo4 == 0 else False

        if kiemTra1 and kiemTra2 and kiemTra3 and kiemTra4:
            BoiChungNhoNhat = i
            break

    return BoiChungNhoNhat

# gọi hàm tìm bội chung nhỏ nhất
x = Ham_Tim_BCNN(a, b, c, d)

print(f"BCNN({a}, {b}, {c}, {d}) = {x}")