package HW1.ClosetPerson;

public class Closet {

    public String model;

    public Status status;

    public Closet(String model) {
        this.model = model;
        this.status = Status.close;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void openCloset(Person person) {

        if (person.keyFlag) {
            if (this.status == Status.open) {
                System.out.println(model + " уже открыт!");
            } else {
                this.status = Status.open;
                System.out.println(model + " открыт!");
            }
        } else {
            System.out.println(person.name + " не имеет ключа!");
        }
    }

    public void closeCloset(Person person) {
        if (person.keyFlag) {
            if (this.status == Status.close) {
                System.out.println(model + " уже закрыт!");
            } else {
                this.status = Status.close;
                System.out.println(model + " закрыт!");
            }
        } else {
            System.out.println(person.name + " не имеет ключа!");
        }
    }
}
