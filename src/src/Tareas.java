public class Tareas {

    public static void imprimirTareas() {
        System.out.println("Lista de tareas:");
        System.out.println("- Estudiar Git");
        System.out.println("- Practicar Java");
        System.out.println("- Hacer el proyecto");
    }

    public static void agregarTarea(String tarea) {
        System.out.println("Tarea agregada: " + tarea);
    }

    public static void main(String[] args) {
        imprimirTareas();
        agregarTarea("Repasar IntelliJ");
    }
}

