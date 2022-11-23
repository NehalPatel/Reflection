import java.util.ArrayList;

public class Exam {
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
        int num = stack.pop();
        System.out.println(num);
        stack.print();

        Stack<String> stack1 = new Stack<String>();
        stack1.push("Nehal");
        stack1.push("Taral");
        stack1.push("Viral");
        stack1.push("Sujal");
        stack1.print();
        String name = stack1.pop();
        System.out.println(name);
        stack1.print();
    }
}

class Stack<T> {
    ArrayList<T> myarraylist;

    Stack()
    {
        this.myarraylist = new ArrayList<T>();
    }

    public void push(T value)
    {
        this.myarraylist.add(value);
    }

    public T pop()
    {
        T last_element = this.myarraylist.get(this.myarraylist.size()-1);
        this.myarraylist.remove(this.myarraylist.size()-1);
        return last_element;
    }

    public void print()
    {
        for(int i=0; i<this.myarraylist.size(); i++)
        {
            System.out.print(this.myarraylist.get(i) + ", ");
        }
        System.out.println("\n");
    }
}