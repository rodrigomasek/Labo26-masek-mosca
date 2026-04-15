package Objetos;

import Animales.Persona;
import Tiempo.Fecha;

public class Libro {
    private String titulo;
    private Persona autor;
    private String isbn;
    private int paginas;
    private String editorial;
    private Fecha fDePublicacion;

    public Libro()
    {
        this.titulo = "titulo";
        this.autor = new Persona("juan", 67, "colegiales");
        this.isbn = "ab231jj";
        this.paginas = 69;
        this.editorial = "Messi123";
        this.fDePublicacion = new Fecha(9,12,2018);
    }
    public Libro(String titulo, Persona autor, String isbn, int paginas, String editorial, Fecha fDePublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fDePublicacion = fDePublicacion;
    }
    public Libro(String titulo, Persona autor)
    {
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public Persona getAutor()
    {
        return autor;
    }
    public String getIsbn()
    {
        return isbn;
    }
    public int getPaginas()
    {
        return paginas;
    }
    public String getEditorial()
    {
        return editorial;
    }
    public Fecha getfDePublicacion()
    {
        return fDePublicacion;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(Persona autor) {
        this.autor = autor;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setfDePublicacion(Fecha fDePublicacion) {
        this.fDePublicacion = fDePublicacion;
    }

    public void mostrarInfo()
    {
        System.out.println(this.titulo);
        System.out.println(this.autor.getNombre());
        System.out.println(this.autor.getEdad());
        System.out.println(this.autor.getDir());
        System.out.println(this.isbn);
        System.out.println(this.paginas);
        System.out.println(this.editorial);
        if(fDePublicacion != null)
        {
            System.out.println(this.fDePublicacion.getDia() + "-" + this.fDePublicacion.getMes() + "-" + this.fDePublicacion.getAnio());
        }
        else
        {
            System.out.println("null");
        }

    }
    public void esAnterior(Libro libro2)
    {
        boolean anterior = false;
        int anio1 = this.fDePublicacion.getAnio();
        int anio2 = libro2.getfDePublicacion().getAnio();
        int mes1 = this.fDePublicacion.getMes();
        int mes2 = libro2.getfDePublicacion().getMes();
        int dia1 = this.fDePublicacion.getDia();
        int dia2 = libro2.getfDePublicacion().getDia();

        if(anio1 < anio2)
        {
            anterior = true;
        }
        else if (anio1 == anio2)
        {
            if(mes1 < mes2)
            {
                anterior = true;
            }
            else if (mes1 == mes2 && dia1 < dia2)
            {
                anterior = true;
            }
        }
        if(anterior)
        {
            System.out.println("Es anterior");
        }
        else
        {
            System.out.println("No es anterior");
        }

    }
    public static void main(String[] args) {
        Persona autor = new Persona("jeremias", 55, "santos lugares");
        Fecha fDePublicacion1 = new Fecha(12, 12, 1212);
        Libro l1 = new Libro();
        Libro l2 = new Libro("harry poper 31", autor);
        Libro l3 = new Libro("Los 4 chanchitos", autor, "777", 68, "Pan con manteca y mayonesa", fDePublicacion1);
        l1.mostrarInfo();
    }

}
