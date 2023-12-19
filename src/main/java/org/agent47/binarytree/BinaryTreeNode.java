package org.agent47.binarytree;

public class BinaryTreeNode<T extends Number> {
    T value;

    BinaryTreeNode<T> leftNode;
    BinaryTreeNode<T> rightNode;
    public BinaryTreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

