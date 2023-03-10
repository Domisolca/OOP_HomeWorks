package HW3.CatPerson;

public class Dog extends Animal implements Say, Smellable{

    public Dog(String name, int hunger) {
        super(name, hunger);
    }

    @Override
    public void voice(Person person) {
        if(this.status == Status.free){
            System.out.println(this.name + " говорит " + person.name + " Гав");
        }
        else{
            System.out.println(this.name + " занят!");
        }
    }

    @Override
    public void smell(Person person) {
        if(this.status == Status.free){
            System.out.println("Собака " + this.name + " обнюхивает " + person.name);
        }
        else{
            System.out.println("Собака " + this.name + " занята!");
        }
    }
    
}
