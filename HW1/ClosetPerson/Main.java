package HW1.ClosetPerson;

public class Main {

    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        Closet closet = new Closet("Плотяной шкаф");

        closet.openCloset(ivan);

        ivan.getKey();

        closet.openCloset(ivan);

        ivan.giveKey();

        closet.closeCloset(ivan);

        ivan.getKey();
        
        closet.closeCloset(ivan);
    }
    
}
