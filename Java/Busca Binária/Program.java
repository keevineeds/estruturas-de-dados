public class Program {
    
    public static void main(String[] args) {

        int[] x = {1, 6, 8, 12, 15, 18, 22, 23, 26, 29, 31, 34, 37, 40, 43, 47, 49, 50, 52}; //19
        int valor = buscaBinaria(x, 47);
        System.out.println("Posicao: " + valor);
    }

    private static int buscaBinaria(int[] x, int valor){
        int inicio, meio, fim;
        inicio = 0;
        fim = x.length - 1;

        while(inicio <= fim){
            meio = (inicio + fim) / 2;
            if(x[meio] == valor)
                return meio;
            else if(x[meio] < valor)
                inicio = meio + 1;
            else if(x[meio] > valor)
                fim = meio - 1;
        }
        return -1;
    }
}
