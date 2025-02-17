package estudiantes;

public class Estudiantes {
String nombre;
int id;
int edad;
String asignatura1;
String asignatura2;
int notaAsignatura1;
int notaAsignatura2;

    public Estudiantes(int id, String nombre, int edad, String asignatura1, int notaAsignatura1, String asignatura2, int notaAsignatura2) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.id = id;
        this.notaAsignatura1 = notaAsignatura1;
        this.notaAsignatura2 = notaAsignatura2;

    }

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public String getAsignatura1() {
    return asignatura1;
}

public void setAsignatura1(String asignatura1) {
    this.asignatura1 = asignatura1;
}
public String getAsignatura2() {
    return asignatura2;
}
public void setAsignatura2(String asignatura2) {
    this.asignatura2 = asignatura2;
}

}
