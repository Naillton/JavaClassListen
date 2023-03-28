package Livro;

public class CadLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("O Senhor dos Aneis");
        livro1.setPaginas(400);
        livro1.setClasse("Fantasia");
        String titulo = livro1.getTitulo();
        String classe = livro1.getClasse();
        int paginas = livro1.getPaginas();
        System.out.println("O livro "+ titulo +"\n"+
                " do gênero " + classe +"\n"+
                " Possui: "+ paginas +" Páginas"
        );

    }
}
