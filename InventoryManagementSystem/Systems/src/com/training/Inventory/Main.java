package com.training.Inventory;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== 顧客管理メニュー ====");
            System.out.println("1 : 登録  2 : 検索  3 : 一覧  4 : 更新  5 : 削除  0 : 終了");
            System.out.print("番号を入力してください");
            String choice = scanner.nextLine();

            switch (choice) {
                case "0" -> {
                    System.out.println("終了します");
                    return;
                }
                default -> System.out.println("正しい番号を入力してください：");
            }
        }
        
    }
}
