package tree;

public class MaxElement {
    public int Inoroder(TreeNode root){
        if(root==null){
            return  Integer.MIN_VALUE;
        }
        int value=root.data;
        int leftvalue=Inoroder(root.left);
        int rightvalue=Inoroder(root.right);
        if(leftvalue>value){
            value=leftvalue;
        } else if (rightvalue>value) {
            value=rightvalue;
        }
return value;
    }


}

