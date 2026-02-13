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
    List<TreeNode> arr = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return arrtobst(0, arr.size()-1);
    }
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        arr.add(root);
        inorder(root.right);
        
    }
    TreeNode arrtobst(int s, int e){
        if(s>e) return null;
        int m = (s+e)/2;
        TreeNode root = arr.get(m);
        root.left = arrtobst(s,m-1);
        root.right = arrtobst(m+1,e);
        return root;
    }
}