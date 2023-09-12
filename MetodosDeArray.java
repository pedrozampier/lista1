package lista1;
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

    

    public static void main(String[] args) {
        
        MetodosDeArray metodos = new MetodosDeArray();
        int[] array = {1,5,3,4};

        System.out.println(metodos.isOrdened(array));
    }
} 
