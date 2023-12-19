package org.agent47.binarytree;

public class BinaryTree<T extends Number> {
    BinaryTreeNode<T> root;
    public void insert(T value){
        root=insertRec(root,value);
    }
    private BinaryTreeNode<T> insertRec(BinaryTreeNode<T> root,T value){
        if(root==null){
            root = new BinaryTreeNode<>(value);
        }
        else if (compare(root.value,value)){
            root.leftNode=insertRec(root.leftNode,value);
        }
        else {
            root.rightNode=insertRec(root.rightNode,value);
        }
        return root;

    }
    public void inOrder(){
        inOrderRec(root);
    }
    public void inOrderRec(BinaryTreeNode<T> root){
        if (root!=null){
            inOrderRec(root.leftNode);
            System.out.print(root.getValue()+" ");
            inOrderRec(root.rightNode);
        }

    }
    private Boolean compare(T num1, T num2) {
        double val1 = num1.doubleValue(); // Extract numerical value from num1
        double val2 = num2.doubleValue(); // Extract numerical value from num2
        // Perform comparison
        if (val1 < val2) {
            return false;
        } else if (val1 > val2) {
            return true;
        } else {
            return true;
        }
    }


}
