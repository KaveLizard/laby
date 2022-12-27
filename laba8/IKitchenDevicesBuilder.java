public interface IKitchenDevicesBuilder {
    void typeBuilder(String type);

    void manufacturerBuilder(String country);

    void costBuilder(double cost);

    void powerBuilder(double square);

    KitchenDevices getKitchenDevice();
}