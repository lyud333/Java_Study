package array;

public class BookArray2 {
    public static void main(String[] args) {
        // 1. 크기가 5인 Book 배열 생성 (현재 내부 요소는 모두 null)
        Book[] book = new Book[5];

        // 2. 각각의 Book 객체 생성 및 데이터 설정
        Book book1 = new Book();
        book1.setBookName("태백산맥");
        book1.setAuther("조정래");

        Book book2 = new Book();
        book2.setBookName("데미안");
        book2.setAuther("헤르만 헤세");

        Book book3 = new Book();
        book3.setBookName("연을 쫓는 아이");
        book3.setAuther("할레드 호세이니");

        Book book4 = new Book("토지", "박경리");
        Book book5 = new Book("어린왕자", "생텍쥐페리");

        // [수정] 생성한 객체들을 배열의 각 방에 순서대로 대입하기
        book[0] = book1;
        book[1] = book2;
        book[2] = book3;
        book[3] = book4;
        book[4] = book5;

        // 개별 객체 정보 출력 (정상 동작)
        System.out.println("=== 개별 변수 출력 ===");
        book1.showBookInfo();
        book2.showBookInfo();
        book3.showBookInfo();
        book4.showBookInfo();
        book5.showBookInfo();

        // 3. 배열을 이용한 정보 출력 (이제 null이 아니므로 정상 동작)
        System.out.println("\n=== 배열 반복문 출력 (정보) ===");
        for (int i = 0; i < book.length; i++) {
            book[i].showBookInfo();
        }

        // 4. 배열에 저장된 주소값(또는 toString) 출력
        System.out.println("\n=== 배열 반복문 출력 (주소값) ===");
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
    }
}
