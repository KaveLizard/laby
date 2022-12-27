class Microwave {
    private final IKitchenDevicesBuilder kitchenDevice;

    public Microwave(IKitchenDevicesBuilder kitchenDevice) {
        this.kitchenDevice = kitchenDevice;
    }

    public void build(double cost, double power) {
        kitchenDevice.typeBuilder("Microwave");
        kitchenDevice.manufacturerBuilder("Russia");
        kitchenDevice.costBuilder(cost);
        kitchenDevice.powerBuilder(power);
    }
}

class Multicooker {
    private final IKitchenDevicesBuilder kitchenDevice;

    public Multicooker(IKitchenDevicesBuilder kitchenDevice) {
        this.kitchenDevice = kitchenDevice;
    }

    public void build(double cost, double power) {
        kitchenDevice.typeBuilder("Multicooker");
        kitchenDevice.manufacturerBuilder("USA");
        kitchenDevice.costBuilder(cost);
        kitchenDevice.powerBuilder(power);
    }
}

class Mixer {
    private final IKitchenDevicesBuilder kitchenDevice;

    public Mixer(IKitchenDevicesBuilder kitchenDevice) {
        this.kitchenDevice = kitchenDevice;
    }

    public void build(double cost, double power) {
        kitchenDevice.typeBuilder("Mixer");
        kitchenDevice.manufacturerBuilder("Ukraine");
        kitchenDevice.costBuilder(cost);
        kitchenDevice.powerBuilder(power);
    }
}
