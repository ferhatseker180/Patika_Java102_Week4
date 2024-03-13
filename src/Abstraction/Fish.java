package Abstraction;

public class Fish extends Animal {
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")){
            System.out.println(getExplicitType() + " is lazily swimming");
        } else {
            System.out.println(getExplicitType() + " is darting frantically");
        }
    }

    @Override
    public void makeNoise() {
        if (type.equals("Goldfish")){
            System.out.println("swish!");
        } else {
            System.out.println("splash!");
        }
    }

}
