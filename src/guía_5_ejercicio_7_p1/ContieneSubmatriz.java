
package guía_5_ejercicio_7_p1;

public class ContieneSubmatriz {

    public static boolean contieneSubmatriz(int[][] M, int[][] P) {
        
        int filasM = M.length;                    //10 filas tiene M
        int columnasM = M.length;            //10 Columnas tiene M
        int filasP = P.length;                      //3 Filas tiene P
        int columnasP = P.length;             //3 Columnas tiene P

        
        for (int i = 0; i <= filasM - filasP; i++) {
            for (int j = 0; j <= columnasM - columnasP; j++) {
                boolean coincide = true;
                for (int x = 0; x < filasP; x++) {
                    for (int y = 0; y < columnasP; y++) {
                        if (M[i + x][j + y] != P[x][y]) {
                            coincide = false;
                            break;
                        }
                    }
                    if (!coincide) {
                        break;
                    }
                }
                if (coincide) {
                    System.out.println("La submatriz P se encuentra en la fila " + i + " y columna " + j + " de la matriz M.");
                    return true;
                }
            }
        }
        return false;
    }
}
