package dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.*;

import entities.Livro;

public class LivroDAOTeste {

	@Disabled
	void cadastrarLivroTeste() throws SQLException, IOException {

		Livro livro = new Livro();
		
		livro.setTitulo("UML - Guia do Usuário");
		livro.setAutorPrincipal("Grady Grady Booch");
		livro.setAnoPublicacao(2006);
		livro.setNumeroPaginas(552);
		
		Connection conn = BancoDados.conectar();
		int resultado = new LivroDAO(conn).cadastrar(livro);

		assertEquals(1, resultado);
	}
	
	@Test
	void buscarTodosLivrosTeste() throws SQLException, IOException {

		Connection conn = BancoDados.conectar();
		List<Livro> listaLivros = new LivroDAO(conn).buscarTodos();

		assertNotNull(listaLivros);
	}
	
	@Test
	void buscarPorCodigoLivroTeste() throws SQLException, IOException {

		int idLivro = 3;

		Connection conn = BancoDados.conectar();
		Livro livro = new LivroDAO(conn).buscarPorCodigo(idLivro);

		assertNotNull(livro);
		assertEquals("UML - Guia do Usuário", livro.getTitulo());
	}
	
	@Disabled
	void atualizarLivroTeste() throws SQLException, IOException {

		Livro livro = new Livro();
		
		livro.setId(2);
		livro.setTitulo("Engenharia de Software");
		livro.setAutorPrincipal("Ian Sommerville");
		livro.setAnoPublicacao(2019);
		livro.setNumeroPaginas(768);
		
		Connection conn = BancoDados.conectar();
		int resultado = new LivroDAO(conn).atualizar(livro);

		assertEquals(1, resultado);
	}
	
	@Disabled
	void excluirLivroTeste() throws SQLException, IOException {

		int idLivro = 2;

		Connection conn = BancoDados.conectar();
		int resultado = new LivroDAO(conn).excluir(idLivro);

		assertEquals(1, resultado);
	}
}
