package HW1.ClosetPerson;

public class Person {
    public String name;
    public Boolean keyFlag;

    public Person(String name) {
        this.name = name;
        this.keyFlag = false;
    }

    public void getKey() {
        if (this.keyFlag){
            System.out.println(this.name + " уже имеет ключ!");
        }
        else{
            this.keyFlag = true;
            System.out.println(this.name + " получил ключ!");
        }
    }

    public void giveKey() {
        if (!this.keyFlag){
            System.out.println(this.name + " не имеет ключа!");
        }
        else{
            this.keyFlag = false;
            System.out.println(this.name + " отдал ключ!");
        }
    }
}
