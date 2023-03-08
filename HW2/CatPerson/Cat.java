package HW2.CatPerson;

public class Cat extends Animal implements Say, Smellable{

    public Cat(String name) {
        super(name);
    }


    @Override
    public void voice(Person person) {
        if(this.status == Status.free){
            System.out.println(this.name + " говорит " + person.name + " Мяу");
        }
        else{
            System.out.println(this.name + " занята!");
        }
    }


    @Override
    public void smell(Person person) {
        if(this.status == Status.free){
            System.out.println("Кошка " + this.name + " обнюхивает " + person.name);
        }
        else{
            System.out.println("Кошка " + this.name + " занята!");
        }
    }
}
