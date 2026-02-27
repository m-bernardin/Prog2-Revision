import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Book> library;
    public ArrayList<Book> getLibrary() {
        return library;
    }
    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }
    public static void main(String[] args) {
        library=new ArrayList<>();
        library.add(new Book("The Road", "Cormac McCarthy", 2006));
        library.add(new Book("Our Magnificient Bastard Tongue", "John McWhorter", 2008));
        library.add(new Book("The Call of Cthulhu", "H.P. Lovecraft", 1928));
        library.add(new Book("The Complete Works of Borkus", "John Borkus", 2025));
        library.add(new Book("The Complete Works of Bingus", "John Bingus", 2025));
        System.out.println("All books in library:");
        for(Book book:library){
            System.out.println(book);
        }
        Scanner input=new Scanner(System.in);
        boolean running=true;
        while(running){
            System.out.print("Please select an option\n1. search for a title\n2. remove a book by title\n3. quit\n> ");
            switch (input.nextInt()) {
                case 1:
                    System.out.print("Please a word to search for\n> ");
                    String searchWord=input.next();
                    String results="Results:\n";
                    for(Book book:library){
                        if(book.getTitle().contains(searchWord))results+=book+"\n";
                    }
                    System.out.println(results);
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Please enter a title to remove\n> ");
                    String toRemove=input.nextLine();
                    boolean removed=false;
                    for(Book book:library){
                        if(book.getTitle().equals(toRemove)){
                            library.remove(book);
                            System.out.println("Removed "+book);
                            removed=true;
                        }
                    }
                    if(!removed){
                        System.out.println("No book by that title found...");
                    }
                    break;
                case 3:
                    running=false;
                    break;
            }
            System.out.println("Books in library:");
            for(Book book:library){
                System.out.println(book);
            }
        }
        System.out.println("Goodbye :)");
    }
}