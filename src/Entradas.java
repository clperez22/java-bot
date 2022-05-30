import java.util.InputMismatchException;
import java.util.Scanner;

public class Entradas {
    public static void primer_opcion (String data){

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario


            System.out.println("1. Entradas             Q25");
            System.out.println("2. Platos fuertes       Q50");
            System.out.println("3. ¡para los peques!    Q35");
            System.out.println("4. Bebidas              Q20");
            System.out.println("5. Postres              Q40");

            try {

                System.out.print("Escribe una de las opciones: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");

                        if (opcion == 1 ){
                            Entradasop.opcion_entradas("");
                        }
                        System.out.print("Escribe una de las opciones: ");
                        opcion = sn.nextInt();
                        if (opcion == 0){
                            Entradasop.Opcion_entradas2("");
                        }
                        if (opcion == 1){
                            Entradasop.Opcion_entradas3("");
                        }
                        if (opcion == 2){
                            Entradasop.Opcion_entradas4("");
                        }
                        if (opcion == 3){
                            Entradasop.Opcion_entradas5("");
                        }
                        System.out.print("elige ");
                        opcion = sn.nextInt();
                            System.out.print("Para saber el total ingresa 000 ");
                            opcion = sn.nextInt();
                            if ( opcion == 000){
                                System.out.println("Total es de Q25");
                                System.out.print("Si deseas hacer otro pedido ingresa 111 ");
                                System.out.println("Para finalizar ingresa 222");
                                opcion = sn.nextInt();
                                if (opcion == 111){
                                    Entradas.primer_opcion("");
                                    if(opcion == 222){
                                    }
                                }

                                System.out.println("Esperamos hayas encontrado lo que buscabas");
                                System.out.println("¡Gracias por tu compra ༼ つ ◕_◕ ༽つ!");
                        }
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        if (opcion == 2 ){
                            Platosfuertesop.opcion_platos("");
                        }
                        System.out.print("Escribe una de las opciones: ");
                        opcion = sn.nextInt();
                        if (opcion == 0){
                            Platosfuertesop.Opcion_p2("");
                        }

                        if (opcion == 1){
                            Platosfuertesop.Opcion_p3("");
                        }

                        if (opcion == 2){
                            Platosfuertesop.Opcion_p4("");
                        }
                        System.out.print("elige ");
                        opcion = sn.nextInt();
                        System.out.print("Para saber el total ingresa 000 ");
                        opcion = sn.nextInt();
                        if ( opcion == 000){
                            System.out.println("El total es de Q50");
                            System.out.print("Si deseas hacer otro pedido ingresa 111 ");
                            System.out.println("Para finalizar ingresa 222  ");
                            opcion = sn.nextInt();
                            if (opcion == 111){
                                Entradas.primer_opcion("");
                                if(opcion == 222){
                                }
                            }

                            System.out.println("Esperamos hayas encontrado lo que buscabas");
                            System.out.println("¡Gracias por tu compra ༼ つ ◕_◕ ༽つ!");
                        }
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        if (opcion == 3 ){
                            Paralospequesop.peques_op("");
                        }
                        System.out.print("Escribe una de las opciones: ");
                        opcion = sn.nextInt();
                        if (opcion == 0){
                            Paralospequesop.Opcion_pq2("");
                        }
                        if (opcion == 1){
                            Paralospequesop.Opcion_pq3("");
                        }
                        if (opcion == 2){
                            Paralospequesop.Opcion_pq4("");
                        }
                        System.out.print("elige ");
                        opcion = sn.nextInt();
                        System.out.print("Para saber el total ingresa 000 ");
                        opcion = sn.nextInt();
                        if ( opcion == 000){
                            System.out.println("El total es de Q35");
                            System.out.print("Si deseas hacer otro pedido ingresa 111 ");
                            System.out.println("Para finalizar ingresa 222  ");
                            opcion = sn.nextInt();
                            if (opcion == 111){
                                Entradas.primer_opcion("");
                                if(opcion == 222){
                                }
                            }

                            System.out.println("Esperamos hayas encontrado lo que buscabas");
                            System.out.println("¡Gracias por tu compra ༼ つ ◕_◕ ༽つ!");
                        }
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        if (opcion == 4 ){
                            Bebidasop.bebidas_opciones("");
                        }
                        System.out.print("Escribe una de las opciones: ");
                        opcion = sn.nextInt();
                        if (opcion == 0){
                            Bebidasop.Opcion_bebida("");
                        }
                        if (opcion == 1){
                            Bebidasop.Opcion_bebida1("");
                        }
                        if (opcion == 2){
                            Bebidasop.Opcion_bebida2("");
                        }
                        System.out.print("elige ");
                        opcion = sn.nextInt();
                        System.out.print("Para saber el total ingresa 000 ");
                        opcion = sn.nextInt();
                        if ( opcion == 000){
                            System.out.println("El total es de Q20");
                            System.out.print("Si deseas hacer otro pedido ingresa 111 ");
                            System.out.println("Para finalizar ingresa 222");
                            opcion = sn.nextInt();
                            if (opcion == 111){
                                Entradas.primer_opcion("");
                                if(opcion == 222){
                                }
                            }

                            System.out.println("Esperamos hayas encontrado lo que buscabas");
                            System.out.println("¡Gracias por tu compra ༼ つ ◕_◕ ༽つ!");
                        }
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        if (opcion == 5 ){
                            Postresop.postres_opciones("");
                        }
                        System.out.print("Escribe una de las opciones: ");
                        opcion = sn.nextInt();
                        if (opcion == 0){
                           Postresop.Opcion_pos("");
                        }
                        if (opcion == 1){
                            Postresop.Opcion_potl("");
                        }
                        if (opcion == 2){
                            Postresop.Opcion_potrs("");
                        }
                        if (opcion == 3){
                            Postresop.Opcion_popdl("");
                        }
                        if (opcion == 4){
                            Postresop.Opcion_popdm("");
                        }
                        if (opcion == 5){
                            Postresop.Opcion_pcdb("");
                        }
                        if (opcion == 6){
                            Postresop.Opcion_pcdbf("");
                        }
                        System.out.print("elige ");
                        opcion = sn.nextInt();
                        System.out.print("para saber el total ingresa 000  ");
                        opcion = sn.nextInt();
                        if ( opcion == 000){
                            System.out.println("El total es de Q40");
                            System.out.print("Si deseas hacer otro pedido ingresa 111 ");
                            System.out.println("Para finalizar ingresa 222");
                            opcion = sn.nextInt();
                            if (opcion == 111){
                                Entradas.primer_opcion("");
                                if(opcion == 222){
                                }
                            }

                            System.out.println("Esperamos hayas encontrado lo que buscabas");
                            System.out.println("¡Gracias por tu compra ༼ つ ◕_◕ ༽つ!");
                        }
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
                }



    }
}
