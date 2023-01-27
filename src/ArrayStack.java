import java.util.EmptyStackException;

public class ArrayStack {
    private Student[] stack;
    private int top;

    public ArrayStack (int capacity){
        stack = new Student[capacity];
    }

    public void push (Student employee){
        if(top == stack.length){
            //resize element array
            Student[] newArray = new Student[2 * stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;

        }
        stack[top++] = employee;
    }

    public Student pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Student employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public Student peek(){
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        return stack[top-1];
    }
    public int size(){
        return top;
    }

    public void printStack(){
        for(int i = top - 1; i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}