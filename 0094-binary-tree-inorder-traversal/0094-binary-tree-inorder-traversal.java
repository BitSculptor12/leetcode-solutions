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
    public List<Integer> inorderTraversal(TreeNode root) {
      TreeNode curr =root;
      List<Integer> arr = new ArrayList<>();
      while(curr!=null){
        if(curr.left!=null){
            TreeNode pred =curr.left;
            while(pred.right!=null&&pred.right!=curr){ //this is for link break
            pred =pred.right;
            
            }
            if(pred.right==null){ //connect pred with curr
                pred.right=curr;
                curr=curr.left;
            }
            if(pred.right==curr){  //unlink pred and curr
                pred.right=null;
                arr.add(curr.val);
                curr = curr.right;
            }
        }
        else{  //curr/left=null ,no pred  pred=predesor
arr.add(curr.val);
curr=curr.right;
        }
      }  
      return arr;
    }
}

//1st method
// class Solution {
//         private  static void Inorder(TreeNode root,List<Integer> ans){
//         if(root==null) return;
//         Inorder(root.left,ans);
//         ans.add(root.val);
//         Inorder(root.right,ans);
//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         Inorder(root,ans);
//         return ans;
//     }
// }