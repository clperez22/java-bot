public class Postresop {
    public static void postres_opciones(String data) {

        String [][] opciones_postres = {
                {"Selva negra" },
                {"Tres leches"},
                {"Tiramisú"},
                {"Pie de limón"},
                {"Pie de mora"},
                {"Crepa de banano"},
                {"Crepa de banano y fresa."}
        };
        for(int i = 0; i<opciones_postres.length; i++){
            for (int j = 0; j<opciones_postres[0].length; j++){
                System.out.print("["+i+"]"+opciones_postres[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_pos (String data) {

        String [][] selva = {
                {"una porción" },
                {"ocho porciones" }
        };
        for(int i = 0; i< selva.length; i++){
            for (int j = 0; j< selva[0].length; j++){
                System.out.print("["+i+"]"+ selva[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_potl (String data) {

        String [][] tresl = {
                {"una porción" },
                {"ocho porciones" }
        };
        for(int i = 0; i< tresl.length; i++){
            for (int j = 0; j< tresl[0].length; j++){
                System.out.print("["+i+"]"+ tresl[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_potrs (String data) {

        String [][] tiramisú = {
                {"una porción" },
                {"ocho porciones" }
        };
        for(int i = 0; i< tiramisú.length; i++){
            for (int j = 0; j< tiramisú[0].length; j++){
                System.out.print("["+i+"]"+ tiramisú[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_popdl (String data) {

        String [][] plimon = {
                {"una porción" },
                {"ocho porciones" }
        };
        for(int i = 0; i< plimon.length; i++){
            for (int j = 0; j< plimon[0].length; j++){
                System.out.print("["+i+"]"+ plimon[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_popdm (String data) {

        String [][] pmora = {
                {"una porción" },
                {"ocho porciones" }
        };
        for(int i = 0; i< pmora.length; i++){
            for (int j = 0; j< pmora[0].length; j++){
                System.out.print("["+i+"]"+ pmora[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_pcdb (String data) {

        String [][] crepab = {
                {"una porción" },
                {"ocho porciones" }
        };
        for(int i = 0; i< crepab.length; i++){
            for (int j = 0; j< crepab[0].length; j++){
                System.out.print("["+i+"]"+ crepab[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_pcdbf (String data) {

        String [][] crepabf = {
                {"una porción" },
                {"ocho porciones" }
        };
        for(int i = 0; i< crepabf.length; i++){
            for (int j = 0; j< crepabf[0].length; j++){
                System.out.print("["+i+"]"+ crepabf[i][j]+"");
            }
            System.out.println( );
        }
    }
}
