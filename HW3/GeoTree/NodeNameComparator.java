package HW3.GeoTree;

import java.util.Comparator;

public class NodeNameComparator implements Comparator<Node>{

    @Override
    public int compare(Node o1, Node o2) {
        return o1.p1.getFullName().compareTo(o2.p1.getFullName());
    }

    
}
