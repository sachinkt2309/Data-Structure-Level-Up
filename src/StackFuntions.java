public class StackFuntions {
    public static void main(String[] args) {
        Stacks stacks=new Stacks();
        stacks.push(10);  // pushing
        stacks.push(20);
        stacks.push(25);
        stacks.push(12);
        stacks.push(45);
        stacks.show();
        stacks.push(35);
        stacks.show();
        System.out.println("poped element: "+stacks.pop()); // poping
        stacks.show();
        stacks.peek();
        stacks.size();
        System.out.println("poped element: "+stacks.pop()); // poping
        stacks.size();

    }
}
class Stacks{
 int stack[]=new int[5];
 int top=0;
    public void push(int n) {
        if(top==stack.length)
            System.out.println("stack is full");
        else
            stack[top++] = n;
    }

    public void show() {
        for (int n: stack) {
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public int pop() {
        if(top<=0){
            System.out.println("stack is empty");
           return 0;
        }
        else {
            int data = stack[--top];
            stack[top] = 0;
            return data;
        }
    }

    public void peek() {
        System.out.println("top element: "+stack[--top]);
    }

    public void size() {
        System.out.println("total size: "+top);
    }
}
