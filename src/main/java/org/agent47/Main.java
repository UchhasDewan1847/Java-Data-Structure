package org.agent47;

import org.agent47.binarytree.BinaryTree;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(52);
        linkedList.insert(2);
        linkedList.insert(23);
        linkedList.insertAtStart(13);
        linkedList.insertAt(0,100);
        linkedList.show();
        linkedList.deleteAt(2);
        System.out.println("After Deleting from 2");
        linkedList.show();
        System.out.println("From here on We have Stack--");
        System.out.println();
        Stack<String> stacks = new Stack<>();
        stacks.add("adfg");
        stacks.add("the second");
        stacks.add("1");
        stacks.add("adfg");
        stacks.add("the second");
        stacks.add("1");stacks.add("adfg");
        stacks.add("the second");
        stacks.add("the second");
        stacks.add("1");stacks.add("adfg");
        stacks.add("the second");
        System.out.println(stacks.contains("the second"));
        System.out.println(stacks.capacity());
        System.out.println(stacks.size());
        stacks.pop();
        stacks.pop();
        stacks.pop();
        stacks.pop();
        stacks.pop();
        stacks.pop();
        stacks.pop();
        stacks.pop();
        stacks.pop();
        stacks.pop();
        stacks.pop();
        stacks.pop();
        System.out.println(stacks.size());
        System.out.println(stacks.capacity());
        int[] arr = {4,2,5,9,7,4,8};
        int result =maxProductDifference(arr);
        System.out.println(result);
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insert(8);
        binaryTree.insert(7);
        binaryTree.insert(12);
        binaryTree.insert(15);
        binaryTree.insert(2);
        binaryTree.insert(5);
        binaryTree.inOrder();
        java.util.LinkedList
                <Integer> list = new java.util.LinkedList<>();
        list.add(3);
        list.offer(4);
        System.out.println(list);
        System.out.println(list.peek());
        Integer[] testList = new Integer[10];
        Integer[] testListTemp = {3,25,5,1,5};
        System.out.println(Arrays.toString(testListTemp));
        System.out.println(Arrays.toString(testList));
        System.arraycopy(testListTemp, 0, testList, 0, 5);
        System.out.println(Arrays.toString(testList));
        System.out.println(myPow(2,2147483647));
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int max =nums[len-1]* nums[len-2];
        int min = nums[0]*nums[1];
        return max-min;
    }
    public static double myPow(double x, int n) {
        double result = 1;
        if(n<0){
            x=(1/x);
            n=n*(-1);
        }

        for(int i=0;i<n;i++){
            result*=x;
        }
        return result;
    }
}