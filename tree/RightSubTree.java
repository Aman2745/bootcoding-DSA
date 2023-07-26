package tree;

import java.util.ArrayList;
import java.util.List;

public class RightSubTree {
    public List<Integer>rightorder(TreeNode root){
        List<Integer>values=new ArrayList<>();
        rightOrder(root,values);
        return values;
    }
    public void rightOrder(TreeNode currentNode,List<Integer>values){
        if(currentNode==null){
            return;
        }
        rightOrder(currentNode.right,values);
        values.add(currentNode.data);
        rightOrder(currentNode.left,values);
    }
}
