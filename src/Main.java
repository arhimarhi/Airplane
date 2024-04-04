public class Main {
    public static void main(String[] args) {
        Airplane o1 = new Airplane("TU-140", 450, 100);
        Airplane o2 = new Airplane("AN-126", 550, 140);

        Airplane[] airplanes = {o1, o2};
        for (int i = 0; i < airplanes.length; i++) {
            System.out.println(airplanes[i]);
        }
    }
}
class Airplane {
    String name;
    Double speed;
    Double capacity;

    public Airplane(String name, double speed, double capacity) {
        this.name = name;

    }

    public Airplane(String name, Double speed, Double capacity) {
        this.name = name;
        this.speed = speed;
        this.capacity = capacity;
    }

    public String toString() {
        String s = "airplane" + name + "speed" + speed + "km/h" + "capacity " + capacity + "tons";
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public double setSpeed(Double speed) {
        this.speed = speed;
        return 0;
    }
    public double getCapacity() {
        return capacity;
    }

    public double setCapacity(Double capacity) {
        this.capacity = capacity;
        return 0;
    }
}