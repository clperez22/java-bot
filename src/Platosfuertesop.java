public class Platosfuertesop {
    public static void opcion_platos (String data) {

        String [][] opcion_p = {
                {"Camarones fritos" },
                {"Sushi"},
                {"Wraps"}
        };
        for(int i = 0; i<opcion_p.length; i++){
            for (int j = 0; j<opcion_p[0].length; j++){
                System.out.print("["+i+"]"+opcion_p[i][j]+"");
            }
            System.out.println( );
        }
    }

    public static void Opcion_p2 (String data) {

        String [][] platosf1 = {
                {"Camarones marinados en limón acompañados de puré" },
                {"camarones marinados en salsa dulce"}
        };
        for(int i = 0; i<platosf1.length; i++){
            for (int j = 0; j<platosf1[0].length; j++){
                System.out.print("["+i+"]"+platosf1[i][j]+"");
            }
            System.out.println( );
}
    }
    public static void Opcion_p3 (String data) {

        String [][] platosf2 = {
                {"California sin camarón" },
                {"La pinta empanizada"}
        };
        for(int i = 0; i<platosf2.length; i++){
            for (int j = 0; j<platosf2[0].length; j++){
                System.out.print("["+i+"]"+platosf2[i][j]+"");
            }
            System.out.println( );
        }
    }
    public static void Opcion_p4 (String data) {

        String [][] platosf3 = {
                {"Atún" },
                {"Pollo" },
                {"Vegetales"}
        };
        for(int i = 0; i<platosf3.length; i++){
            for (int j = 0; j<platosf3[0].length; j++){
                System.out.print("["+i+"]"+platosf3[i][j]+"");
            }
            System.out.println( );
        }
    }
}
