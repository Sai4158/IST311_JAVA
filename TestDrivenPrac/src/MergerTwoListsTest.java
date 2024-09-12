import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MergerTwoListsTest {

    @Test
    void testMergeTwoEmptyLists() {
        MergerTwoLists app = new MergerTwoLists();

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        ArrayList<Integer> result = app.mergeTwoLists(left, right);

        assertTrue(result.isEmpty());
    }

    @Test
    void testMergeSmallList() {
        MergerTwoLists app = new MergerTwoLists();

        ArrayList<Integer> left = new ArrayList<>();
        left.add(0);
        left.add(2);
        left.add(4);

        ArrayList<Integer> right = new ArrayList<>();
        right.add(1);
        right.add(3);
        right.add(5);

        ArrayList<Integer> result = app.mergeTwoLists(left, right);

        // Create the expected result list
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(45);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        assertEquals(expected, result);
    }
}
