public class L1List<T> {
    private Node<T> first, last; //Ссылки на первый и последний узлы.
    private int size;
    public L1List(){
        first = last = null;
        size = 0;
    }
    //Добавить элемент в конец списка.
    public void append(Node<T> node){
        node.next = null;
        if(first == null) //Первый элемент.
            first = node;
        if(last != null)
            last.next = node;
        last = node;
        size++;
    }
    public int find(Node node){
        int index = 0;

      return 0;
    };
    public void insert(Node node, int location){
        return;}
    public void remove(int location){

    };
}