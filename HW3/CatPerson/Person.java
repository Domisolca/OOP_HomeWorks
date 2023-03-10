package HW3.CatPerson;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal an1, Animal an2){
        if (an1.compareTo(an2) >= 0){
            System.out.println(this.name + " покормил " + an1.name);
        }
        else{
            System.out.println(this.name + " покормил " + an2.name);
        }
    }
}
