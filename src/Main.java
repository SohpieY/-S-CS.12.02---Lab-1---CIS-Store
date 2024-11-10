import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Store myStore = new Store();

        // Create some books and phones
        Book myBook = new Book("Coraline", "First Edition", "13: 9780747558538", 1234566, "2002", "Neil Gaiman", "Book", "Library", 12, "Scary");
        Phone myPhone = new Phone("4G LTE", 6, 20, "iPhone 8", "Apple", "iOS", "Old Phone", "house", 8000, "Old");
        Phone myPhone2 = new Phone("5G", 7, 40, "iPhone 16", "Apple", "iOS", "New Phone", "store", 15000, "Modern");

        // Add items to the store
        myStore.addBook(myBook);
        myStore.addPhone(myPhone);
        myStore.addPhone(myPhone2);

        // Show all items in the store
        System.out.println("All items in the store:");
        myStore.showAllInfo();

        // Retrieve specific items
        System.out.println("\nRetrieving all phones:");
        ArrayList<CISItem> phones = myStore.getItems("phone");
        for (CISItem item : phones) {
            System.out.println(item);
        }

        // Update phone locations
        myStore.updateItems("phone", "location", "Room 511");

        // Show updated information
        System.out.println("\nUpdated phone locations:");
        myStore.showAllPhones();
    }
}