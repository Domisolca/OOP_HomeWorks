package HW1.GeoTree;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        Person vlad = new Person("Влад");
        Person nastya = new Person("Настя");
        GeoTree gt = new GeoTree();
        gt.appendPerentChild(irina, vasya);
        gt.appendPerentChild(irina, masha);
        gt.appendPerentChild(vasya, jane);
        gt.appendPerentChild(vasya, ivan);
        gt.appendWifeHusbent(irina, vlad);
        gt.appendWifeHusbent(nastya, vasya);

        irina.setDeadDate("01.01.2020");
        vlad.setDeadDate("01.01.2021");

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.wife));

        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.husbent));

        System.out.println(new Reserch(gt).searchDead());

        System.out.println(new Reserch(gt).searchAlive());
    }
}
