package javaExam.problem4;

import java.util.Scanner;

class LibraryMember {
    private int memberId;
    private String name;
    private static int serialNum = 1000;

    LibraryMember(String name) {
        this.name = name;
        serialNum++;
        this.memberId = serialNum;
    }

    void showInfo() {
        System.out.println("회원 번호: " + memberId + ", 이름: " + name);
    }

    static int getMemberCount() {
        return serialNum - 1000;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String name3 = sc.nextLine();

        LibraryMember member1 = new LibraryMember(name1);
        LibraryMember member2 = new LibraryMember(name2);
        LibraryMember member3 = new LibraryMember(name3);

        System.out.println("==도서관 회원 목록==");
        member1.showInfo();
        member2.showInfo();
        member3.showInfo();

        System.out.println("전체 회원 수: " + LibraryMember.getMemberCount() + "명");
    }
}
