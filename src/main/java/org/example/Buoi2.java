package org.example;


import java.util.Scanner;

public class Buoi2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Bài 1 - Hình chữ nhật");
            System.out.println("2. Bài 2 - Cộng trừ nhân chia");
            System.out.println("3. Bài 3 - Lãi suất");
            System.out.println("4. Bài 4 - Chẵn lẻ");
            System.out.println("0. Thoát");
            System.out.print("Chọn bài: "); int chon = sc.nextInt();

            switch (chon) {
                case 1 -> Bai1();
//                case 2 -> Bai2();
//                case 3 -> Bai3();
//                case 4 -> Bai4();
                case 0 -> {
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    public static void Bai1(){
        System.out.print("Nhập chiều dài: "); int dai = sc.nextInt();
        System.out.print("Nhập chiều rộng: "); int rong = sc.nextInt();

        int chuVi = 2 * (dai + rong);
        int dienTich = dai * rong;
        int canhNho = Math.min(dai, rong);

        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ: " + canhNho);
    }

}