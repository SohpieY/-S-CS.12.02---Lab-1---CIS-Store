import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StoreTester {
    //TODO 6: Create a test for addBook in the StoreTester class. The test is called addBookTest.

    @Test
    public void addBookTest(){
        //Create an instance of Store
        Store myStore = new Store();

        //Create a Book object.
        Book myBook = new Book("Coraline","First Edition","13: 9780747558538", 1234566, "2002", "Neil Gaiman", "Book", "Library",12, "Scary");

        //Add the book with .addBook(). Your program should not crash when you do this.
        myStore.addBook(myBook);

        //You can use assertTrue(true) at the end of the method.
        assertTrue(true);
    }

    @Test
    public void addBookAndPhoneTest(){
        Store myStore = new Store();

        //Create a Book and Phone object
        Book myBook = new Book("Coraline","First Edition","13: 9780747558538", 1234566, "2002", "Neil Gaiman", "Book", "Library",12, "Scary");

        Phone myPhone = new Phone("4G LTE",6, 20, "iPhone 8","Apple", "iOS", "Sophie's old phone", "house", 8000, "Old");

        //Add the book with .addBook(). Your program should not crash when you do this.
        myStore.addBook(myBook);
        myStore.addPhone(myPhone);


        //You can use assertTrue(true) at the end of the method.
        assertTrue(true);
    }

    @Test
    // TODO 11: Create a test for updatePhonesLocation() and getAllPhones(). This test will update all phones to be in "Room 512".
    public void getAllPhoneLocationTest(){
        //0. Create an instance of Store
        Store myStore = new Store();
        //1. Create some Phones and add them to the store.
        Phone firstPhone = new Phone("4G LTE",6, 20, "iPhone 8","Apple", "iOS", "Sophie's old phone", "house", 8000, "Old");
        Phone secondPhone = new Phone("5G",7, 40, "iPhone 16", "Apple", "iOS", "New phone", "Apple store", 15000, "Modern");


        myStore.addPhone(firstPhone);
        myStore.addPhone(secondPhone);
        // 2. Update all phones to be at location "Room 512"
        myStore.updatePhonesLocation("Room 512");
        // 3. Call getAllPhones()
        ArrayList<Phone> phones = myStore.getAllPhones();
        // 4. Check each phone and make sure that their location equals "Room 512"
        // 5. Use assertEquals(somePhone.getLocation(), "Room 512") on each phone
        for(Phone phone: phones){
            assertEquals("Room 512", phone.getLocation());
        }


    }

    @Test
    public void getItemsTest() {
        Store myStore = new Store();

        // Create some books and phones
        Book myBook1 = new Book("Coraline", "First Edition", "13: 9780747558538", 1234566, "2002", "Neil Gaiman", "Book", "Library", 12, "Scary");
        Phone myPhone1 = new Phone("4G LTE", 6, 20, "iPhone 8", "Apple", "iOS", "Sophie's old phone", "house", 8000, "Old");

        myStore.addBook(myBook1);
        myStore.addPhone(myPhone1);

        // Get all books
        ArrayList<CISItem> books = myStore.getItems("book");
        assertEquals(1, books.size());
        assertEquals(myBook1, books.get(0));

        // Get all phones
        ArrayList<CISItem> phones = myStore.getItems("phone");
        assertEquals(1, phones.size());
        assertEquals(myPhone1, phones.get(0));
    }

    @Test
    public void updateItemsTest() {
        Store myStore = new Store();

        // Create some phones
        Phone myPhone1 = new Phone("4G LTE", 6, 20, "iPhone 8", "Apple", "iOS", "Old Phone", "house", 8000, "Old");
        Phone myPhone2 = new Phone("5G", 7, 40, "iPhone 16", "Apple", "iOS", "New Phone", "store", 15000, "Modern");

        myStore.addPhone(myPhone1);
        myStore.addPhone(myPhone2);

        // Update the location of all phones
        myStore.updateItems("phone", "location", "Room 511");

        // Verify that both phones' locations have been updated
        assertEquals("Room 511", myPhone1.getLocation());
        assertEquals("Room 511", myPhone2.getLocation());
    }



}
