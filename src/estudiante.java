/*
 *  Clase que representa a un estudiante matriculado.
 *  Maneja datos personales, estado de inscripción y calificacion general.
 */

public class estudiante {
    //Atributos privados (Encapsulamiento)
    private String matricula;
    private String nombre;
    private String carrera;
    private boolean inscritoCurso;
    private double calificacion;

    //Constructor para inicializar al estudiante
    public estudiante(String matricula, String nombre, String carrera){
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.inscritoCurso = false; // Por defecto inicia no inscrito
        this.calificacion = 0.0;
    }

    //Metodo para inscribir al estudiante en el curso
    public void inscribirCurso() {
        if (!this.inscritoCurso) {
            this.inscritoCurso = true;
            System.out.println("El estudiante " + this.nombre + " se ha inscrito exitosamente en el curso.");
        } else {
            System.out.println("El estudiante " + this.nombre + " ya se encuentra inscrito.");
        }
    }
    // Metodo para registrar o actualizar la calificacion
    public void registrarCalificacion(double calificacion) {
        if(this.inscritoCurso) {
            if (calificacion >= 0.0 && calificacion <= 100.0) {
                this.calificacion = calificacion;
                System.out.println("Calificacion de " + calificacion + " registrada para " + this.nombre + ".");
            } else {
                System.out.println("Error: La calificacion debe de estar entre 0.0 y 100.0.");
            }
        } else {
            System.out.println("Error: No se puede asignar calificacion porque " + this.nombre + " no esta inscrito.");
        }
    }

    // Metodo para evaluar si el estudiante aprobo
    public void evaluarEstatus() {
        System.out.println("Estatus academico de: " + this.nombre);
        if (this.inscritoCurso) {
            if (this.calificacion >= 70.0) {
                System.out.println("Resultado: APROBADO con " + this.calificacion);
            } else {
                System.out.println("Resultado: REPROBADO con " + this.calificacion);
            }
        } else {
            System.out.println("Resultado: No cursa la asignatura actualmente.");
        }
    }
    // Metodo para mostrar la ficha escolar completa
    public void mostrarFichaEstudiante() {
        System.out.println("----------------------------------------");
        System.out.println("FICHA DEL ESTUDIANTE");
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Inscrito: " + (this.inscritoCurso ? "Si" : "No"));
        System.out.println("Calificacion: " + this.calificacion);
        System.out.println("----------------------------------------");
    }

    // Metodos Getter
    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isInscritoCurso() {
        return inscritoCurso;
    }
}