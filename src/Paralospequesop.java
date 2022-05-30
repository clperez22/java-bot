public class Paralospequesop {
    public static void peques_op (String data) {

        String [][] opciones_pq = {
                {"Hamburguesa acompañada con papas fritas" },
                {"Deditos de pollo con papas fritas"},
                {"Burrito relleno"}
        };
        for(int i = 0; i<opciones_pq.length; i++){
            for (int j = 0; j<opciones_pq[0].length; j++){
                System.out.print("["+i+"]"+opciones_pq[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_pq2 (String data) {

        String [][] parapq1 = {
                {"Extraqueso" },
                {"Dos tortas de carne" },
                {"Sin pepinillos" },
                {"Sin cebolla" },
                {"Papas grandes"}
        };
        for(int i = 0; i<parapq1.length; i++){
            for (int j = 0; j<parapq1[0].length; j++){
                System.out.print("["+i+"]"+parapq1[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_pq3 (String data) {

        String [][] parapq3 = {
                {"4 deditos y una papa mediana" },
                {"6 deditos y una papa pequeña." }
        };
        for(int i = 0; i<parapq3.length; i++){
            for (int j = 0; j<parapq3[0].length; j++){
                System.out.print("["+i+"]"+parapq3[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_pq4 (String data) {

        String [][] parapq4 = {
                {"Relleno de vegetales y pollo a la plancha acompañado de papas fritas" },
                {"Relleno de pollo, crema y lechuga acompañado de papas a la plancha" }
        };
        for(int i = 0; i< parapq4.length; i++){
            for (int j = 0; j< parapq4[0].length; j++){
                System.out.print("["+i+"]"+ parapq4[i][j]+"");
            }
            System.out.println( );
        }
    }
}
