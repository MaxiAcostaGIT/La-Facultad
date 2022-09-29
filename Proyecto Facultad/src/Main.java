import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //PERSONAS:
        C_Profesor profesor1 = new C_Profesor("Juan", "Perez", 123);
        C_Estudiante estudiante1 = new C_Estudiante("Maria", "Gomez", 456);

        // FACULTAD:
        C_Facultad facultad = new C_Facultad("UTN", 3);
        facultad.getColeccionCarreras()[0] = new C_Carrera("Ingenieria en Sistemas", 3);
        facultad.getColeccionCarreras()[0].getColeccionMaterias()[0] = new C_Materia("Programacion I", 3);
        facultad.getColeccionCarreras()[0].getColeccionMaterias()[0].getColeccionEstudiantes()[0] = estudiante1;

        //TESTEO:
        System.out.println("--------------------");
        System.out.println("TESTEO DE FACULTAD:");
        System.out.println("Nombre de la facultad: " + facultad.getNombre());
        System.out.println("Nombre de la carrera: " + facultad.getColeccionCarreras()[0].getNombre());
        System.out.println("Nombre de la materia: " + facultad.getColeccionCarreras()[0].getColeccionMaterias()[0].getNombre());
        System.out.println("Nombre del estudiante: " + facultad.getColeccionCarreras()[0].getColeccionMaterias()[0].getColeccionEstudiantes()[0].getNombre());
        System.out.println("--------------------");
        System.out.println();

        // PROGRAMA:
        System.out.println("- GESTOR FACULTAD -");
        System.out.println();

        int opcion;
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1. Modificar carreras");
            System.out.println("2. Modificar materias");
            System.out.println("3. Modificar profesores");
            System.out.println("4. Modificar estudiantes");
            System.out.println("5. Salir");
            System.out.println();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // CARRERAS
                    //MOSTRAMOS LAS CARRERAS:
                    System.out.println("Carreras:");
                    for (int i = 0; i < facultad.getColeccionCarreras().length; i++) {
                        if (facultad.getColeccionCarreras()[i] != null) {
                            System.out.println(i + ". " + facultad.getColeccionCarreras()[i].getNombre());
                        }
                    }
                    System.out.println();
                    System.out.println("Elija una opcion:");
                    System.out.println("1. Agregar carrera");
                    System.out.println("2. Eliminar carrera");
                    System.out.println("3. Volver");
                    System.out.println();
                    int opcionCarreras = scanner.nextInt();

                        switch (opcionCarreras) {
                            case 1: // AGREGAR CARRERA
                                if (opcionCarreras == 1 && facultad.getColeccionCarreras()[facultad.getColeccionCarreras().length - 1] != null) {
                                    System.out.println("No se pueden agregar mas carreras.");
                                    System.out.println();
                                } else {
                                    System.out.println("Ingrese el nombre de la carrera:");
                                    String nombreCarrera = scanner.next();
                                    System.out.println("Ingrese la cantidad de materias:");
                                    int cantidadMaterias = scanner.nextInt();
                                    C_Carrera carrera = new C_Carrera(nombreCarrera, cantidadMaterias);
                                    facultad.agregarCarrera(carrera);
                                    System.out.println("Carrera agregada.");
                                    System.out.println();
                                }
                                break;
                            case 2: // ELIMINAR CARRERA
                                System.out.println("Carreras:");
                                for (int i = 0; i < facultad.getColeccionCarreras().length; i++) {
                                    if (facultad.getColeccionCarreras()[i] != null) {
                                        System.out.println(i + ". " + facultad.getColeccionCarreras()[i].getNombre());
                                    }
                                }
                                System.out.println();
                                System.out.println("Ingrese el numero de la carrera:");
                                int numeroCarrera = scanner.nextInt();
                                facultad.eliminarCarrera(facultad.getColeccionCarreras()[numeroCarrera]);
                                break;
                            case 3: // VOLVER
                                System.out.println("Volviendo...");
                                System.out.println();
                                break;
                            default:
                                System.out.println("Opcion incorrecta.");
                                System.out.println();
                                break;
                        }
                    break;
                case 2: // MATERIAS
                    //MOSTRAMOS LAS CARRERAS:
                    System.out.println("Carreras:");
                    for (int i = 0; i < facultad.getColeccionCarreras().length; i++) {
                        if (facultad.getColeccionCarreras()[i] != null) {
                            System.out.println(i + ". " + facultad.getColeccionCarreras()[i].getNombre());
                        }
                    }
                    System.out.println();
                    System.out.println("Elija una carrera:");
                    int numeroCarrera = scanner.nextInt();
                    System.out.println();
                    //MOSTRAMOS LAS MATERIAS:
                    System.out.println("Materias:");
                    for (int i = 0; i < facultad.getColeccionCarreras()[numeroCarrera].getColeccionMaterias().length; i++) {
                        if (facultad.getColeccionCarreras()[numeroCarrera].getColeccionMaterias()[i] != null) {
                            System.out.println(i + ". " + facultad.getColeccionCarreras()[numeroCarrera].getColeccionMaterias()[i].getNombre());
                        }
                    }
                    System.out.println();
                    System.out.println("Elija una opcion:");
                    System.out.println("1. Agregar materia");
                    System.out.println("2. Eliminar materia");
                    System.out.println("3. Volver");
                    System.out.println();
                    int opcionMaterias = scanner.nextInt();

                    switch (opcionMaterias) {
                        case 1: //AGREGAR MATERIA
                            if (opcionMaterias == 1 && facultad.getColeccionCarreras()[numeroCarrera].getColeccionMaterias()[facultad.getColeccionCarreras()[numeroCarrera].getColeccionMaterias().length - 1] != null) {
                                System.out.println("No se pueden agregar mas materias.");
                                System.out.println();
                            } else {
                                System.out.println("Ingrese el nombre de la materia:");
                                String nombreMateria = scanner.nextLine();
                                nombreMateria = scanner.nextLine();
                                System.out.println("Ingrese la cantidad de alumnos:");
                                int cantidadAlumnos = scanner.nextInt();
                                C_Materia materia = new C_Materia(nombreMateria, cantidadAlumnos);
                                facultad.getColeccionCarreras()[numeroCarrera].agregarMateria(materia);
                                System.out.println("Materia agregada.");
                                System.out.println();
                            }

                            break;
                        case 2: // ELIMINAR MATERIA
                            System.out.println("Materias:");
                            for (int i = 0; i < facultad.getColeccionCarreras()[numeroCarrera].getColeccionMaterias().length; i++) {
                                if (facultad.getColeccionCarreras()[numeroCarrera].getColeccionMaterias()[i] != null) {
                                    System.out.println(i + ". " + facultad.getColeccionCarreras()[numeroCarrera].getColeccionMaterias()[i].getNombre());
                                }
                            }
                            System.out.println();
                            System.out.println("Ingrese el numero de la materia:");
                            int numeroMateria = scanner.nextInt();
                            facultad.getColeccionCarreras()[numeroCarrera].eliminarMateria(facultad.getColeccionCarreras()[numeroCarrera].getColeccionMaterias()[numeroMateria]);
                            System.out.println("Materia eliminada.");
                            System.out.println();
                            break;

                        case 3: // VOLVER
                            System.out.println("Volviendo...");
                            System.out.println();
                            break;

                        default:
                            System.out.println("Opcion incorrecta.");
                            System.out.println();
                            break;
                    }

                    break;

                case 3: // PROFESORES
                    System.out.println("- PROFESORES -");
                    System.out.println("Elija una opcion:");
                    System.out.println("1. Modificar profesor");
                    System.out.println("2. Volver");
                    System.out.println();
                    int opcionProfesores = scanner.nextInt();

                    switch (opcionProfesores) {
                        case 1: //MODIFICAR PROFESOR
                            System.out.println("Que carrera desea modificar?");
                            System.out.println();
                            System.out.println("Carreras:");
                            for (int i = 0; i < facultad.getColeccionCarreras().length; i++) {
                                if (facultad.getColeccionCarreras()[i] != null) {
                                    System.out.println(i + ". " + facultad.getColeccionCarreras()[i].getNombre());
                                }
                            }
                            System.out.println();
                            System.out.println("Elija una carrera:");
                            int numeroCarreraProfesor = scanner.nextInt();
                            System.out.println();
                            System.out.println("Que materia desea modificar el profesor?");
                            System.out.println();
                            System.out.println("Materias:");
                            for (int i = 0; i < facultad.getColeccionCarreras()[numeroCarreraProfesor].getColeccionMaterias().length; i++) {
                                if (facultad.getColeccionCarreras()[numeroCarreraProfesor].getColeccionMaterias()[i] != null) {
                                    System.out.println(i + ". " + facultad.getColeccionCarreras()[numeroCarreraProfesor].getColeccionMaterias()[i].getNombre());
                                }
                            }
                            System.out.println();
                            System.out.println("Elija una materia:");
                            int numeroMateriaProfesor = scanner.nextInt();
                            System.out.println();
                            System.out.println("Ingrese el nombre del profesor:");
                            String nombreProfesor = scanner.nextLine();
                            nombreProfesor = scanner.nextLine();
                            System.out.println("Ingrese el apellido del profesor:");
                            String apellidoProfesor = scanner.nextLine();
                            System.out.println("Ingrese numero de legajo del profesor:");
                            int legajoProfesor = scanner.nextInt();
                            facultad.getColeccionCarreras()[numeroCarreraProfesor].getColeccionMaterias()[numeroMateriaProfesor].setProfesor(new C_Profesor(nombreProfesor, apellidoProfesor, legajoProfesor));
                            System.out.println("Profesor asignado.");
                            System.out.println();
                            break;

                        case 2: // VOLVER
                            System.out.println("Volviendo...");
                            System.out.println();
                            break;
                        default:
                            System.out.println("Opcion incorrecta.");
                            System.out.println();
                            break;
                    }

                    break;

                case 4: // ESTUDIANTES
                    System.out.println("- ESTUDIANTES -");
                    System.out.println();
                    System.out.println("Elija una opcion:");
                    System.out.println("1. Agregar estudiante a una materia");
                    System.out.println("2. Eliminar estudiante de una materia");
                    System.out.println("3. Volver");
                    System.out.println();
                    int opcionEstudiantes = scanner.nextInt();

                    switch (opcionEstudiantes) {
                        case 1: // AGREGAR ESTUDIANTE DE UNA MATERIA
                            System.out.println();
                            System.out.println("Carreras:");
                            for (int i = 0; i < facultad.getColeccionCarreras().length; i++) {
                                if (facultad.getColeccionCarreras()[i] != null) {
                                    System.out.println(i + ". " + facultad.getColeccionCarreras()[i].getNombre());
                                }
                            }
                            System.out.println();
                            System.out.println("Elija una carrera:");
                            int numeroCarreraEstudiante = scanner.nextInt();
                            System.out.println();
                            System.out.println("A que materia desea agregar el estudiante?");
                            System.out.println();
                            System.out.println("Materias:");
                            for (int i = 0; i < facultad.getColeccionCarreras()[numeroCarreraEstudiante].getColeccionMaterias().length; i++) {
                                if (facultad.getColeccionCarreras()[numeroCarreraEstudiante].getColeccionMaterias()[i] != null) {
                                    System.out.println(i + ". " + facultad.getColeccionCarreras()[numeroCarreraEstudiante].getColeccionMaterias()[i].getNombre());
                                }
                            }
                            System.out.println();
                            System.out.println("Elija una materia:");
                            int numeroMateriaEstudiante = scanner.nextInt();
                            System.out.println();
                            System.out.println("Ingrese el nombre del estudiante:");
                            String nombreEstudiante = scanner.nextLine();
                            nombreEstudiante = scanner.nextLine();
                            System.out.println("Ingrese el apellido del estudiante:");
                            String apellidoEstudiante = scanner.nextLine();
                            System.out.println("Ingrese numero de legajo del estudiante:");
                            int legajoEstudiante = scanner.nextInt();
                            C_Estudiante estudiante = new C_Estudiante(nombreEstudiante, apellidoEstudiante, legajoEstudiante);
                            facultad.getColeccionCarreras()[numeroCarreraEstudiante].getColeccionMaterias()[numeroMateriaEstudiante].agregarEstudiante(estudiante);
                            System.out.println("Estudiante agregado.");
                            System.out.println();

                            break;

                        case 2: // ELIMINAR ESTUDIANTE DE UNA MATERIA
                            System.out.println();
                            System.out.println("Carreras:");
                            for (int i = 0; i < facultad.getColeccionCarreras().length; i++) {
                                if (facultad.getColeccionCarreras()[i] != null) {
                                    System.out.println(i + ". " + facultad.getColeccionCarreras()[i].getNombre());
                                }
                            }
                            System.out.println();
                            System.out.println("Elija una carrera:");
                            int numeroCarreraEstudianteEliminar = scanner.nextInt();
                            System.out.println();
                            System.out.println("De que materia desea eliminar el estudiante?");
                            System.out.println();
                            System.out.println("Materias:");
                            for (int i = 0; i < facultad.getColeccionCarreras()[numeroCarreraEstudianteEliminar].getColeccionMaterias().length; i++) {
                                if (facultad.getColeccionCarreras()[numeroCarreraEstudianteEliminar].getColeccionMaterias()[i] != null) {
                                    System.out.println(i + ". " + facultad.getColeccionCarreras()[numeroCarreraEstudianteEliminar].getColeccionMaterias()[i].getNombre());
                                }
                            }
                            System.out.println();
                            System.out.println("Elija una materia:");
                            int numeroMateriaEstudianteEliminar = scanner.nextInt();
                            System.out.println();
                            // MUESTRO LOS ESTUDIANTES DE LA MATERIA
                            System.out.println("Estudiantes:");
                            for (int i = 0; i < facultad.getColeccionCarreras()[numeroCarreraEstudianteEliminar].getColeccionMaterias()[numeroMateriaEstudianteEliminar].getColeccionEstudiantes().length; i++) {
                                if (facultad.getColeccionCarreras()[numeroCarreraEstudianteEliminar].getColeccionMaterias()[numeroMateriaEstudianteEliminar].getColeccionEstudiantes()[i] != null) {
                                    System.out.println(i + ". " + facultad.getColeccionCarreras()[numeroCarreraEstudianteEliminar].getColeccionMaterias()[numeroMateriaEstudianteEliminar].getColeccionEstudiantes()[i].getNombre() + " " + facultad.getColeccionCarreras()[numeroCarreraEstudianteEliminar].getColeccionMaterias()[numeroMateriaEstudianteEliminar].getColeccionEstudiantes()[i].getApellido());
                                }
                            }
                            System.out.println();
                            System.out.println("Elija un estudiante:");
                            int numeroEstudianteEliminar = scanner.nextInt();
                            facultad.getColeccionCarreras()[numeroCarreraEstudianteEliminar].getColeccionMaterias()[numeroMateriaEstudianteEliminar].eliminarEstudiante(numeroEstudianteEliminar);
                            System.out.println("Estudiante eliminado.");
                            System.out.println();
                            break;

                        case 3: // VOLVER AL MENU PRINCIPAL
                            System.out.println("Volviendo...");
                            System.out.println();
                            break;

                        default:
                            System.out.println("Opcion incorrecta.");
                            System.out.println();
                            break;
                    }
                    break;

                case 5: // SALIR
                    System.out.println("Saliendo...");
                    System.out.println();
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 5);


        //mostrar coleccion de carreras:
        System.out.println();
        System.out.println("CARRERAS:");
        for (int i = 0; i < facultad.getColeccionCarreras().length; i++) {
            if (facultad.getColeccionCarreras()[i] != null) {
                System.out.println(facultad.getColeccionCarreras()[i].getNombre());
            }
        }

        System.out.println();
        System.out.println("Fin del programa");
    }
}
