//TODO 2: Create a class called Store

import java.util.ArrayList;

public class Store {
    /*TODO 4: Create an ArrayList of CISItem in the Store class that will
       hold all of the items in this store. Call this ArrayList "cisItems"*/
    //The ArrayList is specifically designed to hold objects of type CISItem or its subclasses.
    //Useful because it provides type safety, ensuring that you don't accidentally add objects of incompatible types to the list
    private ArrayList<CISItem> cisItems;

    public Store(){
        cisItems = new ArrayList<>();
    }

    //TODO 5: Create a method addBook, that takes in a Book as an argument and adds it to the arrayList cisItems
    // Indicates that when you call the addBook method, you must pass in an object of type Book.
    public void addBook(Book book){
        cisItems.add(book);
    }

    //TODO 7: Create a method addPhone, which takes in a Phone as an argument and adds it to the ArrayList items.
    public void addPhone(Phone phone){
        cisItems.add(phone);
    }

    //Create a method addMagazine
    public void addMagazine(Magazine magazine) {cisItems.add(magazine);}

    //Create a method addArduino
    public void addArduino(Arduino arduino){cisItems.add(arduino);}


    public ArrayList<CISItem> getCisItems(){
        return cisItems;
    }

    //TODO 9: We want to be able to move all Phones to a new location.
    // Create a method called updatePhonesLocation(), which takes in a location as an argument and changes the location of all Phones in the Store.
    public void updatePhonesLocation(String location){
        for(CISItem item: cisItems){
            if(item instanceof Phone){
                Phone phone = (Phone) item;
                phone.setLocation(location);
            }
        }

    }

    //TODO 10: Create a method called getAllPhones() that returns an ArrayList with all the phones in the store.
    public ArrayList<Phone> getAllPhones(){
        ArrayList<Phone> phones = new ArrayList<>();
        for(CISItem item : cisItems){
            if(item instanceof Phone){
                phones.add((Phone) item);
            }
        }
        return phones;
    }

    //TODO 12: Let's make a method called getItems(String itemType) where itemType is the type of object the user wants as a String.
    public ArrayList<CISItem> getItems(String itemType){
        ArrayList<CISItem> items = new ArrayList<>();
        for (CISItem item : cisItems) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(itemType)) {
                items.add(item);
            }
        }
        return items;

    }



    //TODO 14: Create a method updateItems(String itemType, String property, String value) where itemType is the type of item the user wants to update.
    public void updateItems(String itemType, String property, String value) {
        for (CISItem item : cisItems) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(itemType)) {
                switch (property.toLowerCase()) {
                    case "location":
                        if (item instanceof Phone) {
                            ((Phone) item).setLocation(value);
                        }
                        break;
                    // Add more cases for other properties as needed
                    default:
                        System.out.println("Property not recognized.");
                }
            }
        }
    }

    //TODO 16: Create a method showAllInfo() that prints the information for all items in the store
    public void showAllInfo(){
        for(CISItem item: cisItems){
            System.out.println(item.toString());
        }
    }

    public void showAllPhones() {
        System.out.println("Phones in store:");
        for (CISItem item : cisItems) {
            if (item instanceof Phone) {
                System.out.println(item);
            }
        }
    }



}
