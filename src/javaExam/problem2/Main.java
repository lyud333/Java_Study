package javaExam.problem2;

import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String name;
    private int balance;

    BankAccount(String accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(int money) {
        balance += money;
    }

    void withdraw(int money) {
        balance -= money;
    }

    void transfer(BankAccount target, int money) {
        if (balance >= money) {
            withdraw(money);
            target.deposit(money);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    void showInfo() {
        System.out.println(name + "의 계좌번호: " + accountNumber + " 잔액: " + balance + "원");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount accountLee = new BankAccount("101-1234-5678", "이순신", 100000);
        BankAccount accountKim = new BankAccount("101-5678-1234", "김용식", 200000);
        BankAccount accountAhn = new BankAccount("101-7485-9632", "안중근", 300000);

        System.out.println("이체할 대상과 금액을 입력하세요.(김용식: 1, 안중근: 2)");
        int num = sc.nextInt();
        int money = sc.nextInt();

        if (num == 1) {
            accountLee.transfer(accountKim, money);
        } else if (num == 2) {
            accountLee.transfer(accountAhn, money);
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다.");
        }

        accountLee.showInfo();
        accountKim.showInfo();
        accountAhn.showInfo();
    }
}
