### Download do Projeto
1. Clone o projeto para a pasta **"eclipse-workspace"**:
`git clone https://github.com/vcandrade/BibliotecaOO2`

- Alternativa: Faça download e descompacte o projeto na pasta **"eclipse-workspace"**.

### Configure a Base de Dados
1. Crie uma base de dados com o nome de **"Biblioteca"** no MySQL.
2. Na raiz do projeto Java, há uma pasta com o nome de "database", nela há um arquivo chamado "biblioteca.sql". Este arquivo deve ser importado para a base de dados "Biblioteca", criada no passo 1.

**Obs.:** Esta base contém uma tabela chamada "livro", nela há 3 livros previamente cadastrados: "Java: Como Programar", Engenharia de Software" e "UML - Guia do Usuário".

### Configure o Projeto no Eclipse IDE
1. Importe o projeto para o eclipse: File > Import > General > Existing Projects into Workspace
2. Adicione o conector MySQL:
   - Faça download do conector MySQL: https://moodle.utfpr.edu.br/mod/resource/view.php?id=1770834
   - Pressione com o botão direito no projeto e selecione a opção Properties;
   - Selecione Java Build Path > Libraries > Modulepath
   - Se o conector não estiver sendo reconhecido, exclua-o e depois clique em "Add External JARs...";
   - Encontre o conector baixado e adicione-o.
3. Adicione a biblioteca JUnit
   - Botão direito no projeto e selecione a opção Properties;
   - Selecione Java Build Path > Libraries > Classpath;
   - Se a biblioteca JUnit não estiver sendo reconhecida, clique em "Add library...";
   - Selecione "JUnit" e em seguida, na versão, "JUnit5".
