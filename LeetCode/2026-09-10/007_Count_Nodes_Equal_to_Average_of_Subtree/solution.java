class Solution {
    int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }
