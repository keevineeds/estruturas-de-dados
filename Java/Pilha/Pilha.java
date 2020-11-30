
public class Pilha{
    int e[];
    int topo;
    
    public Pilha() throws Exception{
        e = new int[10];
        topo = -1;
    }
    public void push(int x) throws Exception{
        if(!isFull()){
            topo++;
            e[topo] = x;
        }else{
            throw new Exception("Pilha cheia!");
        }
        
    }
    
    public int pop() throws Exception{
        if(!isEmpty()){
            int x;
            x = e[topo];
            topo--; 
            return x;
        }else{
            throw new Exception("Pilha vazia!");
        }
        
    }

    public boolean isEmpty(){
        if(topo == -1) return true;
        else return false;
    }

    public boolean isFull(){
        if(topo == 9) return true;
        else return false;
    }

    public int top() throws Exception{
        if(!isEmpty()){
            return e[topo];
        }else{
            throw new Exception("Top não realizado. Pilha vazia!");
        }
        
    }
}
