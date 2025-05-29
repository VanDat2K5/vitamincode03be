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
                case 2 -> Bai2();
                case 3 -> Bai3();
                case 4 -> Bai4();
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

    public static void Bai2(){
        System.out.println("nhập a"); int a = sc.nextInt();
        System.out.println("Nhập b"); int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Chọn phép tính (+;-;*;/)"); String chon =sc.nextLine();

        switch (chon){
            case "+" -> System.out.println("a + b = "+(a+b));
            case "-" -> System.out.println("a - b = "+(a-b));
            case "*" -> System.out.println("a * b = "+(a*b));
            case "/" -> System.out.println((b==0?"Ko thể chia cho 0":"a / b = "+(a/b)));
        }
    }

    public static void Bai3(){
        System.out.print("Nhập số tiền gốc: "); double P = sc.nextDouble();
        System.out.print("Nhập lãi suất năm (%): "); double R = sc.nextDouble();
        System.out.print("Nhập thời gian gửi (năm): "); int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            double lai = (P * R * i) / 100;
            System.out.println("Năm " + i + ": Lãi = " + lai);
        }
    }

    public static void Bai4(){
        System.out.print("Nhập 1 số nguyên dương: "); int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Số chẵn");
        else
            System.out.println("Số lẻ");
    }
}