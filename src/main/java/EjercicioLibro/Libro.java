package EjercicioLibro;

import java.util.Objects;

public class Libro {

    private String isbn;
    private String titulo;
    private int numeroDePaginas;
    private String autor;
    private boolean prestado;

    public Libro() {
        this("", "", 0, "", false);
    }

    public Libro(String isbn, String titulo, int numeroDePaginas, String autor, boolean prestado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.numeroDePaginas = numeroDePaginas;
        this.autor = autor;
        this.prestado = prestado;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar() {
        if (prestado) {
            System.out.println("Este libro ya está prestado.");
        } else {
            prestado = true;
            System.out.println("El libro se ha prestado.");
        }
    }

    public void devolver() {
        if (!prestado) {
            System.out.println("Este libro no está prestado.");
        } else {
            prestado = false;
            System.out.println("El libro se ha devuelto.");
        }
    }

    public double calcularCostoDeImpresion(double costePorPagina) {
        return costePorPagina * numeroDePaginas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro otroLibro = (Libro) obj;
        return Objects.equals(isbn, otroLibro.isbn);
    }

    @Override
    public String toString() {
        String estadoPrestado = prestado ? "está prestado" : "no está prestado";
        return String.format("El libro con ISBN '%s', título '%s' y autor '%s' tiene %d páginas y %s.",
                isbn, titulo, autor, numeroDePaginas, estadoPrestado);
    }
}
