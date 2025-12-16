public class App {
    public static void main(String[] args){

        Lista liste = new Lista();

        liste.addTail(new Nodo("Marco"));
        liste.addTail(new Nodo("Luca"));
        liste.addHead(new Nodo("Francesco"));
        liste.add("Juve magica");
        
        System.out.println(liste);

        boolean esiste = liste.exists("Marco");
        System.out.println("Esiste 'Marco'? " + esiste);

        liste.remove("Luca");
        System.out.println("Dopo remove 'Luca': " + liste);
    }
}