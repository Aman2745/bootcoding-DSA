package tree;

import java.util.ArrayList;
import java.util.List;

public class LeftSubTree {
    public List<Integer>leftsubtree(TreeNode root){
        List<Integer>values=new ArrayList<>();
        leftSubTree(root,values);
        return values;
    }
    public void leftSubTree(TreeNode currentNode,List<Integer>value){
        if(currentNode==null){
            return;
        }
        leftSubTree(currentNode.left,value);
        leftSubTree(currentNode.right,value);
        value.add(currentNode.data);

    }
}
