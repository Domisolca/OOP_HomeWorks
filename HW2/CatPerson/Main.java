package HW2.CatPerson;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        Cat cat = new Cat("Алиса");

        cat.voice(ivan);

        cat.setStatus(Status.busy);

        cat.smell(ivan);

        cat.setStatus(Status.free);

        cat.smell(ivan);

        Dog dog = new Dog("Шарик");
        dog.voice(ivan);
        dog.smell(ivan);

        Fish fish = new Fish("Долли");
        fish.swim();
    }
}
