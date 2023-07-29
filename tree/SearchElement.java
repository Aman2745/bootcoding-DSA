package tree;

public class SearchElement {
    public boolean search(TreeNode root,int element){
        if(root==null){
            return false;
        }
        if(root.data==element){
            return true;
        }
        boolean res=search(root.left,element);
        if(res){
            return  true;
        }
        return  search(root.right,element);
    }
}
