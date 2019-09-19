package imic;

import java.util.Scanner;

public class XuLyChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatHangController mh = new MatHangController();
        while (true) {
        System.out.println("Vui long chon: ");
        System.out.println("1. De them loai mat hang");
        System.out.println("2. De xoa loai mat hang");
        System.out.println("3. De sua loai mat hang");
        System.out.println("4. De them mat hang");
        System.out.println("5. De xoa mat hang");
        System.out.println("6. De sua mat hang");
        System.out.println("7. De xem tat ca cac mat hang");
        System.out.println("8. De xem mat hang tuy chon");
        System.out.println("9. De thoat chuong trinh");
        int x = sc.nextInt();
            switch (x) {
                case 1: {
                    mh.themLoaiMatHang();
                    break;
                }
                case 2: {
                    mh.xoaLoaiMatHang();
                    break;
                }
                case 3: {
                    mh.suaLoaiMatHang();
                    continue;
                }
                case 4: {
                    mh.themMatHang();
                    continue;
                }
                case 5: {
                    mh.xoaMatHang();
                    continue;
                }
                case 6: {
                    mh.suaMatHang();
                    continue;
                }
                case 7: {
                    mh.lietKeMatHang();
                    continue;
                }
                case 8: {
                    mh.xemMatHang();
                    continue;
                }
                case 9: {
                    System.exit(1);
                }
            }
        }
    }
}
