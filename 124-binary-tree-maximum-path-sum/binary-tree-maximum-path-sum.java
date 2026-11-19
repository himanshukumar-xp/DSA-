class Solution {
    int maxPath;


    public int getMaxPath(TreeNode n) {
        if (n == null)
            return 0;


        int leftMax = Math.max(this.getMaxPath(n.left), 0);
        int rightMax = Math.max(this.getMaxPath(n.right), 0);
        int total = n.val + leftMax + rightMax;
        this.maxPath = Math.max(total, this.maxPath);


        return n.val + Math.max(leftMax, rightMax);
    }


    public int maxPathSum(TreeNode root) {
        this.maxPath = Integer.MIN_VALUE;
        this.getMaxPath(root);
        return this.maxPath;
    }
}