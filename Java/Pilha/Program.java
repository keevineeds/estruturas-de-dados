public class Program {

    public static void main(String[] args) throws Exception{
        
        Pilha p = new Pilha();

        System.out.println("First in, last out\n"); 
        for(int i = 1; i <= 5; i++){
            p.push(i);
            System.out.println("Empilhei...: " + i);
        }

        System.out.println("------//------");

        while(!p.isEmpty()){
            int e = p.pop();
            System.out.println("Desempilhei: " + e);
        }


    }
}