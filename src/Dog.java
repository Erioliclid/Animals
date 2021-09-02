public class Dog extends Animal{

    public Dog(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    String makeNoise() {
        return "Woof-woof";
    }

}
