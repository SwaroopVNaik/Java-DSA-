package Stacks;

public class StackDemo {

    public static void main(String[] args)
    {
        Stackcreation mystack = new Stackcreation(10);

        // we hv to do always pop first before we push the elements
        // so that we check if stack is created perfectly

        mystack.pop();
        mystack.peek();
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);
        mystack.push(60);
        mystack.push(70);
        mystack.push(80);
        mystack.push(90);
        mystack.push(100);
        System.out.println(mystack.peek()); 
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();

    }

}
