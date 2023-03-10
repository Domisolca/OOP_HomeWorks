package HW3.GeoTree;

import java.util.ArrayList;
import java.util.Iterator;


public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        result = new ArrayList<>();

        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> searchDead() {

        result = new ArrayList<>();
        ArrayList<Person> resultAll = new ArrayList<>();

        for (Node t : tree) {

            if (!resultAll.contains(t.p1)) {
                resultAll.add(t.p1);
            }
        }

        Iterator<Person> iterator = resultAll.iterator();

        while (iterator.hasNext()){
            if (iterator.next().getDeadDate().equals("")){
                iterator.remove();
            }
        }

        for (Person person : resultAll) {
            result.add(person.fullName);
        }

        return result;
    }

    public ArrayList<String> searchAlive() {

        result = new ArrayList<>();

        ArrayList<Person> resultAll = new ArrayList<>();

        for (Node t : tree) {

            if (!resultAll.contains(t.p1)) {
                resultAll.add(t.p1);
            }
        }

        Iterator<Person> iterator = resultAll.iterator();

        while (iterator.hasNext()){
            if (!iterator.next().getDeadDate().equals("")){
                iterator.remove();
            }
        }

        for (Person person : resultAll) {
            result.add(person.fullName);
        }
        
        return result;
    }
}
