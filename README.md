# Disciplina OO2 - Exercício Biblioteca

## Download do Projeto

1. Clone o projeto para a pasta **"eclipse-workspace"**:

```
git clone https://github.com/vcandrade/BibliotecaOO2
```

- Alternativa: Faça download e descompacte o projeto na pasta **"eclipse-workspace"**.

## Configure a Base de Dados

1. Crie uma base de dados com o nome de **"biblioteca"** no MySQL.

2. Na raiz do projeto Java, há uma pasta com o nome de **"database"**, nela há um arquivo chamado **"biblioteca.sql"**. Este arquivo deve ser importado para a base de dados **"biblioteca"**, criada no passo 1.

**Obs.:** Esta base contém uma tabela chamada **"livro"**, nela há 3 livros previamente cadastrados: _"Java: Como Programar"_, _"Engenharia de Software"_ e _"UML - Guia do Usuário"_.

## Configure o Projeto no Eclipse IDE

1. Importe o projeto para o eclipse: _File_ > _Import_ > _General_ > _Existing Projects into Workspace_

2. Execute o arquivo **"BancoDadosTeste.java"** disponível na pasta **"src/test/java"**
