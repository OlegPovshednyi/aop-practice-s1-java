package h15;

public class TreeNode {
  int val;
  h15.TreeNode left;
  h15.TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, h15.TreeNode left, h15.TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
