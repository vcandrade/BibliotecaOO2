package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.LivroDTO;

public class LivroDAO {

	private Connection conn;

	public LivroDAO(Connection conn) {

		this.conn = conn;
	}

	public int cadastrar(LivroDTO livro) throws SQLException {

		PreparedStatement st = null;

		try {

			st = conn.prepareStatement("insert into livro (titulo, autorPrincipal, anoPublicacao, numeroPaginas) values (?, ?, ?, ?)");

			st.setString(1, livro.getTitulo());
			st.setString(2, livro.getAutorPrincipal());
			st.setInt(3, livro.getAnoPublicacao());
			st.setInt(4, livro.getNumeroPaginas());

			return st.executeUpdate();

		} finally {

			BancoDados.finalizarStatement(st);
			BancoDados.desconectar();
		}
	}

	public List<LivroDTO> buscarTodos() throws SQLException {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			st = conn.prepareStatement("select * from livro");

			rs = st.executeQuery();

			List<LivroDTO> listaLivros = new ArrayList<>();

			while (rs.next()) {

				LivroDTO livro = new LivroDTO();

				livro.setId(rs.getInt("id"));
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutorPrincipal(rs.getString("autorPrincipal"));
				livro.setAnoPublicacao(rs.getInt("anoPublicacao"));
				livro.setNumeroPaginas(rs.getInt("numeroPaginas"));

				listaLivros.add(livro);
			}

			return listaLivros;

		} finally {

			BancoDados.finalizarStatement(st);
			BancoDados.finalizarResultSet(rs);
			BancoDados.desconectar();
		}
	}

	public LivroDTO buscarPorCodigo(int idLivro) throws SQLException {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			st = conn.prepareStatement("select * from livro where id = ?");

			st.setInt(1, idLivro);

			rs = st.executeQuery();

			if (rs.next()) {

				LivroDTO livro = new LivroDTO();

				livro.setId(rs.getInt("id"));
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutorPrincipal(rs.getString("autorPrincipal"));
				livro.setAnoPublicacao(rs.getInt("anoPublicacao"));
				livro.setNumeroPaginas(rs.getInt("numeroPaginas"));

				return livro;
			}

			return null;

		} finally {

			BancoDados.finalizarStatement(st);
			BancoDados.finalizarResultSet(rs);
			BancoDados.desconectar();
		}
	}
	
	public int atualizar(LivroDTO livro) throws SQLException {

		PreparedStatement st = null;

		try {

			st = conn.prepareStatement("update livro set titulo = ?, autorPrincipal = ?, anoPublicacao = ?, numeroPaginas = ? where id = ?");

			st.setString(1, livro.getTitulo());
			st.setString(2, livro.getAutorPrincipal());
			st.setInt(3, livro.getAnoPublicacao());
			st.setInt(4, livro.getNumeroPaginas());
			st.setInt(5, livro.getId());

			return st.executeUpdate();

		} finally {

			BancoDados.finalizarStatement(st);
			BancoDados.desconectar();
		}
	}

	public int excluir(int idLivro) throws SQLException {

		PreparedStatement st = null;

		try {

			st = conn.prepareStatement("delete from livro where id = ?");

			st.setInt(1, idLivro);

			return st.executeUpdate();

		} finally {

			BancoDados.finalizarStatement(st);
			BancoDados.desconectar();
		}
	}
}
