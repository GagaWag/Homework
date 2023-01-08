package classesAndObjects.phone;

public class Phone {
    public long number;
    public String model;
    public int weight;
    public String name = "Андрей";

    public Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        Phone phoneTwo = new Phone(200, "LG");
    }

    @Override
    public String toString() {
        return "Phone number is " + this.number + "\nPhone model is " + this.model + "\nPhone weight is " + this.weight
                + "\n";
    }

    public void receiveCall() {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, long number) {
    }

    public long getNumber() {
        return this.number;
    }

    public int getWeight() {
        return weight;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void sendMessage(long... length) {
        for (long number : length)
            System.out.println(number);
    }
}