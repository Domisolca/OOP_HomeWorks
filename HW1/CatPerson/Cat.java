package HW1.CatPerson;

public class Cat {
    public String name;
    public Status status;

    public Cat(String name) {
        this.name = name;
        this.status = Status.free;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void sayMeow(Person person){
        if(this.status == Status.free){
            System.out.println(this.name + " говорит " + person.name + " Мяу");
        }
        else{
            System.out.println(this.name + " занята!");
        }
    }

    public void smellPerson(Person person){
        if(this.status == Status.free){
            System.out.println(this.name + " обнюхивает " + person.name);
        }
        else{
            System.out.println(this.name + " занята!");
        }
    }
}
