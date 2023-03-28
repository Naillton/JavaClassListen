package Livro;

public class Livro {
    //Properties
    private String titulo;
    private int paginas;
    private String classe;

    //Constructor default
    Livro(){
        System.out.println("Vamos ler livros");
    }

    //methods

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
