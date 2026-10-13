package array;
import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> book= new ArrayList<Book>();

        book.add(new Book("태백산맥","조정래"));
        book.add(new Book("데미안","헤르만 헤세"));
        book.add(new Book("연을 쫓는 아이","할레드 호세이니"));
        book.add(new Book("토지","박경리"));
        book.add(new Book("어린왕자","생텍쥐페리"));

        for (int i = 0; i < book.size(); i++) {
            book.get(i).showBookInfo();

        }

        book.remove(2);

        System.out.println("\n3번째 항목 제거");
        for (Book booki : book){
            booki.showBookInfo();
        }

        book.removeAll(book);
        System.out.println("\n전체 항목 제거");
        for (Book booki : book) {
            booki.showBookInfo();
        }

        System.out.println("\n배열이 비었는지 확인");
        System.out.println(book.isEmpty());
    }
}
