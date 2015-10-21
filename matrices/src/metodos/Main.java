package metodos;

public class Main {

    public static void main(String[] args) {

        //se declaran el numero de filas y columnas en este orden
	double cal[][] = new double[5][10];
        llenar(cal);
        mostrar(cal);
    }

    //metodo donde se llena la matriz
    public static void llenar(double cal[][]){
        for(int filas=0; filas<cal.length; filas++){
            for(int colum=0; colum<cal[filas].length; colum++){
                cal[filas][colum]=Math.round((Math.random()*5)+5);
            }
        }
    }

    //metodo que nos muestra la informcion en forma de matriz
    public static void mostrar (double cal[][]){
        for(int filas=0; filas<cal.length; filas++){
            double prom=0;
            System.out.print("salon "+filas+" =");
            for(int colum=0; colum<cal[filas].length; colum++){
                System.out.print(cal[filas][colum] + " ");
                prom+=cal[filas][colum];
            }
            System.out.println(" promedio: "+(prom/cal[filas].length));
        }
    }
}
