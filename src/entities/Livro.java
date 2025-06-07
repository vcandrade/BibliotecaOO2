package entities;

public class Livro {

	private int id;
	private String titulo;
	private String autorPrincipal;
	private int anoPublicacao;
	private int numeroPaginas;
	
	public Livro() {
	
	}

	public Livro(int id, String titulo, String autorPrincipal, int anoPublicacao, int numeroPaginas) {
		
		this.id = id;
		this.titulo = titulo;
		this.autorPrincipal = autorPrincipal;
		this.anoPublicacao = anoPublicacao;
		this.numeroPaginas = numeroPaginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutorPrincipal() {
		return autorPrincipal;
	}

	public void setAutorPrincipal(String autorPrincipal) {
		this.autorPrincipal = autorPrincipal;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", autorPrincipal=" + autorPrincipal + ", anoPublicacao="
				+ anoPublicacao + ", numeroPaginas=" + numeroPaginas + "]";
	}
}
