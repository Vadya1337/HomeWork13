import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Дмитрий ", "Глуховский");
        Author author1 = new Author("Анджей ", "Сапковский");
        Book metro = new Book("Метро 2033 ", 2008, author);
        System.out.println("Название книги " + metro.getName());
        System.out.println("Год выпуска " + metro.getYearRelease());
        System.out.println("Автор " + author);
        System.out.println();
        Book TheWither = new Book("Ведьмак 1", 2022, author1);
        System.out.println("Название книги " + TheWither.getName());
        System.out.println("Год издания " + TheWither.getYearRelease());
        System.out.println("Автор " + author1);
        System.out.println(metro.equals(TheWither));
        System.out.println(metro.hashCode());
        System.out.println(TheWither.hashCode());

    }


}