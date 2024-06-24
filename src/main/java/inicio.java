import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class inicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("-------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar un mensaje");
            System.out.println("3. Eliminar un mensaje");
            System.out.println("4. Editar un mensaje");

            System.out.println("5. Salir");

            switch (option) {
                case 1:
                    MensajesService.addMessage();
                    break;
                case 2:
                    MensajesService.getMessages();
                    break;
                case 3:
                    MensajesService.deleteMessage();
                    break;
                case 4:
                    MensajesService.updateMessage();
                    break;
                default:
                    break;
            }

            //leemos
            option = sc.nextInt();


        }while (option != 5);


    }
}
