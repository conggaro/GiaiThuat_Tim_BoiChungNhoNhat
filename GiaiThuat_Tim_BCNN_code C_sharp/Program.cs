// Yêu cầu:
// 1. nhập a
// 2. nhập b
// 3. nhập c
// 4. nhập d

// 5. tìm bội chung nhỏ nhất BCNN(a, b, c, d)

// VD: BCNN(2, 3, 4, 8) = 24

using System;

namespace MyApp
{
    public class Program
    {
        // tạo hàm tìm max(int, int, int, int) có 4 tham số
        public static int max(int thamSo1, int thamSo2, int thamSo3, int thamSo4){
            int max = thamSo1;

            // tạo mảng
            int[] arr = {thamSo1, thamSo2, thamSo3, thamSo4};

            foreach (int item in arr)
            {
                if (max < item)
                {
                    max = item;
                }
            }

            return max;
        }

        // tạo hàm tìm bội chung nhỏ nhất
        public static int Ham_Tim_BCNN(int thamSo1, int thamSo2, int thamSo3, int thamSo4){
            // tạo biến bội chung nhỏ nhất
            int BCNN = 0;

            // tạo index bắt đầu
            int index_bat_dau = max(thamSo1, thamSo2, thamSo3, thamSo4);

            // tạo index kết thúc
            int index_ket_thuc = thamSo1 * thamSo2 * thamSo3 * thamSo4;

            for (int i = index_bat_dau; i <= index_ket_thuc; i++)
            {
                bool kiemTra1 = i % thamSo1 == 0 ? true : false;
                bool kiemTra2 = i % thamSo2 == 0 ? true : false;
                bool kiemTra3 = i % thamSo3 == 0 ? true : false;
                bool kiemTra4 = i % thamSo4 == 0 ? true : false;

                if (kiemTra1 && kiemTra2 && kiemTra3 && kiemTra4)
                {
                    BCNN = i;
                    break;
                }
            }

            return BCNN;
        }

        public static void Main(string[] args)
        {
            Console.Write("Nhap a: ");
            int a = Convert.ToInt32(Console.ReadLine());

            Console.Write("Nhap b: ");
            int b = Convert.ToInt32(Console.ReadLine());

            Console.Write("Nhap c: ");
            int c = Convert.ToInt32(Console.ReadLine());

            Console.Write("Nhap d: ");
            int d = Convert.ToInt32(Console.ReadLine());

            // gọi hàm tìm bội chung nhỏ nhất
            int x = Ham_Tim_BCNN(a, b, c, d);

            Console.Write("\nBCNN(" + a + ", " + b + ", " + c + ", " + d + ") = " + x);
        }
    }
}