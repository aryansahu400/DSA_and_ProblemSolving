
public class StaticStack<T>{
    int top=-1;
    Object arr[];
    int size;

    StaticStack(int n){
        this.size=n;
        arr=(T[]) new Object[n];
        size=n;
    }
    public void push(T data){
        if(top==size-1){
            throw new StackOverflowError();
        }
        top++;
        arr[top]=data;
    }

    public T pop(){
        if(top==-1){
            throw new java.util.EmptyStackException();
        }
        top--;
        return (T)arr[top+1];
    }

    public T seek(){
        return (T)arr[top];
    }

    public boolean isEmpty(){
        if(top==-1)return true;
        else return false;
    }

    public boolean isFull(){
        if(top==size-1)return true;
        else return false;

    }
}
