public class Phone extends ElectronicItem{
    private String networkType;
    private int screenSize;
    private String location;

    public Phone(String networkType, int screenSize, int storageCapacity, String model, String maker, String operatingSystem, String name, String location, int price, String description){
        super(storageCapacity, model, maker, operatingSystem, name, location, price, description);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "networkType='" + networkType + '\'' +
                ", screenSize=" + screenSize +
                ", storageCapacity=" + getStorageCapacity() +
                ", model='" + getModel() + '\'' +
                ", maker='" + getMaker() + '\'' +
                ", operatingSystem='" + getOperatingSystem() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}';
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getNetworkType(){
        return networkType;
    }

    public int getScreenSize(){
        return screenSize;
    }


    public void setNetworkType(String networkType){
        this.networkType = networkType;
    }

    public void setScreenSize(String screenSize){
        this.screenSize = Integer.parseInt(screenSize);
    }

    public String getLocation() {
        return location; // Getter for location
    }

}
