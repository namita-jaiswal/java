package linkedList;

class Node {
int data; //char data; (array container)
Node1 next; //reference of self type (self-referential structure)
Node(int x) { //(constructor)
        data = x;
        next = null;
        }
}
class Test {
        public static void main(String[] args) {
                Node1 head=new Node1(10);
                Node1 temp1=new Node1(20);
                Node1 temp2=new Node1(30);
                head.next=temp1;
                head.next=temp2;
        }
}