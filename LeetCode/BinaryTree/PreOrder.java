import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return list;

    }
}
