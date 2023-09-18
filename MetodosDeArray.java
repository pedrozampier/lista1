package lista1;
import java.util.Random;
import java.util.Arrays;

public class MetodosDeArray{

    public String ordenaArray(int[] array){
        
        if (array[0] > array[1]) {
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }

        if (array[0] > array[2]) {
            int temp = array[0];
            array[0] =array[2];
            array[2] = temp;
        }

        if (array[1] > array[2]) {
            int temp = array[1];
            array[1] = array[2];
            array[2] = temp;
        }

        String auxiliar = Arrays.toString(array);

        return auxiliar;
    }

    public boolean isOrdened(int[] array){
        int tamanhoDaArray = array.length;
        boolean isOrdened = false;
        
        for(int i = 0; i < tamanhoDaArray - 1; i++){
            if(array[i] > array[i+1]){
                i = tamanhoDaArray;
                isOrdened = false;
            }else{
                isOrdened = true;
            }
        }
        return isOrdened;
    }

    public String bubbleSortMelhorado(int[] array) {
        int tamanhoDaArray = array.length;
        boolean trocou;
        int[] sortedArr = new int[tamanhoDaArray];

        for (int i = 0; i < tamanhoDaArray; i++) {
            sortedArr[i] = array[i];
        }

        for (int i = 0; i < tamanhoDaArray - 1; i++) {
            trocou = false;

            for (int j = 0; j < tamanhoDaArray - i - 1; j++) {
                if (sortedArr[j] > sortedArr[j + 1]) {
                    int temp = sortedArr[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }
        String aux = Arrays.toString(sortedArr);
        return aux;
    }

    public String megaSena(int[] arrayDeDezenas){

        int [] numerosSorteados = {10,12,42,65,78,14,98,16,76,43};
        int quantidadeDeAcertos = 0;

        for(int i = 0; i < arrayDeDezenas.length; i++){
            for(int j = 0; j < numerosSorteados.length; j++){
                if(arrayDeDezenas[i] == numerosSorteados[j]){
                    quantidadeDeAcertos++;
                }
            }
        }

        String tipoDeAcerto = "Não foi dessa vez";

        if(quantidadeDeAcertos == 4){
            tipoDeAcerto = "Quadra";
        }if(quantidadeDeAcertos >= 5 && quantidadeDeAcertos < 10){
            tipoDeAcerto = "Quina";
        }if(quantidadeDeAcertos == 10){
            tipoDeAcerto = "Sena!!";
        }

        return tipoDeAcerto;
    }


    public void gerarCartela() {
        int[] cartela = new int[25];
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            cartela[i] = 0;
        }

        for (int i = 0; i < 25; i++) {
            int numero;
            boolean repetido;

            do {
                repetido = false;
                numero = random.nextInt(50) + 1;

                for (int j = 0; j < i; j++) {
                    if (cartela[j] == numero) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);

            cartela[i] = numero;
        }

        System.out.println("Cartela de Bingo:");
        for (int i = 0; i < 25; i++) {
            System.out.print(cartela[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            } else {
                System.out.print("\t");
            }
        }
}
        public String gnomeSort(int[] array) {
        int tamanho = array.length;
        int index = 0;

        while (index < tamanho) {
            if (index == 0) {
                index++;
            }
            if (array[index] >= array[index - 1]) {
                index++;
            } else {
                int aux = array[index];
                array[index] = array[index - 1];
                array[index - 1] = aux;
                index--;
            }
        }

        String temp = Arrays.toString(array);
        return temp;
    }


    public static void main(String[] args) {
        
        MetodosDeArray metodos = new MetodosDeArray();
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println(metodos.gnomeSort(array));
        metodos.gerarCartela();
    }
} 

