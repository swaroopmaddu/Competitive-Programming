public class BinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        if(len==0) return null;
        return buildTreeRec(inorder,0,len,postorder,0,len);
    }
    
    public TreeNode buildTreeRec(int[] inorder,int i1, int i2, int[] postorder, int p1, int p2) {
        
        if(i1>=i2 || p1>=p2) return null;
        
        TreeNode root =  new TreeNode(postorder[p2-1]);
        
        int end = 0;
        for(int i=i1;i<i2;i++){
            if(inorder[i]==postorder[p2-1]){
                end = i;
                break;
            }
        }
        int diff = end-i1;
        root.left = buildTreeRec(inorder, i1, i1+diff, postorder, p1, p1+diff);
        root.right = buildTreeRec(inorder, i1+diff+1, i2, postorder, p1+diff, p2-1);
        return root;   
    }
}
