package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự: ");
        String arr = scanner.nextLine();
        System.out.println("Nhập ký tự cần đếm: ");
        String text = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == text.charAt(0)) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
