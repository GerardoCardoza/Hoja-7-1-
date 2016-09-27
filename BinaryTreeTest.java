import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author
 */
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addNode method, of class BinaryTree.
     */
    @Test
    public void testAddNode() {
        System.out.println("addNode");
        Object key = null;
        Object name = null;
        BinaryTree instance = new BinaryTree();
        instance.addNode(key, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrderTraverseTree method, of class BinaryTree.
     */
    @Test
    public void testInOrderTraverseTree() {
        System.out.println("inOrderTraverseTree");
        Node focusNode = null;
        BinaryTree instance = new BinaryTree();
        instance.inOrderTraverseTree(focusNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preorderTraverseTree method, of class BinaryTree.
     */
    @Test
    public void testPreorderTraverseTree() {
        System.out.println("preorderTraverseTree");
        Node focusNode = null;
        BinaryTree instance = new BinaryTree();
        instance.preorderTraverseTree(focusNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postOrderTraverseTree method, of class BinaryTree.
     */
    @Test
    public void testPostOrderTraverseTree() {
        System.out.println("postOrderTraverseTree");
        Node focusNode = null;
        BinaryTree instance = new BinaryTree();
        instance.postOrderTraverseTree(focusNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNode method, of class BinaryTree.
     */
    @Test
    public void testFindNode() {
        System.out.println("findNode");
        Object key = null;
        BinaryTree instance = new BinaryTree();
        Node expResult = null;
        Node result = instance.findNode(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findName method, of class BinaryTree.
     */
    @Test
    public void testFindName() {
        System.out.println("findName");
        String key = "";
        BinaryTree instance = new BinaryTree();
        String expResult = "";
        String result = instance.findName(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
