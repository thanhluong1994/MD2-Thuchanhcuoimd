package controller;

import model.Phonebook;
import storage.PhonebookFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerPhonebook {
static public ArrayList<Phonebook> phoneBooksList= PhonebookFile.readFile();



public static void addPhoneBook(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Moi ban nhap ten: ");
    String name= scanner.nextLine();
    Scanner scanner1=new Scanner(System.in);
    System.out.println("Moi ban nhap so dien thoai: ");
    String phoneNumber= scanner1.nextLine();
    Scanner scanner2=new Scanner(System.in);
    System.out.println("Moi ban nhap dia chi: ");
    String address= scanner2.nextLine();
    Scanner scanner3=new Scanner(System.in);
    System.out.println("Moi ban nhap email: ");
    String email = scanner3.nextLine();

    Phonebook newPhonebook=new Phonebook(name,phoneNumber,address,email);
    phoneBooksList.add(newPhonebook);
    try {
         PhonebookFile.writeFile(phoneBooksList);
    }catch (IOException e){
        e.printStackTrace();
    }
}


public static void showPhonebook(){
    for (Phonebook p: phoneBooksList
         ) {
        System.out.println(p);
    }
}

public static void editPhoneBookByName() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Moi ban nhap ten muon sua: ");
    String name = scanner.nextLine();
    int check = -1;
    for (int i = 0; i < phoneBooksList.size(); i++) {
        if (name.equals(phoneBooksList.get(i).getName())) {
            check = i;
        }
    }
    if (check != -1) {
        System.out.println("Moi ban nhap ten: ");
        Scanner scanner4 = new Scanner(System.in);
        String name1 = scanner4.nextLine();
        System.out.println("Moi ban nhap so dien thoai: ");
        Scanner scanner5 = new Scanner(System.in);
        String phoneNumber = scanner5.nextLine();
        System.out.println("Moi ban nhap dia chi: ");
        Scanner scanner6 = new Scanner(System.in);
        String address = scanner6.nextLine();
        System.out.println("Moi ban nhap email: ");
        Scanner scanner7 = new Scanner(System.in);
        String email = scanner7.nextLine();

        phoneBooksList.get(check).setName(name1);
        phoneBooksList.get(check).setNumberPhone(phoneNumber);
        phoneBooksList.get(check).setAddress(address);
        phoneBooksList.get(check).setAddress(email);
    } else {
        System.out.println("Ten nhap khong hop le");
    }
}


public static void deletePhoneBookByName(){
    System.out.println("Moi ban nhap ten muon xoa: ");
    Scanner scanner=new Scanner(System.in);
    String name= scanner.nextLine();
    int check=-1;
    for (int i = 0; i < phoneBooksList.size(); i++) {
        if (name.equals(phoneBooksList.get(i).getName()))
        check=i;
    }
    if (check!=-1){
      phoneBooksList.remove(phoneBooksList.get(check));
        try {
            PhonebookFile.writeFile(phoneBooksList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    } else {
        System.out.println("Ten nhap khong co trong danh sach");
    }
}

public static void searchPhoneBookByName(){
    System.out.println("Moi ban nhap ten muon tim: ");
     Scanner scanner=new Scanner(System.in);
     String name= scanner.nextLine();
    int check=-1;
    for (int i = 0; i < phoneBooksList.size(); i++) {
        if (name.equals(phoneBooksList.get(i).getName())){
            check=i;
        }
        if (check!=-1){
            System.out.println(phoneBooksList.get(check).toString());
        }else {
            System.out.println("Ten khong co trong danh sach");
        }
    }
}
}
