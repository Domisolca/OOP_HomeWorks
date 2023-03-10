package HW3.CatPerson;

public class Fish extends Animal implements Swimmable{

    public Fish(String name, int hunger) {
        super(name, hunger);
    }

    @Override
    public void swim() {
        System.out.println("Рыбка " + this.name + " плывет");
    }
    
}
