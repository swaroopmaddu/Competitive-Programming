import java.util.*;

public class PostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();

        if(root==null) return list;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode currNode = stack.pop();

            list.add(0,currNode.val);

            if(currNode.left!=null){
                stack.push(currNode.left);
            }
            if(currNode.right!=null){
                stack.push(currNode.right);
            }
        }
        return list;
    }
}
