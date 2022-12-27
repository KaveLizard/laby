import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Singleton {
    private static Singleton instance;
    private ArrayList<KitchenDevices> kitchenDevicesArrayList = new ArrayList<>();

    FileWriter output;

    protected Singleton() {
    }

    public static Singleton Instance() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return null;
    }

    public void addKitchenDevice(KitchenDevices kitchenDevice) throws IOException {
        output = new FileWriter("output.txt", true);
        kitchenDevicesArrayList.add(kitchenDevice);
        output.write(kitchenDevice.toString() + "\n");
        output.close();
    }

    public KitchenDevices[] GetAllKitchenDevices() {
        KitchenDevices[] resultArray = new KitchenDevices[kitchenDevicesArrayList.size()];
        kitchenDevicesArrayList.toArray(resultArray);
        return resultArray;
    }

}