import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Singleton singleton = new Singleton();

        KitchenDevicesBuilder microwaveBuilder = new KitchenDevicesBuilder();
        Microwave microwave = new Microwave(microwaveBuilder);
        microwave.build(100_000, 75);
        KitchenDevices kitchenDevice = microwaveBuilder.getKitchenDevice();
        System.out.println(kitchenDevice.toString());

        PutFoodInside microwavePutFoodInside = new PutFoodInside(kitchenDevice);
        singleton.addKitchenDevice(kitchenDevice);
        System.out.println(microwavePutFoodInside.NewFunction());


        KitchenDevicesBuilder multicookerBuilder = new KitchenDevicesBuilder();
        Multicooker multicooker = new Multicooker(multicookerBuilder);
        multicooker.build(200_000, 150);
        KitchenDevices kitchenDevice1 = multicookerBuilder.getKitchenDevice();
        System.out.println(kitchenDevice1.toString());

        AdjustThePower multicookerAdjustThePower = new AdjustThePower(kitchenDevice1);
        TurnOn multicookerTurnOn = new TurnOn(multicookerAdjustThePower);

        System.out.println(multicookerTurnOn.NewFunction());
        singleton.addKitchenDevice(kitchenDevice1);


        KitchenDevicesBuilder mixerBuilder = new KitchenDevicesBuilder();
        Mixer mixer = new Mixer(mixerBuilder);
        mixer.build(300_000, 7.5);
        KitchenDevices kitchenDevice2 = mixerBuilder.getKitchenDevice();
        System.out.println(kitchenDevice2.toString());

        PutFoodInside mixerPutFoodInside = new PutFoodInside(kitchenDevice2);
        AdjustThePower mixerAdjustThePower = new AdjustThePower(mixerPutFoodInside);
        TurnOn turnOn = new TurnOn(mixerAdjustThePower);

        System.out.println(turnOn.NewFunction());
        singleton.addKitchenDevice(kitchenDevice2);

        singleton.GetAllKitchenDevices();
    }
}