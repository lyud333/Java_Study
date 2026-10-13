package array;

public class ObjectCopy1 {
    public static void main(String[] args) {
        Book[] book = new Book[5];
        Book[] bookCopy = new Book[5];

        book[0] = new Book("태백산맥", "조정래");
        book[1] = new Book("데미안", "헤르만 헤세");
        book[2] = new Book("연을 쫓는 아이", "할레드 호세이니");
        book[3] = new Book("토지", "박경리");
        book[4] = new Book("어린왕자", "생텍쥐페리");

        // [수정] System.arraycopy를 이용해 book의 참조값을 bookCopy로 복사
        System.arraycopy(book, 0, bookCopy, 0, 5);

        // 첫 번째 출력
        System.out.println("=== 최초 bookCopy 출력 ===");
        for (int i = 0; i < bookCopy.length; i++) {
            bookCopy[i].showBookInfo();
        }

        // 원본 배열의 0번째 객체 변경
        book[0].setBookName("나목");
        book[0].setAuther("박완서"); // (예시로 작가명을 박완서로 변경)

        // 두 번째 출력 (얕은 복사이므로 bookCopy의 내용도 함께 변경됨)
        System.out.println("\n=== 원본 변경 후 bookCopy 출력 ===");
        for (int i = 0; i < bookCopy.length; i++) {
            bookCopy[i].showBookInfo();
        }
    }
}
