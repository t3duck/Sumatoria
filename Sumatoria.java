import java.util.Arrays;
public class Sumatoria {
    static double mediana(int[] ordenados){
        if (ordenados.length % 2 == 0){
            return(double)(ordenados[ordenados.length/2]+ordenados[(ordenados.length/2)-1])/2;
        }else {
            return(double)(ordenados[ordenados.length/2]);
        }
    }
    public static void main(String[] args) {
        int[] numeros={87,68,94,100,83,78,85,91,76,87};
        int[] ordenados=numeros;
        int sumatoria=0;
        double media;
        double mediana;

        Arrays.sort(numeros);

        for (int i=0; i<numeros.length; i++){
            sumatoria+=numeros[i];
        }
        media=(double)sumatoria/numeros.length;
        mediana=(ordenados[ordenados.length/2]+ordenados[(ordenados.length/2)-1])/2;

        System.out.println("Se sumaron "+numeros.length+" elementos");
        System.out.println("La sumatoria de los elementos del arreglo es: "+sumatoria);
        System.out.println("Los elementos del arreglo ordenados son: "+Arrays.toString(ordenados));
        System.out.println("La media de la sumatoria es :"+media);
        System.out.println("La mediana de la sumatoria es: "+mediana);
    }
}
