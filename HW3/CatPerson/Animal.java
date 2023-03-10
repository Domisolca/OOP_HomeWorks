package HW3.CatPerson;

public abstract class Animal implements Comparable<Animal>{
    protected String name;
    protected Status status;
    protected int hunger;

    public Animal(String name, int hunger) {
        this.name = name;
        this.status = Status.free;
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
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
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else return this.getName().equals(((Animal) obj).getName());
    }

    @Override
    public int compareTo(Animal o) {
        return this.getHunger() - o.getHunger();
    }

}
