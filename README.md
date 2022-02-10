# Gerenciamento de imoveis com gRPC
Trabalho da disciplina de Sistemas Distribuídos com o intuito de construir um gerenciamento de imoveis (CRUD completo) utilizando a tecnologia gRPC.

## Executar
1. Clone o projeto em sua maquina;
2. Import o projeto em sua IDE de preferência;
3. Atualize o projeto utilizando o Maven, para que sejá baixado todas as dependências e plugins configurados no projeto.<br/>
   **IDE Eclipse:** Clique com o botão direito do seu mouse sobre o projeto, Maven, Update Project;
4. Executando o projeto: <br/>
   **Servidor** : em `src/main/java`, pacote `server` , execute a classe `PropertieServer` usando **Java Application**, será exibido no terminal a seguinte mensagem `Server start in port 50051` ou a porta em que foi configurada ;<br/>
   **App** : em `src/main/java`, pacote `client` , execute a classe `App` usando **Java Application**;
