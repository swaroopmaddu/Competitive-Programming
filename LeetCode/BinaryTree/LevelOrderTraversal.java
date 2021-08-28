import java.util.*;
class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root==null) return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            
            List<Integer> row = new ArrayList<Integer>();
            int size =  queue.size();
            
            while(size-->0) {
                TreeNode current = queue.poll();
                
                row.add(current.val);
                
                if(current.left!=null) {
                    queue.offer(current.left);
                }
                if(current.right!=null) {
                    queue.offer(current.right);
                }
                
            }
            result.add(row);
        }
        return result;
    }   
}