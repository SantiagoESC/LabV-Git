import javax.print.attribute.standard.NumberOfDocuments;

public class Node <T>{

    //region Properties
    private T item;
    private Node<T> next;
    //endregion

    //region Constructor
    public Node(T item){
        this.item=item;
    }

    public  Node(T item, Node<T> next){
        this.item=item;
        this.next=next;
    }
    //endregion

    //region Methods

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    //endregion

}
