public abstract class Animal {

    String name;
    String food;
    String location;


    abstract String makeNoise();

    String eat() {
        return name+" eat " + food;
    }

    String sleep() {
        return name+" Sleep at night";
    }

    String lifeArea() {
        return name+" live in " + location;
    }

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }
}
