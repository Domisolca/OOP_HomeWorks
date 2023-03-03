package HW1.CatPerson;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        Cat cat = new Cat("Алиса");

        cat.sayMeow(ivan);

        cat.setStatus(Status.busy);

        cat.smellPerson(ivan);

        cat.setStatus(Status.free);

        cat.smellPerson(ivan);
    }
}
