// Yêu cầu:
// 1. nhập a
// 2. nhập b
// 3. tìm bội chung nhỏ nhất của a, b

// ký hiệu BCNN(a, b)

#include <iostream>
// #include <cmath>
using namespace std;

// hàm tìm bội chung nhỏ nhất
int Ham_Tim_BCNN(int thamSo1, int thamSo2){
    int BCNN = 0;

    // index bắt đầu
    int index_bat_dau = max(thamSo1, thamSo2);

    // index kết thúc
    int index_ket_thuc = thamSo1 * thamSo2;

    for (int i = index_bat_dau; i <= index_ket_thuc; i++)
    {
        bool kiemTra1 = i % thamSo1 == 0 ? true : false;
        bool kiemTra2 = i % thamSo2 == 0 ? true : false;

        if (kiemTra1 && kiemTra2)
        {
            BCNN = i;
            break;
        }        
    }

    return BCNN;
}

int main(){
    cout << "Nhap vao a: ";
    int a;
    cin >> a;

    cout << "Nhap vao b: ";
    int b;
    cin >> b;

    // gọi hàm tìm bội chung nhỏ nhất
    int x = Ham_Tim_BCNN(a, b);

    cout << "\nBCNN(" << a << ", " << b << ") = " << x << "\n\n";

    return 0;
}