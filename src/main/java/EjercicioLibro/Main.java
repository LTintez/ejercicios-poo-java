package EjercicioLibro;

public class Main {
    public static void main(String[] args) {
        // Crear un libro con datos iniciales
        Libro libro1 = new Libro("123456789", "Cien años de soledad", 500, "Gabriel García Márquez", false);

        // Mostrar información del libro
        System.out.println(libro1);

        // Intentar prestar el libro
        libro1.prestar();

        // Mostrar información del libro después de prestarlo
        System.out.println(libro1);

        // Intentar devolver el libro
        libro1.devolver();

        // Intentar devolver el libro de nuevo (ya está devuelto)
        libro1.devolver();

        // Mostrar información del libro después de devolverlo
        System.out.println(libro1);

        // Calcular el coste de impresión del libro
        double costeImpresion = libro1.calcularCostoDeImpresion(0.05);

        // Mostrar el coste de impresión
        System.out.println("El coste de impresión ha sido de " + costeImpresion + "€");

        // Crear otro libro con un ISBN diferente
        Libro libro2 = new Libro("12345678", "Cinco años de soledad", 500, "Gabriel García Márquez", false);

        // Comparar los dos libros por su ISBN
        if (libro1.equals(libro2)) {
            System.out.println("Los libros son iguales.");
        } else {
            System.out.println("Los libros no son iguales.");
        }
    }
}
