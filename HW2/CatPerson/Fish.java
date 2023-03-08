package HW2.CatPerson;

public class Fish extends Animal implements Swimmable{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Рыбка " + this.name + " плывет");
    }
    
}
