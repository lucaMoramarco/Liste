public class Lista {
    Nodo root;

    public Lista() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
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
            n.setPrev(temp);
        }
        n.setNext(null);
    }

    public void addHead(Nodo n) {
        Nodo temp = root;
        root = n;
        n.setNext(temp);
        n.setPrev(null);
        if (temp != null) temp.setPrev(n);
    }

    public void add(String s) {
        Nodo n = new Nodo(s);
        addTail(n);
    }

    public void insertAt(int index, String s) {
        if (index <= 0 || root == null) {
            addHead(new Nodo(s));
            return;
        }
        int i = 0;
        Nodo temp = root;
        while (temp.getNext() != null && i < index-1) {
            temp = temp.getNext();
            i++;
        }
        Nodo n = new Nodo(s);
        Nodo next = temp.getNext();
        temp.setNext(n);
        n.setPrev(temp);
        n.setNext(next);
        if (next != null) next.setPrev(n);
    }

    public void removeAt(int index) {
        if (root == null) return;
        if (index <= 0) {
            root = root.getNext();
            if (root != null) root.setPrev(null);
            return;
        }
        int i = 0;
        Nodo temp = root;
        while (temp != null && i < index) {
            temp = temp.getNext();
            i++;
        }
        if (temp == null) return;
        Nodo p = temp.getPrev();
        Nodo nx = temp.getNext();
        if (p != null) p.setNext(nx);
        if (nx != null) nx.setPrev(p);
    }

    public void remove(String s) {
        if (root == null) return;
        Nodo temp = root;
        while (temp != null) {
            if (s == null ? temp.getValue() == null : s.equals(temp.getValue())) {
                Nodo p = temp.getPrev();
                Nodo nx = temp.getNext();
                if (p != null) p.setNext(nx); else root = nx;
                if (nx != null) nx.setPrev(p);
                return;
            }
            temp = temp.getNext();
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

    public String toReverseString() {
        String s = "La lista inversa: ";
        if (root == null) return s + "\n";
        Nodo temp = root;
        while (temp.getNext() != null) temp = temp.getNext();
        while (temp != null) {
            s += temp.getValue() + " - ";
            temp = temp.getPrev();
        }
        return s + "\n";
    }

    public String get(int index) {
        int i = 0;
        Nodo temp = root;
        while (temp != null && i < index) {
            temp = temp.getNext();
            i++;
        }
        return temp == null ? null : temp.getValue();
    }

    public int indexOf(String s) {
        int i = 0;
        Nodo temp = root;
        while (temp != null) {
            if (s == null ? temp.getValue() == null : s.equals(temp.getValue())) return i;
            temp = temp.getNext();
            i++;
        }
        return -1;
    }

    public void set(int index, String s) {
        int i = 0;
        Nodo temp = root;
        while (temp != null && i < index) {
            temp = temp.getNext();
            i++;
        }
        if (temp != null) temp.setValue(s);
    }

    public String getFirst() {
        return root == null ? null : root.getValue();
    }

    public String getLast() {
        if (root == null) return null;
        Nodo temp = root;
        while (temp.getNext() != null) temp = temp.getNext();
        return temp.getValue();
    }

    public int size() {
        int c = 0;
        Nodo temp = root;
        while (temp != null) {
            c++;
            temp = temp.getNext();
        }
        return c;
    }

    public void clear() {
        root = null;
    }
}