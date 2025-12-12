public class Lista {
private Nodo root;

    public Lista() {
        root = null;
    }

    public void addTail(Nodo n) {
        if (root == null) {
            root = n;
        } else {
            Nodo tmep = root;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(n);
        }
    }
    public void stampa() {
        Nodo temp = root;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }   
}
