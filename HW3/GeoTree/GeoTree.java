package HW3.GeoTree;

import java.util.ArrayList;
import java.util.HashMap;

public class GeoTree implements Printable{
    private ArrayList<Node> tree = new ArrayList<>();

    private HashMap<Relationship, Relationship> oppositeRe = new HashMap<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    private void setOppositeRe() {
        this.oppositeRe.put(Relationship.parent, Relationship.children);
        this.oppositeRe.put(Relationship.wife, Relationship.husbent);
    }

    public Relationship getOppositeRe(Relationship re){
        if (re == Relationship.parent){
            return Relationship.children;
        }
        else {
            return Relationship.husbent;
        }
    }

    public void append(Person person1, Person person2, Relationship re) {
        setOppositeRe();
        tree.add(new Node(person1, re, person2));
        tree.add(new Node(person2, oppositeRe.get(re), person1));
    }

    @Override
    public void print() {
        for (Node t : tree) {
            if(t.re == Relationship.wife){
                System.out.println(t.p1.fullName);
                System.out.println(t.p2.fullName);
                for (Node t1 : tree) {
                    if(t1.re == Relationship.parent && t1.p1 == t.p1){
                        System.out.println(t1.p2.fullName);
                    }
                }
                for (Node t2 : tree) {
                    if(t2.re == Relationship.parent && t2.p1 == t.p2){
                        System.out.println(t2.p2.fullName);
                    }
                }
            }
            
        }
    }

    public void printP1(){
        for (Node t : tree){
            System.out.println(t.p1.getFullName());
        }
    }

}
