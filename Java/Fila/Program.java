public class Program {
    public static void main(String args[]) throws Exception {
        Fila fila = new Fila();

        System.out.println("First in, first out\n"); 
        for(int i = 1; i < 5; i++){
            fila.inserir(i);
            System.out.println("Inserido: " + i);
        }

        System.out.println("-----//-----");

        while(!fila.isEmpty()) {
            int x = fila.remover();
            System.out.println("Removido: " + x);
        }













        
        
        /*
            por que usar o % para definir o 
            total da fila:

        for(int i = 0; i < 5; i++){
            int x = i % 4;
            System.out.println(i + " % 4 = " + x);
        }
        */
    }
}
