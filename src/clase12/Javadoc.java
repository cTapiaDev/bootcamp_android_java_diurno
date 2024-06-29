package clase12;

/**
 * Clase de ejemplo que representa un libro.
 *
 * @author Carlos Tapia
 * @version 1.0
 */
public class Javadoc {

    /**
     * Título del libro.
     */
    private String title; 

    /**
     * Autor del libro.
     */
    private String author;

    /**
     * Número de páginas del libro.
     */
    private int pages;

    // Constructor
    /**
     * Crea un nuevo libro.
     *
     * @param title Título del libro.
     * @param author Autor del libro.
     * @param pages Número de páginas del libro.
     */
    public Javadoc(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Métodos getters y setters
    /**
     * Obtiene el título del libro.
     *
     * @return Título del libro.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Establece el título del libro.
     *
     * @param title Nuevo título del libro.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return Autor del libro.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Establece el autor del libro.
     *
     * @param author Nuevo autor del libro.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Obtiene el número de páginas
     *
     * @return Número de páginas del libro.
     */
    public int getPages() {
        return pages;
    }

    /**
     * Establece el número de páginas del libro.
     *
     * @param pages Nuevo número de páginas del libro,
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    // Otros métodos
    /**
     * Imprime información sobre el libro.
     */
    public void printInfo() {
        System.out.println("**Libro**");
        System.out.println("Titulo: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Paginas: " + pages);
    }

}
