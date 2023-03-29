package nl.han.ica.datastructures;

public class HANLinkedList<T> implements IHANLinkedList<T> {
    private HANLinkedListNode<T> header = new HANLinkedListNode(null);
    //private HANLinkedListNode<T> last;

    public HANLinkedList(){
    }

    public void addFirst(T value){
        HANLinkedListNode<T> tmp = header.getNextNode();
        HANLinkedListNode<T> newNode = new HANLinkedListNode<T>(value);
        newNode.setNextNode(tmp);
        header.setNextNode(newNode);
    }

    @Override
    public void clear() {

    }

    public void removeFirst(){
        header.setNextNode(header.getNextNode().getNextNode());// = header.getNextNode();
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    public void insert (int index, T value){

        HANLinkedListNode<T> prev = null;
        if(index>0)
            prev = getNode(index-1);
        else
            prev=header;

        HANLinkedListNode<T> next = prev.getNextNode();
        HANLinkedListNode<T> tmp = new HANLinkedListNode<T>(value);
        tmp.setNextNode(next);
        prev.setNextNode(tmp);
    }

    public void delete (int index){
        HANLinkedListNode<T> prev = getNode(index-1);
        prev.setNextNode(prev.getNextNode().getNextNode());
    }

    public T get (int index){
        return (T)getNode(index).value;
    }


    public HANLinkedListNode<T> getNode(int index){
        HANLinkedListNode<T> current = header.getNextNode();
        for(int i=0;i<index;i++){
            current = current.getNextNode();
        }
        return current;
    }

    @Override
    public String toString() {
        HANLinkedListNode<T> node = header;
        String output="";
        while (node.getNextNode() !=null){
            node =node.getNextNode();
            output += node.value+", ";

        }
        return output;
    }

    public class HANLinkedListNode<T> {
        private HANLinkedListNode<T> next;
        private T value;

        public HANLinkedListNode(T value){
            this.value = value;
        }

        public void setNextNode(HANLinkedListNode<T> node){
            next = node;
        }
        public HANLinkedListNode<T> getNextNode(){
            return next;
        }
        public T getValue(){
            return value;
        }
    }
}


