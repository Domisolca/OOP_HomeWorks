package HW2.CatPerson;

public abstract class Animal {
    protected String name;
    protected Status status;

    public Animal(String name) {
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
}
