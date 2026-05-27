package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.BancoDados;
import dao.LivroDAO;
import dto.LivroDTO;

public class LivroDAOTeste {

	public static void cadastrarLivroTeste() throws SQLException, IOException {

		LivroDTO livro = new LivroDTO();
		
		livro.setTitulo("UML - Guia do Usuário");
		livro.setAutorPrincipal("Grady Grady Booch");
		livro.setAnoPublicacao(2006);
		livro.setNumeroPaginas(552);
		
		Connection conn = BancoDados.conectar();
		int resultado = new LivroDAO(conn).cadastrar(livro);
		
		if (resultado > 0) {

			System.out.println("Livro Cadastrado com sucesso");

		} else {

			System.out.println("Erro ao cadastrar um novo livro");
		}
	}

	public static void buscarTodosLivrosTeste() throws SQLException, IOException {

		Connection conn = BancoDados.conectar();
		List<LivroDTO> listaLivros = new LivroDAO(conn).buscarTodos();
		
		if (listaLivros.isEmpty()) {
			
			System.out.println("Não há livros cadastrados.");
			return;
		}
		
		for (LivroDTO livro : listaLivros) {
			
			System.out.println(livro);
		}
	}

	public static void buscarPorCodigoLivroTeste() throws SQLException, IOException {

		int idLivro = 3;

		Connection conn = BancoDados.conectar();
		LivroDTO livro = new LivroDAO(conn).buscarPorCodigo(idLivro);
		
		if (livro != null) {

			System.out.println(livro);

		} else {

			System.out.println("Livro não encontrado.");
		}
	}

	public static void atualizarLivroTeste() throws SQLException, IOException {

		LivroDTO livro = new LivroDTO();
		
		livro.setId(4);
		livro.setTitulo("Engenharia de Software");
		livro.setAutorPrincipal("Ian Sommerville");
		livro.setAnoPublicacao(2019);
		livro.setNumeroPaginas(768);
		
		Connection conn = BancoDados.conectar();
		int resultado = new LivroDAO(conn).atualizar(livro);
		
		if (resultado > 0) {

			System.out.println("Livro atualizado com sucesso.");

		} else {

			System.out.println("Erro ao atualizar um livro.");
		}
	}

	public static void excluirLivroTeste() throws SQLException, IOException {

		int idLivro = 4;

		Connection conn = BancoDados.conectar();
		int resultado = new LivroDAO(conn).excluir(idLivro);
		
		if (resultado > 0) {

			System.out.println("Livro excluído com sucesso.");

		} else {

			System.out.println("Erro ao excluir um livro.");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			
//			cadastrarLivroTeste();
			buscarTodosLivrosTeste();
//			buscarPorCodigoLivroTeste();
//			atualizarLivroTeste();
//			excluirLivroTeste();
		
		} catch (SQLException | IOException e) {
			
			e.printStackTrace();
		}
	}
}
