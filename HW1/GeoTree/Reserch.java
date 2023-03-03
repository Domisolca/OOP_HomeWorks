package HW1.GeoTree;

import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultDead = new ArrayList<>();
    ArrayList<String> resultAlive = new ArrayList<>();

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> searchDead() {

        for (Node t : tree) {

            if (!t.p1.deadDate.equals("") && !resultDead.contains(t.p1.fullName)) {
                resultDead.add(t.p1.fullName);
            }
        }
        return resultDead;
    }

    public ArrayList<String> searchAlive() {

        for (Node t : tree) {

            if (t.p1.deadDate.equals("") && !resultAlive.contains(t.p1.fullName)) {
                resultAlive.add(t.p1.fullName);
            }
        }
        return resultAlive;
    }
}
