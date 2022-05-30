public class Bebidasop {
    public static void bebidas_opciones (String data) {


        String [][] opciones_bebidas = {
                {"Calientes" },
                {"Naturales"},
                {"Alcohólicas"}
        };
        for(int i = 0; i<opciones_bebidas.length; i++){
            for (int j = 0; j<opciones_bebidas[0].length; j++){
                System.out.print("["+i+"]"+opciones_bebidas[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_bebida (String data) {

        String [][] bebida1 = {
                {"Café" },
                {"Té" }
        };
        for(int i = 0; i<bebida1.length; i++){
            for (int j = 0; j<bebida1[0].length; j++){
                System.out.print("["+i+"]"+bebida1[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_bebida1 (String data) {

        String [][] bebida2 = {
                {"Jugo de naranja" },
                {"Limonada" },
                {"Jamaica" }
        };
        for(int i = 0; i<bebida2.length; i++){
            for (int j = 0; j<bebida2[0].length; j++){
                System.out.print("["+i+"]"+bebida2[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_bebida2 (String data) {

        String [][] bebida3 = {
                {"Sangría " },
                {"Vino blanco " },
                {"Vino tinto" },
                {"Michelada" }
        };
        for(int i = 0; i<bebida3.length; i++){
            for (int j = 0; j<bebida3[0].length; j++){
                System.out.print("["+i+"]"+bebida3[i][j]+"");
            }
            System.out.println( );
        }
    }
}
