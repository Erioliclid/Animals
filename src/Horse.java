public class Horse extends Animal {

    public Horse(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    String makeNoise() {
        return "Frrr";
    }
}
