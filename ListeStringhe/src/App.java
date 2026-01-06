public class App {
    public static void main(String[] args){

        Lista liste = new Lista();

        System.out.println("Vuota? " + liste.isEmpty());

        liste.addTail(new Nodo("Marco"));
        liste.addTail(new Nodo("Luca"));
        liste.addHead(new Nodo("Francesco"));
        liste.add("Juve magica");
        liste.insertAt(2, "Inserito@2");

        System.out.println(liste);
        System.out.println(liste.toReverseString());

        System.out.println("Size: " + liste.size());
        System.out.println("Esiste 'Marco'? " + liste.exists("Marco"));
        System.out.println("Elemento index 2: " + liste.get(2));

        System.out.println("Index di 'Marco': " + liste.indexOf("Marco"));
        liste.set(1, "Mario");
        System.out.println("Dopo set(1,'Mario'): " + liste);
        System.out.println("First: " + liste.getFirst() + " Last: " + liste.getLast());

        liste.remove("Luca");
        System.out.println("Dopo remove 'Luca': " + liste);

        liste.removeAt(0);
        System.out.println("Dopo removeAt(0): " + liste);

        liste.removeAt(liste.size()-1);
        System.out.println("Dopo remove ultimo: " + liste);

        liste.clear();
        System.out.println("Dopo clear: " + liste + " Vuota? " + liste.isEmpty());
    }
}