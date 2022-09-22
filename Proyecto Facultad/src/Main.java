import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //PERSONAS:
        C_Profesor profesor1 = new C_Profesor("Juan", "Perez", 123);
        C_Estudiante estudiante1 = new C_Estudiante("Maria", "Gomez", 456);

        // FACULTAD:
        C_Facultad facultad = new C_Facultad("UTN", 3);
        facultad.getColeccionCarreras()[0] = new C_Carrera("Ingenieria en Sistemas de Informacion", 3);
        facultad.getColeccionCarreras()[0].getColeccionMaterias()[0] = new C_Materia("Programacion I", profesor1, 3);



        // PROGRAMA:
        System.out.println("- GESTOR FACULTAD -");
        System.out.println();
        System.out.println("Elija una opcion:");
        System.out.println("1. Modificar carreras");
        System.out.println("2. Modificar materias");
        System.out.println("3. Modificar profesores");
        System.out.println("4. Modificar estudiantes");
        System.out.println("5. Salir");
        System.out.println();
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }






        System.out.println();
        System.out.println("Fin del programa");
    }
}
