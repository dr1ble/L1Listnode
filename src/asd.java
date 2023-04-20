//public class asd {
//    public class L1List<T> {
//        private Node<T> first, last; //Ссылки на первый и последний узлы.
//        private int size;
//        public L1List(){
//            first = last = null;
//            size = 0;
//        }
//        //Добавить элемент в конец списка.
//        public void append(Node<T> node){
//            node.next = null;
//            if(first == null) //Первый элемент.
//                first = node;
//            if(last != null)
//                last.next = node;
//            last = node;
//            size++;
//        }
//        public int find(Node node){
//            int index = 0;
//            Node<T> current = first;
//            while (current != null){
//                if(current.value.equals(node.value))
//                    return index;
//                current = current.next;
//                index++;
//            }
//            return -1;
//        };
//        public void insert(Node<T> node, int location){
//            if(location < 0 || location > size)
//                throw new IndexOutOfBoundsException();
//            if(location == size){ //Вставка в конец списка.
//                append(node);
//            }
//            Node<T> current = first;
//            for(int i = 0; i < location-1; i++)
//                current = current.next;
//            node.next = current.next;
//            current.next = node;
//            size++;
//        }
//        public void remove(int location){
//            if(location < 0 || location >= size)
//                throw new IndexOutOfBoundsException();
//            if(location == 0){ //Удаление первого элемента.
//                first = first.next;
//                if(first == null) //Если список пустой.
//                    last = null;
//                size--;
//                return;
//            }
//            Node<T> current = first;
//            for(int i = 0; i < location - 2; i++)
//                current = current.next;
//            current.next = current.next.next;
//            if(current.next == null) //Удаление последнего элемента.
//                last = current;
//            size--;
//        }
//        public void printList(){
//            Node<T> current = first;
//            while(current != null){
//                System.out.println(current.value);
//                current = current.next;
//            }
//        }
//    }
//}
