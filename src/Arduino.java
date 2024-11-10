public class Arduino extends ElectronicItem{
    private String version;

    public Arduino(String version, int storageCapacity, String model, String maker, String operatingSystem, String name, String location, int price, String description){
        super(storageCapacity, model, maker, operatingSystem, name, location, price, description);
        this.version = version;
    }

    public String getVersion(){
        return version;
    }

    public void setVersion(String version){
        this.version = version;
    }
}
