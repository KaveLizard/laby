public class KitchenDevicesBuilder implements IKitchenDevicesBuilder {
    private KitchenDevices kitchenDevice;

    public KitchenDevicesBuilder() {
        kitchenDevice = new KitchenDevices();
    }

    public void typeBuilder(String type) {
        kitchenDevice.setType(type);
    }

    public void manufacturerBuilder(String manufacturer) {
        kitchenDevice.setManufacturer(manufacturer);
    }

    public void costBuilder(double cost) {
        kitchenDevice.setCost(cost);
    }

    public void powerBuilder(double power) {
        kitchenDevice.setPower(power);
    }

    public KitchenDevices getKitchenDevice() {
        KitchenDevices kitchenDevice = this.kitchenDevice;
        this.kitchenDevice = new KitchenDevices();
        return kitchenDevice;
    }
}