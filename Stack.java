public class Stack {

    int stack[] =new int[5];
    int top=0;

    public void push(int x){
        stack[top]=x;
        top++;
    }

    public int pop(){
        int data;
        top--;
        stack[top]=0;
        data=stack[top];
        return data;
    }

    //public int top(){}

    //public boolean empty(){}


    public void show(){
        for (int n:stack){
            System.out.println(n+" ");
        }
    }

    public static void main(String[] args) {

        Stack nums=new Stack();
        nums.push(15);
        nums.push(4);
        nums.push(3);
        nums.push(12);
        nums.pop();
        nums.show();
    }


}
