package h15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class task2test {
  @Test
  void testTask2() {
    Task2 task = new Task2();

    TreeNode root1 =
        new TreeNode(
            10,
            new TreeNode(5, new TreeNode(3), new TreeNode(7)),
            new TreeNode(15, null, new TreeNode(18)));

    assertEquals(32, task.rangeSumBST(root1, 7, 15));

    TreeNode root2 =
        new TreeNode(
            10,
            new TreeNode(
                5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)),
            new TreeNode(15, new TreeNode(13), new TreeNode(18)));

    assertEquals(23, task.rangeSumBST(root2, 6, 10));
  }
}
