import java.util.Arrays;

class Sportsman implements Comparable<Sportsman> {
    private String name;
    private float highJump, longJump, sideHorse;

    public Sportsman(String name, float a, float b, float c) {
        super();
        this.name = name;
        this.highJump = a;
        this.longJump = b;
        this.sideHorse = c;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return highJump;
    }

    public void setHeight(float height) {
        this.highJump = height;
    }

    public float getWeight() {
        return longJump;
    }

    public void setWeight(float weight) {
        this.longJump = weight;
    }

    public float getScore() {
        return sideHorse;
    }

    public void setScore(float score) {
        this.sideHorse = score;
    }

    public void speak() {
        System.out.println("I am " + name + ",my highJump " + highJump + ",my longJump " + longJump + ",my sideHorse "
                + sideHorse);

    }

    public int compareTo(Sportsman o) {
//        int flag = 0;
//        if (this.highJump * 0.2 + this.longJump * 0.3 + this.sideHorse * 0.5 > o.highJump * 0.2 + o.longJump * 0.3
//                + o.sideHorse * 0.5)
//            flag = 1;
//        else if (this.highJump * 0.2 + this.longJump * 0.3 + this.sideHorse * 0.5 < o.highJump * 0.2 + o.longJump * 0.3
//                + o.sideHorse * 0.5)
//            flag = -1;
//        return flag;
        if ((highJump * 0.2 + longJump * 0.3 + sideHorse * 0.5) - (o.highJump * 0.2 + o.longJump * 0.3 + o.sideHorse * 0.5) > 0) {
            return 1;
        } else if ((highJump * 0.2 + longJump * 0.3 + sideHorse * 0.5) - (o.highJump * 0.2 + o.longJump * 0.3 + o.sideHorse * 0.5) < 0) {
            return -1;
        }
        return 0;

//        return (int)((highJump*0.2+longJump*0.3+sideHorse*0.5)-(o.highJump*0.2+o.longJump*0.3+o.sideHorse*0.5));
    }

    public String toString() {
        return "Sportsman [name=" + name + ",highJump=" + highJump + ",longJump=" + longJump + ",sideHorse=" + sideHorse
                + "]";
    }
}

public class TestCompare {
    public static void main(String[] args) {
        int i;
        Sportsman ps[] = new Sportsman[6];
        ps[0] = new Sportsman("zhangsan", 90, 95, 92);
        ps[1] = new Sportsman("lisi", 91, 92, 95);
        ps[2] = new Sportsman("wangwu", 95, 91, 93);
        ps[3] = new Sportsman("zhaoliu", 92, 94, 90);
        ps[4] = new Sportsman("zhouqi", 89, 90, 88);
        ps[5] = new Sportsman("zhengba", 86, 92, 93);
        System.out.println("array  sort  before:");
        for (i = 0; i < ps.length; i++) {
            ps[i].speak();
        }
        Arrays.sort(ps);
//  call  sort  method
        System.out.println("\narray  sort  after:");
        for (i = 0; i < ps.length; i++) {
            System.out.println(ps[i]);
        }
    }
}
