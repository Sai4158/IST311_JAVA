import java.util.ArrayList;

public class MergerTwoLists {

    public ArrayList<Integer> mergeTwoLists(ArrayList<Integer> left, ArrayList<Integer> right) {
        // Initialize the merged list
        ArrayList<Integer> mergedList = new ArrayList<>();

        // While both lists are not empty
        while (!left.isEmpty() && !right.isEmpty()) {
            // If the first item on the left is smaller or equal to the first item on the right
            if (left.get(0) <= right.get(0)) {
                mergedList.add(left.remove(0)); // Add and remove from left
            } else {
                mergedList.add(right.remove(0)); // Add and remove from right
            }
        }

        // Add remaining elements
        mergedList.addAll(left);
        mergedList.addAll(right);

        return mergedList;
    }
}
//Test-Driven Development (TDD).
//org.opentest4j.AssertionFailedError
//        Expected :[0, 1, 45, 3, 4, 5]
//        Actual   :[0, 1, 2, 3, 4, 5]
