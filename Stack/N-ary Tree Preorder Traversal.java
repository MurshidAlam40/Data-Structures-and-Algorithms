/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        if(root == null){
            return ans;
        }

        while(!st.isEmpty()){
            Node curr = st.pop();
            ans.add(curr.val);
            //pushing in chidren in reverse order
            for(int i=curr.children.size()-1; i>=0; i--){
                st.push(curr.children.get(i));
            }
        }
        return ans;
    }
}
