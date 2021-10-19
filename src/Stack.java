class Stack {
    int[] arr;
    public int top;
    public int max_capacity;

    public Stack(int max_capacity) {
        this.max_capacity= max_capacity;
        this.arr = new int[max_capacity];
        top = -1;
    }

    public void push(int element) {
        if (top != max_capacity - 1) {
            top++;
            arr[top] = element;
        } else {
            System.out.print("stack overflo");
        }
    }
    public int pop() {
        int response = -1;
        if(top != -1){
            response =  arr[top];
            top--;
        }
        else{
            System.out.println("stack underflo");
        }
        return response;
    }
    public void peek(){
        if(top == -1){
            System.out.println("stack is empty");
        }
        else{
            System.out.println(arr[top]);
        }
    }
    public void traverse(){
        for (int i = 0; i < top; i++) {
            System.out.println(arr[i]);
        }
    }
    public void search(int element){
        for (int i = 0; i < top ; i++) {
            if(arr[i] == element){
                System.out.print("element found");
            }
        }
    }


    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push(26);
        s.push(27);
        s.push(29);
        s.traverse();
        s.peek();
    }
}
// agar hritik ki anushka se setting ho jati h to kfc pe treat h rita ki side se