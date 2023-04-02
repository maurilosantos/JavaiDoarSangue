# Projeto JaVai Doar Sangue
### Descrição

O sistema desenvolvido tem por objetivo facilitar a conexão entre hemocentros e doadores de sangue, além de fazer um gerenciamento de estoque para hemocentros. O projeto foi realizado finalizando o bloco de Java avançado da Generation Brasil.

*Diagrama das Classes:* 

```mermaid
classDiagram
class Usuario {
<<Abstract>>
  - user:    int
  - nome:  String
  - cidade String
  - estado: String
  - tipo: int
  +int getNumero()
  +String getNome()
  +String getCidade()
  +String getEstado()
  +int getTipo()
  +void setNumero(int numero)
  +void setNome(String nome)
  +void setEstado(String estado)
  +void setTipo(int tipo)
  +void visualizar()
  +void visualizarApto()
  +void visualizarEstoque()
}
class UsuarioDoador {
   - tipoSanguineo: String
   - idade: int
   - peso: int
   - sexo: char
   - ultimaDoacaoMeses: int
+ String getTipoSanguineo()
+ int getIdade()
+ int getPeso()
+ chat getSexo()
+ int getUltimaDoacaoMeses
+void setTipoSanguineo(String tipoSanguineo)
+void setIdade(int idade)
+void setPeso(int peso)
+void setSexo(char sexo)
+void setUltimaDoacaoMeses(int ultimaDoacaoMeses)
+void visualizar()
+void visualizarApto()
}
class UsuarioHemocentro {
 - site: String
 - rua: String
 - telefone; String
 - quantidadeDeBolsas: int
 - tipoAmais: int
 - tipoAmenos: int
 - tipoBmais: int
 - tipoBmenos: int
 - tipoABmais: int
 - tipoABmenos: int
 - tipoOmais: int
 - tipoOmenos: int
+ int getSite()
+ int getRua()
+ int getTelefone()
+ int getQuantidadeDeBolsas()
+ int getTipoAmais()
+ int getTipoAmenos()
+ int getTipoBmais()
+ int getTipoBmenos()
+ int getTipoOmais()
+ int getTipoOmenos()
+ void setSite(String site)
+ void setRua(String rua)
+ void setTelefone(String telefone)
+ void setQuantidadeDeBolsa(int quantidadeDeBolsas)
+ void setTipoAmais(int tipoAmais)
+ void setTipoAmenos(int tipoAmenos)
+ void setTipoABmais(int tipoABmais)
+ void setTipoABmenos(int tipoABmenos)
+ void setTipoBmais(int tipoBmais)
+ void setTipoBmenos(int tipoBmenos)
+ void setTipoOmais(int tipoOmais)
+ void setTipoOmenos(int tipoOmenos)
+ void visualizar()
+ void totalBolsas()
+ void visualizarEstoque()
+ void retirarBolsa()
+ void adicionarBolsa()
}
class UsuarioRepository{
<< Interface >>
 + void listarDoadores()
 + void ProcurarDoadoresPorUser(int user)
 + void listarDoadoresAptos()
 + void listarHemocentros()
 + void cadastrar(Usuario usuario)
 + void atualizar(Usuario usuario)
 + void deletar(int user)

}
class UsuarioController{
 + void listarDoadores()
 + void ProcurarDoadoresPorUser(int user)
 + void listarDoadoresAptos()
 + void listarHemocentros()
 + void cadastrar(Usuario usuario)
 + void atualizar(Usuario usuario)
 + void deletar(int user)
 + Usuario buscarNaCollection(int user)
 + Usuario buscarNaCollectionCidade
 + int gerarUser()
 + int retornaTipo(int user)
}
Usuario <|-- UsuarioDoador
Usuario <|-- UsuarioHemocentro
Usuario <.. UsuarioRepository
UsuarioRepository <|.. UsuarioController
```



### Funcionalidade

No sistema há todas as funções **CRUD** (Create, Read, Update, Delete) tanto para doadores quanto para hemocentros, também há funções específicas como verificar quais são os doadores aptos na doação de sangue para os hemocentros seguindo as informações inseridas no cadastro dos usuários doadores.

![projetoJava](https://github.com/maurilosantos/JavaiDoarSangue/blob/main/ProjetoJava.gif?raw=true)

### Tecnologias

<div align="center"> 	<code><img height="50" src="https://user-images.githubusercontent.com/25181517/192108372-f71d70ac-7ae6-4c0d-8395-51d8870c2ef0.png" alt="Git" title="Git" /></code> 	<code><img height="50" src="https://user-images.githubusercontent.com/25181517/117201156-9a724800-adec-11eb-9a9d-3cd0f67da4bc.png" alt="Java" title="Java" /></code> 	<code><img height="50" src="https://user-images.githubusercontent.com/25181517/117201470-f6d56780-adec-11eb-8f7c-e70e376cfd07.png" alt="Spring" title="Spring" /></code> </div>

### Como acessar

1. Antes de começar, certifique-se de ter instalado o seguinte:

- Java SDK
- IDE de sua preferência, foi usado: Spring Tool Suite ou Eclipse.

2. Pegue o projeto com o comando `git clone` para seu servidor local.

3. Importe o projeto para o IDE.
4. Execute (Run) na Classe Principal *Menu.java* e observe o projeto no Console.
