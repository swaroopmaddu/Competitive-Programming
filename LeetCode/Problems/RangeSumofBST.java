class RangeSumofBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        else{
            if(root.val>=low && root.val<=high){
                return root.val+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
            }
            return rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
        }
    }
}