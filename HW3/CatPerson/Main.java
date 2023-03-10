package HW3.CatPerson;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        Cat cat = new Cat("Алиса", 10);
        

        cat.voice(ivan);

        cat.setStatus(Status.busy);

        cat.smell(ivan);

        cat.setStatus(Status.free);

        cat.smell(ivan);

        Dog dog = new Dog("Шарик", 40);
        dog.voice(ivan);
        dog.smell(ivan);

        Fish fish = new Fish("Долли", 50);
        fish.swim();

        Animal fish2 = new Fish("Приятель", 40);
        Animal cat2 = new Cat("Алиса", 20);
        Animal cat3 = new Cat("Рыжик", 30);

        System.out.println(cat.equals(fish2)); 
        System.out.println(cat.equals(cat2));
        System.out.println(cat.equals(cat3));

        ivan.feedAnimal(cat2, cat3);
        ivan.feedAnimal(fish2, cat3);
    }
}
