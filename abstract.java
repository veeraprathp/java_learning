class AbstractDemo {
    public static void main(String[] args) {
        Device d = new Phone();
        d.turnOn();
    }
}

abstract class Device {
    abstract void turnOn();
}

class Phone extends Device {
    @Override
    void turnOn() {
        System.out.println("Turn on the phone");
    }
}
