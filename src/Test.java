public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Veterinarian vet = new Veterinarian();

        Cat cat = new Cat("Kitty", "mouses", "houses");
        Horse horse = new Horse("Loshad", "grass", "field");
        Dog dog = new Dog("Sparky", "meat", "doghouse");

        Cat cat1 = (Cat) cat.clone();

        Animal[] animalQueue = {cat, horse, dog,cat1};

        try {
            for (int i = 0;i<=animalQueue.length;i++ ) {
                vet.treatAnimal(animalQueue[i]);
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println();
            System.out.println(e);
            System.out.println("Find more animals");
        }
    }
}

