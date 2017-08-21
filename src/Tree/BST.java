package Tree;

/**
 * Created by mathenge on 21/08/2017.
 */
public class BST {
    private Node root;
    public BST(){
        root = null;
    }

    public boolean insert(Person item){
        Node n = new Node();
        n.data = item;
        n.leftChild = null;
        n.rightChild = null;
        if (root == null){
            root = n;
            return true;
        }
        Node p = root;
        Node c = root;
        while (c != null){
            p = c;
            if (item.getName().compareTo(c.data.getName()) < 0){
                c = c.leftChild;
            }else{
                c = c.rightChild;
            }
        }
        if (item.getName().compareTo(p.data.getName() < 0){
            p.leftChild = n;
        }else{
            p.rightChild = n;
        }

        return true;
    }

    public void showAll(Node n){
        Node p = n;
        if (p != null){
            System.out.println(" "+p.data);
            showAll(p.leftChild);
            showAll(p.rightChild);
        }
    }

    public class Node{
        private Node leftChild;
        private Person data;
        private Node rightChild;
    }
}
