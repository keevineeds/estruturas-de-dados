public class Fila {
    
    private int[] valores;
    private int inicio;
    private int fim;
    private int t;

    public Fila(){
        valores = new int[10];
        inicio = 0;
        fim = 0;
        t = 0;
    }
    public void inserir(int e) throws Exception{
        if(isFull())
            throw new Exception("Fila cheia. Impossivel inserir.");
        
        valores[fim] = e;
        fim = (fim + 1) % valores.length;
        t++;  
    }
    
    public int remover() throws Exception{
        if(isEmpty())
            throw new Exception("Fila vazia. Não há o que remover.");
        int e = valores[inicio];
        inicio = (inicio + 1) % valores.length;       // o % só vai ser 0 quando for dividido por ele mesmo                                              
        t--;                                          // isso quer dizer que, quando o inicio chegar a 10, 
        return e;                                     // 10 % 10 = 0, isso faz com que o inicio volte ao zero.      
    }

    public boolean isEmpty(){
        if(t == 0) return true;
        else return false;
    }
    
    public boolean isFull(){
        if(t == valores.length) return true;
        else return false;
    }
}
