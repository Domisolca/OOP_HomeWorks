package HW1.GeoTree;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendPerentChild(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendWifeHusbent(Person wife, Person husbent) {
        tree.add(new Node(wife, Relationship.wife, husbent));
        tree.add(new Node(husbent, Relationship.husbent, wife));
    }
}
