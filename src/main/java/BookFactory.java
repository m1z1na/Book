public class BookFactory {
    private final String  delimeter = ","; // Разделитель
    public Book getBookInfoFromText(String text) {

        String[] data = text.split(delimeter);
        Short year = Short.valueOf(data[0]);
        String author = data[1];
        String title = data[2];
        return new Book(title, author, year);
    }

}
