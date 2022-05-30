public class Entradasop {
    public static void opcion_entradas (String data) {


        String [][] primer_opcion_e = {
                {"Alitas bufalo" },
                {"Nachos locos"},
                {"Papas a la mexicana"},
                {"Queso fundido"}
        };

        for(int i = 0; i<primer_opcion_e.length; i++){
            for (int j = 0; j<primer_opcion_e[0].length; j++){
                System.out.print("["+i+"]"+primer_opcion_e[i][j]+"");
            }
            System.out.println( );
        }
    }


        public static void Opcion_entradas2 (String data) {

            String [][] entradas = {
                    {"20 alitas, 4 aderezos, bebida de un litro." },
                    {"15 alitas, 4 aderezos, bebida de un litro"}
            };
            for(int i = 0; i<entradas.length; i++){
                for (int j = 0; j<entradas[0].length; j++){
                    System.out.print("["+i+"]"+entradas[i][j]+"");
                }
                System.out.println( );
            }
        }

                public static void Opcion_entradas3 (String data) {

                    String [][] entradas2 = {
                            {"Nachos con carne y bañados en salsa de quesos picante" },
                            {"Nachos con carne, queso blanco y elotitos"}
                    };
                    for(int i = 0; i<entradas2.length; i++){
                        for (int j = 0; j<entradas2[0].length; j++){
                            System.out.print("["+i+"]"+entradas2[i][j]+"");
                        }
                        System.out.println( );

        }
    }
    public static void Precion (String data) {
    String [][] Precionachos = {
            {"25" },
            {"35"}
    };
    }

    public static void Opcion_entradas4 (String data) {

        String [][] entradas3 = {
                {"Papas hash brown con crema, elotitos, chiles jalapeños y carne" },
                {"Papas fritas con carne, tres tipos de quesos y guacamol"}
        };
        for(int i = 0; i<entradas3.length; i++){
            for (int j = 0; j<entradas3[0].length; j++){
                System.out.print("["+i+"]"+entradas3[i][j]+"");
            }
            System.out.println( );
    }
    }
    public static void Opcion_entradas5 (String data) {

        String [][] entradas4 = {
                {"Media libra de queso acompañado de pinchos de carne bañados en  una salsa ligeramente picante" },
                {"Media libra de que acompañado de pan tostado huntado de mantequilla"}
        };
        for(int i = 0; i<entradas4.length; i++){
            for (int j = 0; j<entradas4[0].length; j++){
                System.out.print("["+i+"]"+entradas4[i][j]+"");
            }
            System.out.println( );
        }
    }
}