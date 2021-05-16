package HomeWork_8;

public class Test {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("HUAWEI", "13800009999", "130111111111111111");
        phone1.display();
    }
}

abstract class Phone {
    private String code;

    public Phone(String code) {
        this.code = code;
    }

    public abstract void display();
}

class MobilePhone extends Phone {
    private String brand;
    private String ownerId;

    public MobilePhone(String brand, String code, String ownerId) {
        super(code);
        this.brand = brand;
        this.ownerId = ownerId;
    }

    public double pay(int time, double price) {
        return time * price;
    }

    public void display() {
        System.out.println("Brand  is" + brand);
        System.out.println("OwnerId  is" + ownerId);
    }
}