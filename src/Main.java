/*
 * Clase principal para probar la gestion de estudiantes e inscripciones.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DE ESTUDIANTES ===\n");

        // Instanciacion de objetos usando el constructor
        estudiante est1 = new estudiante("ALU-2026-01", "Carlos Mendoza", "Ingenieria en Desarrollo de Software");
        estudiante est2 = new estudiante("ALU-2026-02", "Ana Lopez", "Ingenieria en Desarrollo de Software");

        // Mostrar estado inicial
        System.out.println("Estado inicial de los estudiantes:");
        est1.mostrarFichaEstudiante();
        est2.mostrarFichaEstudiante();

        // Proceso de inscripcion
        System.out.println("\n--- Proceso de Inscripcion ---");
        est1.inscribirCurso();
        est1.inscribirCurso(); // Intento duplicado para probar validacion

        // Registro de calificaciones
        System.out.println("\n--- Registro de Calificaciones ---");
        est2.registrarCalificacion(85.0); // Intento de calificar a un estudiante no inscrito (activa error)

        est2.inscribirCurso();
        est2.registrarCalificacion(85.0); // Ahora si permite calificar
        est1.registrarCalificacion(65.0); // Calificacion reprobatoria para probar evaluacion

        // Evaluacion del estatus academico
        System.out.println("\n--- Evaluacion de Estatus Academico ---");
        est1.evaluarEstatus();
        est2.evaluarEstatus();

        // Estado final
        System.out.println("\n--- Estado Final de Estudiantes ---");
        est1.mostrarFichaEstudiante();
        est2.mostrarFichaEstudiante();
    }
}