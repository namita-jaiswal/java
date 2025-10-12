package array;

class Node2 {
    int data;
    Node2 next;
    Node2(int x){
        data=x;
        next=null;
    }
}
class Testt {
    static Node2 insertB(Node2 head, int x) {
        Node2 temp=new Node2(x);
        temp.next=head;
        return temp;
    }

    public static void main(String[] args) {
        Node2 head = null;
        head = insertB(head, 30);
        head = insertB(head, 20);
        head = insertB(head, 10);
    }
}