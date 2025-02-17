package core;
import estudiantes.Estudiantes;
import input.Input;
import output.Output;

import static input.Input.numberInput;

public class Main {
    final static int alta = 1;
    final static int baja = 2;
    final static int modificar = 3;
    final static int listar = 4;
    final static int salir = 5;
    static int opcionMenu;
    static boolean userWantsToExit = false;

    public static void main(String[] args) {
        while (!userWantsToExit) {
            switch (opcionMenu) {
                case alta: altaEstudiante();
                    break;

                case baja: baja();
                    break;

                case modificar: modificar();
                    break;

                case listar:
                    break;

                case salir:
                    Output.salir();
                    userWantsToExit = true;
                    break;
            }
        }
    }

    private static void altaEstudiante() {
        Output.id();
        int id = numberInput();
        Output.nombre();
        String nombre = Input.stringInput();
        Output.edad();
        int edad = numberInput();
        Output.asignatura();
        String asignatura1 = Input.stringInput();
        Output.nota();
        int notaAsignatura1 = numberInput();
        Output.asignatura();
        String asignatura2 = Input.stringInput();
        Output.nota();
        int notaAsignatura2 = numberInput();
        Estudiantes estudiante = new Estudiantes(id, nombre, edad, asignatura1, notaAsignatura1, asignatura2, notaAsignatura2);
    }


    private static void baja() {
    Output.eliminarEstudiante();
    int id = Input.numberInput();
    Estudiante = null;
    }


    private static void modificar(){
        Output.modificarEstudiante();
        Output.id();
        int id = Input.numberInput();
        Output.nombre();
        String nombre = Input.stringInput();
        Output.edad();
        int edad = numberInput();
        Output.asignatura();
        int asignatura = numberInput();
        Output.nota();
        int notaAsignatura = numberInput();
    }


}


