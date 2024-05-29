public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Имя1", "Фамилия1");
        Author author2 = new Author("Имя2", "Фамилия2");


        Book book1 = new Book("Название1", author1, 2000);
        Book book2 = new Book("Название2", author2, 2010);

        System.out.println("Название книги 1:\n " + book1.getTitle() + "\n");

        System.out.println("Автор книги 1:\n " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + "\n");

        System.out.println("Год публикации книги 1:\n " + book1.getPublicationYear() + "\n");

        System.out.println("Название книги 2:\n " + book2.getTitle() + "\n");

        System.out.println("Автор книги 2:\n " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + "\n");

        System.out.println("Год публикации книги 2:\n " + book2.getPublicationYear() + "\n");

        book1.setPublicationYear(2026);

        System.out.println("Новый год публикации книги 1:\n " + book1.getPublicationYear());
    }
}