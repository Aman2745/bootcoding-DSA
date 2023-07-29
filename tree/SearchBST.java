package tree;

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;

        if(val<root.data)
            return searchBST(root.left, val);
        if(val>root.data)
            return searchBST(root.right, val);
        if(val == root.data)
            return root;

        return null;
    }
}
