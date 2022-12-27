interface IKitchenDevices {
    String NewFunction();
}

public class KitchenDevices implements IKitchenDevices {
    private String type;
    private String manufacturer;
    private double cost;
    private double power;

    @Override
    public String toString() {
        return "KitchenDevices {" +
                "type: '" + type + '\'' +
                ", manufacturer: '" + manufacturer + '\'' +
                ", cost: " + cost +
                ", power: " + power +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String NewFunction() {
        return "Function\n";
    }


}