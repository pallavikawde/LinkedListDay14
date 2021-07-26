public class UCClassLinkedList {
    public static void main(String[] args){
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);


//UC2
        System.out.println("Printing Linked List");
        myLinkedList.printNodes();

        //UC3
        System.out.println("Printing Linked List after appending");
        INode<Integer> myFourthNode = new MyNode<>(20);
        myLinkedList.append(myFourthNode);
        myLinkedList.printNodes();

        //UC4
        System.out.println("Linked list after Inserting a element in between");
        INode<Integer> myFifthNode = new MyNode<>(23);
        myLinkedList.insert(mySecondNode,myFifthNode);
        myLinkedList.printNodes();

        //UC5
        System.out.println("Link List after pop method");
        myLinkedList.pop();
        myLinkedList.printNodes();


        //UC6
        System.out.println("Linked List after popLast Method calling");
        myLinkedList.popLast();
        myLinkedList.printNodes();

        //UC7
        System.out.println("Linked List after search Method calling");
        myLinkedList.search(30);
        myLinkedList.printNodes();

        //UC8
        System.out.println("Linked list after Inserting a element in between");
        INode<Integer> mySixthNode = new MyNode<>(40);
        myLinkedList.insert(mySecondNode,mySixthNode);
        myLinkedList.printNodes();


    }
}