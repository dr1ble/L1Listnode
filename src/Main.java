public class Main {
    public static void main(String[] args) {
        L1List<Integer> list = new L1List<>();
        list.append(new Node<>(1));
        list.append(new Node<>(2));
        list.append(new Node<>(3));
        list.append(new Node<>(4));
        list.append(new Node<>(5));
        list.remove(3);
        for (int i = 0; i < list.getSize(); i++){
            System.out.print(list.getNode(i).value + " ");
        }
    }
}