public class L1List<T>{
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

    //Получить номер элемента.
    public int find(Node node){
        int index = 0;
        Node temp = first;
        while (temp != node){
            temp = temp.next;
            index++;
        }
        return index;
    }

    //Вставка элемента.
    public void insert(Node node, int location){
        Node r = getNode(location + 1);
        Node l = getNode(location - 1);
        l.next = node;
        node.next = r;
        size++;

    }

    //Удаление элемента.
    public void remove(int location){
        Node right = getNode(location + 1);
        Node left = getNode(location - 1);
        left.next = right;
        size--;
    }
    public int getSize(){
        return size;
    }

    //Получить элемент по местоположению
    public Node getNode(int location){
        Node temp = first;
        for(int i = 0; i < location; i++){
            temp = temp.next;
        }
        return temp;
    }
}