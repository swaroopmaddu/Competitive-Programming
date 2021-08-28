import java.util.Stack;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null) return false;
        
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<Integer> sumStack = new Stack<Integer>();
        
        nodeStack.add(root);
        sumStack.add(targetSum-root.val);
        
        while(!nodeStack.isEmpty()){
            
            TreeNode current = nodeStack.pop();
            int currentSum = sumStack.pop();
            
            if(current.left==null && current.right==null && currentSum==0) return true;
            
            if(current.left!=null){
                nodeStack.add(current.left);
                sumStack.add(currentSum-current.left.val);
            }
            if(current.right!=null){
                nodeStack.add(current.right);
                sumStack.add(currentSum-current.right.val);
            }
            
        }
        return false;
    }
}
