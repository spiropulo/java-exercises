package exercise;

import java.util.*;

public class BinaryTree {
    /**
     * Returns a set of nodes without parents.
     * @param input
     * @return set of nodes without parents
     */
    public static Set<Integer> noParents(List<ParentChild> input) {
        Set<Integer> parents = new HashSet<>();
        Set<Integer> children = new HashSet<>();

        input.forEach(pc -> {
            parents.add(pc.getParent());
            children.add(pc.getChild());
        });

        parents.removeAll(children);
        return parents;
    }

    /**
     * Returns a set nodes that have ONLY one parent.
     * @param input
     * @return set of nodes with ONLY one parent.
     */
    public static Set<Integer> oneParent(List<ParentChild> input) {
        Set<Integer> children = new HashSet<>();
        Map<Integer, Integer> tracker = new HashMap<>();
        Set<Integer> result = new HashSet<>();

        input.forEach(pc -> {
            children.add(pc.getChild());
            if(tracker.containsKey(pc.getChild())){
                tracker.put(pc.getChild(), tracker.get(pc.getChild()) + 1);
            } else {
                tracker.put(pc.getChild(), 1);
            }
        });

        tracker.forEach((key, value) -> {if(value == 1){
            result.add(key);
        }});
        return result;
    }

    public static List<Set<Integer>> returnAll(List<ParentChild> input){
        List<Set<Integer>> result = new ArrayList<>();
        result.add(BinaryTree.noParents(input));
        result.add(BinaryTree.oneParent(input));
        return result;
    }
}
