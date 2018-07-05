/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 class Solution {
     public boolean findTarget(TreeNode root, int k) {
         List<Integer> set = new ArrayList();
         return dsf(set, root, k);
     }

     private boolean dsf(List<Integer> set, TreeNode node, int target) {
         if (node == null) {
             return false;
         }
         if (set.contains(target - node.val)) {
             return true;
         }
         set.add(node.val);
         return dsf(set, node.left, target) || dsf(set, node.right, target);
     }
 }
