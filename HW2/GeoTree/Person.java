package HW2.GeoTree;

/**
 * Person
 */
public class Person {

    public String fullName;

    private String deadDate;

    public Person(String fullName) {
        this.fullName = fullName;
        this.deadDate = "";
    }

    public Person(String fullName, String deadDate) {
        this.fullName = fullName;
        this.deadDate = deadDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDeadDate(String deadDate) {
        this.deadDate = deadDate;
    }

    public String getDeadDate() {
        return deadDate;
    }
}