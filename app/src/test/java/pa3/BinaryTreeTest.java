package pa3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    // Add tests for the BinaryTree class here

    @Test
    public void testLevelOrderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        assertEquals("1 2 3 4 5 6 7 ", tree.levelOrderTraversal());
    }

    @Test
    public void addtoEmpty(){
        BinaryTree tree = new BinaryTree();
        tree.add(10);
        assertEquals("10 ", tree.levelOrderTraversal());
    }

    @Test
    public void invertTree(){
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        tree.invert();
        assertEquals("1 3 2 7 6 5 4 ", tree.levelOrderTraversal());
    }

    @Test
    public void testHeight(){
        BinaryTree tree = new BinaryTree();
        assertEquals(-1, tree.getHeight());
        tree.add(1);
        tree.add(2);
        tree.add(3);
        assertEquals(1, tree.getHeight());
        tree.add(4);
        tree.add(5);
        assertEquals(2, tree.getHeight());
    }

    @Test
    public void emptyBinaryTree(){
        BinaryTree tree = new BinaryTree();
        assertEquals("", tree.levelOrderTraversal());
    }
}
