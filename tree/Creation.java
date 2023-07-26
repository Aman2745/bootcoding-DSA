package tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data=data;
    }

    public TreeNode(int data, TreeNode left, TreeNode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }

}
public class Creation {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>values=new ArrayList<Integer>();
        inOrder(root,values);
        return values;
    }
    public void inOrder(TreeNode currentNode,List<Integer>values){
        if(currentNode==null){
            return;
        }
        inOrder(currentNode.left,values);
        values.add(currentNode.data);
        inOrder(currentNode.right,values);
    }
    public static void main(String[] args) {
      TreeNode root=new TreeNode(70);
      root.right=new TreeNode(50);
      root.left=new TreeNode(60);
      Creation c=new Creation();
        System.out.println(c.inorderTraversal(root));
    }
}
