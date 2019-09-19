package imic;

import java.util.Scanner;

public class MatHangController implements IMatHangController {
    LoaiMatHang[] arrayLoaiMatHang = new LoaiMatHang[2];
    MatHang[] arrayMatHang = new MatHang[2];
    Scanner sc = new Scanner(System.in);

    @Override
    public void themLoaiMatHang() {
        for (int i = 0; i < arrayLoaiMatHang.length; i++) {
            LoaiMatHang lmh = new LoaiMatHang();

            System.out.println("Vui long nhap id loai mat hang: ");
            lmh.idlmh = sc.nextInt();

            System.out.println("Vui long nhap ten loai mat hang: ");
            lmh.TenLoaiMatHang = sc.nextLine();
            sc.nextLine();
            arrayLoaiMatHang[i] = lmh;
        }
    }

    @Override
    public void xoaLoaiMatHang() {
        int erase;
        System.out.println("Nhap vao id mat hang ban muon xoa: ");
        erase = sc.nextInt();
        for (int i = 0; i < arrayLoaiMatHang.length; i++) {
            if (erase == arrayLoaiMatHang[i].idlmh) {
                    arrayMatHang[i] = null;
                }
            }
        }


    @Override
    public void suaLoaiMatHang() {
        int edit;
        System.out.println("Nhap vao id mat hang ban muon sua: ");
        edit = sc.nextInt();
        for (int i = 0; i < arrayLoaiMatHang.length; i++){
            if (edit == arrayLoaiMatHang[i].idlmh){

                LoaiMatHang lmh = new LoaiMatHang();
                System.out.println("Vui long nhap id loai mat hang: ");
                lmh.idlmh = sc.nextInt();

                System.out.println("Vui long nhap ten loai mat hang: ");
                lmh.TenLoaiMatHang = sc.nextLine();

                arrayLoaiMatHang[i] = lmh;
            }
        }
    }

    @Override
    public void themMatHang() {
        for (int i = 0; i < arrayMatHang.length; i++) {
            MatHang mh = new MatHang();

            System.out.println("Vui long nhap id mat hang: ");
            mh.idmh = sc.nextInt();
            sc.nextLine();

            System.out.println("Vui long nhap ten mat hang: ");
            mh.TenMatHang = sc.nextLine();

            arrayMatHang[i] = mh;
        }
    }

    @Override
    public void xoaMatHang() {
        int xoa;
        System.out.println("Nhap vao id mat hang ban muon xoa: ");
        xoa = sc.nextInt();
        for (int i = 0; i < arrayMatHang.length; i++) {
            if (xoa == arrayMatHang[i].idmh) {
                    arrayMatHang[i] = null;
                }
            }
    }

    @Override
    public void suaMatHang() {
        int sua;
        System.out.println("Nhap vao id mat hang ban muon sua: ");
        sua = sc.nextInt();
        for (int i = 0; i < arrayMatHang.length; i++){
            if (sua == arrayMatHang[i].idmh){

                MatHang mh = new MatHang();
                System.out.println("Vui long nhap id mat hang: ");
                mh.idmh = sc.nextInt();

                System.out.println("Vui long nhap ten mat hang: ");
                mh.TenMatHang = sc.nextLine();

                arrayMatHang[i] = mh;
            }
        }

    }

    @Override
    public void lietKeMatHang() {
        for (int i = 0; i < arrayMatHang.length; i++) {
            System.out.println("Mat hang id : " + arrayMatHang[i].idmh + " ten: " + arrayMatHang[i].TenMatHang);
        }
    }

    @Override
    public void xemMatHang() {
        int xem;
        System.out.println("Nhap id mat hang ban muon xem: ");
        xem = sc.nextInt();
        for (int i = 0; i < arrayMatHang.length; i++) {
            if (xem == arrayMatHang[i].idmh){
                System.out.println("Mat hang id : " + arrayMatHang[i].idmh + " ten: " + arrayMatHang[i].TenMatHang);
            }
        }
    }
}
