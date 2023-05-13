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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty()){
            int level = que.size();
            List<Integer> currLevel = new ArrayList<>();

            while(level-- > 0){
                TreeNode curr = que.poll();
                currLevel.add(curr.val);

                if(curr.left != null)
                    que.offer(curr.left);
                if(curr.right != null)
                    que.offer(curr.right);
            }
            ans.add(currLevel);
        }
        return ans;
    }
}
