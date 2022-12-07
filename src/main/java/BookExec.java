import java.util.Scanner;

public class BookExec {
    public static void main(String[] args) {
        Formatter format;
        System.out.println(args[1]);
        //Задаем формат из аргумента
        switch (args[0]) {
            case ("JSON"):
                format = new JSONFormatterImpl();
                break;
            case ("XML"):
                format = new XMLFormatterImpl();
                break;
            default:
                System.out.println("Invalid argument!");
                return;
        }
        System.out.println(args[0]);
        //вводим значение из консоли
        Scanner in = new Scanner(System.in);
        //для добавления в файл
        BookStoreImpl myLibrary = new BookStoreImpl(format,args[1]);
        //тут передаем что-то возращется объект книги
        BookParser bookFactory = new BookParser();


        while (true) {

            System.out.print("Введите информацию о книге: ");
            String str = in.nextLine();
            //создаем store, который сохранит книгу в нужном формате
            if (str.matches("\\d{4},[a-яА-Яa-zA-Z\\s]+,[a-яА-Яa-zA-Z\\s\\d\\-]+") == true) {
                myLibrary.store(bookFactory.getBookInfoFromText(str));
            } else {
                System.out.println("Invalid value!");
                break;
            }
        }

        in.close();
    }
}
