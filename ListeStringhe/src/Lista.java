public class Lista {
    Nodo root;

    public Lista() {
        root = null;
    }

    public void addTail(Nodo n) {
        if (root == null) {
            root = n;
        } else {
            Nodo temp = root;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(n);
        }
    }

    public void addHead(Nodo n) {
        Nodo temp = root;
        root = n;
        n.setNext(temp);
    }

    public void add(String s) {
        Nodo n = new Nodo(s);
        addTail(n);
    }

    public void remove(String s) {
        Nodo prev = root;
        Nodo curr = root.getNext();

        if (root == null) 
            return;

        if (!exists(s)) 
            return;

        if (s == null ? root.getValue() == null : s.equals(root.getValue())) {
            root = root.getNext();
            return;
        }

        while (curr != null) {
            if (s == null ? curr.getValue() == null : s.equals(curr.getValue())) {
                prev.setNext(curr.getNext());
                return;
            }
            prev = curr;
            curr = curr.getNext();
        }
    }

    public boolean exists(String s) {
        Nodo temp = root;
        while (temp != null) {
            if (s == null) {
                if (temp.getValue() == null) return true;
            } else {
                if (s.equals(temp.getValue())) return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public String toString() {
        String s = "La lista ha: ";
        Nodo temp = root;
        while (temp != null) {
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        return s + "\n";
    }
}