class KitchenDevicesDecorator implements IKitchenDevices {
    private final IKitchenDevices kitchenDevice;

    public KitchenDevicesDecorator(IKitchenDevices kitchenDevice) {
        this.kitchenDevice = kitchenDevice;
    }

    public String NewFunction() {
        return kitchenDevice.NewFunction();
    }

}

class PutFoodInside extends KitchenDevicesDecorator {
    public PutFoodInside(IKitchenDevices kitchenDevice) {
        super(kitchenDevice);
    }

    @Override
    public String NewFunction() {
        String improve = super.NewFunction();
        improve += " + Food in it\n";
        return improve;
    }
}

class AdjustThePower extends KitchenDevicesDecorator {
    public AdjustThePower(IKitchenDevices kitchenDevice) {
        super(kitchenDevice);
    }

    @Override
    public String NewFunction() {
        String improve = super.NewFunction();
        improve += " + Adjusted power\n";
        return improve;
    }
}

class TurnOn extends KitchenDevicesDecorator {
    public TurnOn(IKitchenDevices kitchenDevice) {
        super(kitchenDevice);
    }

    @Override
    public String NewFunction() {
        String improve = super.NewFunction();
        improve += " + Turned on\n";
        return improve;
    }
}
