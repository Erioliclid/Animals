public class Cat extends Animal implements Cloneable{

    public Cat(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    String makeNoise() {
        return "Meow";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
