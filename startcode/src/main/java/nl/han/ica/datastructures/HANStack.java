package nl.han.ica.datastructures;

public class HANStack<T> implements IHANStack<T> {
    private HANLinkedList<T> stack;
    private int size=0;

    public HANStack(){
        stack = new HANLinkedList<T>();
    }

    public T pop (){
        if(size == 0)
            return null;
        T tmp = stack.get(0);
        stack.removeFirst();
        size--;
        return tmp;
    }

    @Override
    public T peek() {
        return null;
    }

    public T top (){
        return stack.get(0);
    }

    public void push(T value){
        stack.addFirst(value);
        size++;
    }
    public int getSize (){
        return size;
    }

    @Override
    public String toString() {
        String result = "Stack:\n\t";
        result += stack.toString();
        return result;
    }
}

