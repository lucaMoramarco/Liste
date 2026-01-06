public class Nodo {
    private String value;
    private Nodo next;
    private Nodo prev;
    
    public Nodo( String v ) {
        value = v;
        next = null;
        prev = null;
    }
    
    public void setNext( Nodo n ) {
        next = n;
    }
    
    public Nodo getNext() {
        return next;
    }

    public void setPrev( Nodo p ) {
        prev = p;
    }

    public Nodo getPrev() {
        return prev;
    }
    
    public void setValue( String v ) {
        value = v;
    }
    
    public String getValue() {
        return value;
    }
} 