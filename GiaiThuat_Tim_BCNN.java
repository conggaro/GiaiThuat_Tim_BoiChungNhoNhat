// Yêu cầu:
// 1. nhập a
// 2. nhập b
// 3. nhập c
// 4. nhập d

// 5. tìm bội chung nhỏ nhất BCNN(a, b, c, d)

// VD: BCNN(2, 3, 4, 8) = 24

import java.util.Scanner;

class Program{
    // tạo hàm max(int, int, int, int) có 4 tham số
    public static int max(int thamSo1, int thamSo2, int thamSo3, int thamSo4){
        int max = thamSo1;

        // tạo mảng để tìm max
        int[] arr = {thamSo1, thamSo2, thamSo3, thamSo4};

        for (int item : arr) {
            if (max < item) {
                max = item;
            }
        }

        return max;
    }

    // tạo hàm tìm bội chung nhỏ nhất
    public static int Ham_Tim_BCNN(int thamSo1, int thamSo2, int thamSo3, int thamSo4){
        int BCNN = 0;

        // tạo index bắt đầu
        int index_bat_dau = max(thamSo1, thamSo2, thamSo3, thamSo4);

        // tạo index kết thúc
        int index_ket_thuc = thamSo1 * thamSo2 * thamSo3 * thamSo4;

        for (int i = index_bat_dau; i <= index_ket_thuc; i++) {
            boolean kiemTra1 = i % thamSo1 == 0? true : false;
            boolean kiemTra2 = i % thamSo2 == 0? true : false;
            boolean kiemTra3 = i % thamSo3 == 0? true : false;
            boolean kiemTra4 = i % thamSo4 == 0? true : false;

            if (kiemTra1 && kiemTra2 && kiemTra3 && kiemTra4) {
                BCNN = i;

                // tìm được bội chung nhỏ nhất rồi thì phải break
                break;          
            }
        }

        return BCNN;
    }

    public static void main(String[] agrs){
        // tạo đối tượng đọc dữ liệu nhập từ bàn phím
        Scanner dt = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        System.out.print("Nhap vao a: ");
        a = dt.nextInt();
        
        System.out.print("Nhap vao b: ");
        b = dt.nextInt();
        
        System.out.print("Nhap vao c: ");
        c = dt.nextInt();
        
        System.out.print("Nhap vao d: ");
        d = dt.nextInt();

        // gọi hàm tìm bội chung nhỏ nhất
        int x = Ham_Tim_BCNN(a, b, c, d);

        System.out.print("\nBCNN(" + a + ", " + b + ", " + c + ", " + d + ") = " + x);
    }
}