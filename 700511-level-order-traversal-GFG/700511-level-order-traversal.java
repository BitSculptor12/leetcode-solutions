/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> pq = new ArrayDeque<>();
        pq.add(root);
        while(!pq.isEmpty()){
           int size= pq.size();
           ArrayList<Integer> list = new ArrayList<>();
           for(int i=0;i<size;i++){
            Node curr = pq.poll();
            list.add(curr.data);
            if(curr.left!=null) pq.add(curr.left);
            if(curr.right!=null) pq.add(curr.right);
           }
           ans.add(list);
        }
        return ans;
    }
}