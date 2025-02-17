package output;

public class Output {


    public void mostrarMenu() {
        System.out.println("""
                Bienvenido al CRUD de estudiantes! 
                Que quieres hacer??
                1. Crear Estudiante
                2. Modificar Estudiante
                3. Eliminar Estudiante
                4. Listar Estudiantes
                5. Salir
                """);
    }


    public void nombre() {
        System.out.println("Introduce el nombre del estudiante");
    }

    public void apellido() {
        System.out.println("Introduce el apellido del estudiante");
    }

    public void edad() {
        System.out.println("Introduce la edad del estudiante");
    }
    public void asignatura() {
        System.out.println("Introduce el asignatura del estudiante");
    }

    public void nota() {
        System.out.println("Introduce el nota del estudiante");
    }

    public void modificarEstudiante() {
            System.out.println("Que estudiante quieres modificar?");
    }
    public void eliminarEstudiante() {
        System.out.println("Que estudiante quieres eliminar?");
    }
    public void salir() {
        System.out.println("Que salir del estudiante");
    }


}
