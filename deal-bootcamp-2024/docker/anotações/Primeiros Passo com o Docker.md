## Comandos Básicos 
```
docker pull {imagem} - para baixar imagens também pode usar o proprio site de imagens do docker

docker images - para ver todas as imagens

docker run {imagem} - roda uma imagem

docker ps - mostra todos os contêineres em execução

docker ps -a - mostra os contêineres que foram executados recentemente

docker run -dti (image) - deixa rodando o contêiner em background e retornando o ID

docker stop {ID} - para a execução de um contêiner

docker rm {ID} - remova um container

docker rmi {imagem} - remova uma imagem

docker run --name {name} {imagem} - nomeia o contêiner

docker cp {arquivo} {name}:/{diretorio} - copia um arquvio da sua maquina para o contêiner desejado

docker cp {name}:{diretorio} - copia um arquivo do contêiner para a maquina local

docker inspect {name} - inspeciona um contêiner selecionado

docker start {name} - voltar a execução de um contêiner parado
```
-----
## TAGs
É a maneira de saber qual é a versão da imagem que vai ser instalado podendo ser nome ou números. Exemplo:
```
docker pull debian:9 (SO debian versão 9)
```

## Criando um contêiner MYSQL
Comandos:
```
docker pull mysql //instalar a imagem do mysql
docker images //verificas as imagens 
docker run -e MYSQL_ROOT_PASSWORD=1234 --name bd-mysql -d -p 3306:3306
docker exec -it bd-mysql bash //roda um bash dentro do contêiner
mysql -u root -p protocol=tcp // entra como root conseguindo manipular o bd

//Codigos SQL
CREATE DATABASE teste; //cria um banco de dados
SHOW DATABASES; //mostra todos os banco de dados dentro da maquina

```

Explicação 
```
docker run -e MYSQL_ROOT_PASSWORD=1234 --name bd-mysql -d -p 3306:3306
-e : seta as variavies de ambiente
--name seta o nome do contêiner
-d : deixa roudando em background
-p : seta as portas de acesso
```
