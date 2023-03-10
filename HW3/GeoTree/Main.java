package HW3.GeoTree;

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
        gt.append(irina, vasya, Relationship.parent);
        gt.append(irina, masha, Relationship.parent);
        gt.append(vasya, jane, Relationship.parent);
        gt.append(vasya, ivan, Relationship.parent);
        
        gt.append(irina, vlad, Relationship.wife);
        gt.append(nastya, vasya, Relationship.wife);

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

        gt.print();

        Person irina2 = new Person("Ирина");
        System.out.println(irina.equals(irina2));
        System.out.println(irina.equals(masha));

        gt.getTree().sort(new NodeNameComparator());

        gt.printP1();
    }
}
