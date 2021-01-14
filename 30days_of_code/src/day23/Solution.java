package day23;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
public class Solution {
    static void levelOrder(Node root){
        if (root == null) {
            return;
        }
        ArrayDeque<Node> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(root);

        while (!arrayDeque.isEmpty()) {
            Node n = arrayDeque.removeFirst();
            System.out.print(n.data + " ");

            if (n.left != null) {
                arrayDeque.addLast(n.left);
            }

            if (n.right != null) {
                arrayDeque.addLast(n.right);
            }
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
