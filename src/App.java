public class App {
    public static void main(String[] args) {
        Author martin = new Author("Роберт", "Мартин,");
        Author spike = new Author("Лауренция", "Спике,");
        Book oneBook = new Book("Чистый код анализ,рефакторинг, ", martin, 2019);
        oneBook.setYearOfIssue(2020);
        Book twoBook = new Book("Spring быстро,", spike, 2021);
        twoBook.setYearOfIssue(2022);
        System.out.println("Схожесть фамилий авторов: " + martin.equals(spike));
        System.out.println("Схожесть названий книг: " + oneBook.equals(twoBook));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Название книги, " + "Автор," + "Год выпуска");
        System.out.println("Первая книга = " + oneBook);
        System.out.println("Вторая книга = " + twoBook);
    }


}

