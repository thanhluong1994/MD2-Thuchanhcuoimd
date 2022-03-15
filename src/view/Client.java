package view;

import controller.ManagerPhonebook;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int check=-1;
        while (check==-1){
            System.out.println("----MENU----");
            System.out.println("1.Xem danh sach");
            System.out.println("2.Them moi");
            System.out.println("3.Cap nhat");
            System.out.println("4.Xoa");
            System.out.println("5.Tim kiem");
            System.out.println("6.Thoat");
            System.out.println("Chon chuc nang: ");

            Scanner scanner=new Scanner(System.in);
            int choose= scanner.nextInt();

            switch (choose){
                case 1:
                    System.out.println("--DANH SACH--");
                    ManagerPhonebook.showPhonebook();
                    break;
                case 2:
                    ManagerPhonebook.addPhoneBook();
                    break;
                case 3:
                    ManagerPhonebook.editPhoneBookByName();
                    break;
                case 4:
                    ManagerPhonebook.deletePhoneBookByName();
                    break;
                case 5:
                    ManagerPhonebook.searchPhoneBookByName();
                    break;
                case 6:
                    System.exit(6);
            }
        }
    }
}