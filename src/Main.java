public class Main {
    public static void main(String[] args) {
//        Stack stack = new StackArray();
//        stack.push("String");
//        stack.push(12);
//        stack.peek();
//        System.out.println("Pop: "+stack.pop());
//        stack.peek();
//        System.out.println("Pop: "+ stack.pop());
//        stack.peek();
//        System.out.println("Pop: "+ stack.pop());
//        System.out.println(stack.isEmpty());
//
        StackLinkedList stack = new StackLinkedList();
        stack.push(5);
        stack.push("Its a String.");
        stack.peek();
        System.out.println(stack.top.getItem());
//        System.out.println(stack.top.getNext().getItem());
        System.out.println(stack.top.getNext().getNext());


    }
}