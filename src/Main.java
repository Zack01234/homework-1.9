public class Main {
    public static void main(String[] args) {
        Author author = new Author("Жир", "Быль");
        Book yxz = new Book("yxz", 1934, new Author("Жир", "Быль"));
        yxz.setPublishDate(1934);
        System.out.println(yxz);
    }
}
