/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
      return  add(root,val,depth,1);
    }
    public TreeNode add(TreeNode root , int val , int depth , int currdepth){
        if(depth == 1){
            TreeNode zoo = new TreeNode(val);
            zoo.left = root;
            return zoo;
        }

        if(root == null) return root;

        if(currdepth == depth-1){

        TreeNode leftChild = root.left;
        TreeNode rightChild = root.right;

        root.left = new TreeNode(val);
        root.right = new TreeNode(val);

        root.left.left = leftChild;
        root.right.right = rightChild;
        return root;
        }

        add(root.left , val , depth ,currdepth+1);
        add(root.right , val , depth , currdepth+1);
        return root;
    }
}