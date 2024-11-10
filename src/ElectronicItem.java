public class ElectronicItem extends CISItem{
    private int storageCapacity;
    private String model;
    private String maker;
    private String operatingSystem;

    public ElectronicItem(int storageCapacity, String model, String maker, String operatingSystem, String name, String location, int price, String description){
        super(name, location, price, description);
        this.storageCapacity = storageCapacity;
        this.model = model;
        this.maker = maker;
        this.operatingSystem = operatingSystem;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


}
