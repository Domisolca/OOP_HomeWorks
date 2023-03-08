package HW2.GeoTree;

import java.util.ArrayList;

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

        for (Node t : tree) {

            if (!t.p1.getDeadDate().equals("") && !result.contains(t.p1.fullName)) {
                result.add(t.p1.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> searchAlive() {

        result = new ArrayList<>();

        for (Node t : tree) {

            if (t.p1.getDeadDate().equals("") && !result.contains(t.p1.fullName)) {
                result.add(t.p1.fullName);
            }
        }
        return result;
    }
}
