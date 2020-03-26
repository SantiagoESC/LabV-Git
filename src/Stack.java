public class Stack<T> {
    //region PROPIEDADES

    private Node<T> top;
    private Node<T> base;
    //endregion

    //region Constructor

    public Stack(){
        this.top = null;
        this.base = null;
    }

    public Stack(Node<T> top, Node<T> bottom){
        this.top = top;
        this.base = bottom;
    }

    //endregion

    public Node<T> getTop() {
        return top;
    }

    public void setTop(Node<T> top) {
        this.top = top;
    }

    public Node<T> getBase() {
        return base;
    }

    public void setBase(Node<T> base) {
        this.base = base;
    }

    public void Push(T item)
    {
        Node<T> node = new Node<T>(item);
        if(top==null){
            base =node;
            top= base;
        }
        else{
            top.setNext(node);
            top=node;
        }
    }

    public Node<T> Pop()
    {
        return  this.base;
    }

    public int Size()
    {
        int i=0;
        Node<T> node = new Node<T>(base.getItem(), base.getNext());

        while(node!=null)
        {
            i++;
            node=node.getNext();
        }
        return i;
    }
}