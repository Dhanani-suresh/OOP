import java.util.*;

class Book implements Comparable <Book> {
    private String title;
    private double price;
    private int yearPublished;
    private String authorName;


    public Book(String title, double price, int yearPublished, String authorName) {
        this.title = title;
        this.price = price;
        this.yearPublished = yearPublished;
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.yearPublished, otherBook.yearPublished);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearPublished=" + yearPublished +
                ", authorName='" + authorName + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        HashMap<Book, Integer> hMap =  new HashMap<Book, Integer>();



        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Display all books");
            System.out.println("3. Display books on a shelf");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.next();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter year of publication: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter author's name: ");
                    String author = scanner.next();
                    System.out.println("Please enter the number of the shelf where the book is placed");
                    int numShelf = scanner.nextInt();


                    Book newBook = new Book(title, price, year, author);
                    books.add(newBook);
                    hMap.put(newBook, numShelf);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    books.sort(null);
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("List of Books:");
                        for (Book book : books) {
                            System.out.println(book);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Insert the number of the shelf");
                    int selectedShelf = scanner.nextInt();System.out.println("The book in shelf " + selectedShelf +  " are:");
                    Set set = hMap.entrySet();
                    Iterator iterator = set.iterator();
                    while(iterator.hasNext()) {
                        Map.Entry entry = (Map.Entry)iterator.next();
                        if(selectedShelf == (int) entry.getValue()){
                            System.out.println(((Book)entry.getKey()).getTitle());
                        }
                    }
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
