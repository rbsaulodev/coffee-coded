## Definição 
Docker compose é uma ferramenta desenvolvida para ajudar a definir e compartilhar aplicativos com vários contêiner. Um exemplo é você estar criando uma aplicação e nela tem o back-end, front-end e um banco de dados, sem o docker compose você teria que subir todos uma de uma vez para ver a aplicação rodando, com o compose você pode juntar todos os 3 contêiner em um arquivo e subir a aplicação com apenas 1 comando. Obs o docker compose é escrito na extensão ```".yaml"``` .

## Exemplo de arquivo YAML
```
version: '3.8'

services:
  # Serviço para o banco de dados PostgreSQL
  postgres:
    image: postgres:15
    container_name: postgres
    environment:
      POSTGRES_DB: mydatabase
      POSTGRES_USER: myuser
      POSTGRES_PASSWORD: mypassword
    ports:
      - "5432:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data

  # Serviço para a aplicação Spring Boot
  springboot-app:
    image: your-springboot-app-image
    container_name: springboot-app
    environment:
      SPRING_DATASOURCE_URL: jdbc:postgresql://postgres:5432/mydatabase
      SPRING_DATASOURCE_USERNAME: myuser
      SPRING_DATASOURCE_PASSWORD: mypassword
    ports:
      - "8080:8080"
    depends_on:
      - postgres

```
----
## Explicação 
Primeiro colocamos a versão do arquivo YAML lembrando que ele sempre segue a versão do docker que está usando depois colocamos os serviços adicionando o nome e depois a imagem que vamos utilizar. Logo depois colocamos as variáveis de ambiente que são necessárias para a conexão com o dashboard de admin do banco de dados e em seguida colocamos qual é porta que vamos expor para a conexão e em baixo o volume. Em baixo temos o serviço para aplicação Spring Boot, tendo praticamente as mesmas coisas e a avisando que o serviço depende do Banco de dados
## Exemplo Prático
```
// Criando um Bind para o banco de dados
mkdir /data/mysql
cd data/mysql

// Criando um lugar onde vamos armazena os compose
mkdir compose
cd compose

// Criando o primeiro docker compose
mkdir primeiro
nano docker-compose.yml - copie o código abaixo

//Subindo o docker
docker-compose up -d
```

```
version: '3.8'

services:
  mysqlsrv:
    image: mysql:5.7
    environment:
      MYSQL_ROOT_PASSWORD: "Senha123"
      MYSQL_DATABASE: "testedb"
    ports:
      - "3306:3306"
    volumes:
      - /data/mysql-C:/var/lib/mysql
    networks:
      - minha-rede

  adminer:
    image: adminer
    ports:
      - 8080:8080
    networks:
      - minha-rede

networks: 
  minha-rede:
    driver: bridge
```
-----
## Docker Compose Down
Comando para parar os contêineres e exclui a rede de acesso, para subir novamente é so usar o comando docker-compose up

-----
## Utilizando exemplos do Github do Docker
Link: https://github.com/docker/awesome-compose/tree/master
Vamos usar de exemplo um compose onde teremos nextcloud, redis e mariadb

compose:
```
services:
  nc:
    image: nextcloud:apache
    restart: always
    ports:
      - 80:80
    volumes:
      - nc_data:/var/www/html
    networks:
      - redisnet
      - dbnet
    environment:
      - REDIS_HOST=redis
      - MYSQL_HOST=db
      - MYSQL_DATABASE=nextcloud
      - MYSQL_USER=nextcloud
      - MYSQL_PASSWORD=nextcloud
  redis:
    image: redis:alpine
    restart: always
    networks:
      - redisnet
    expose:
      - 6379
  db:
    image: mariadb:10.5
    command: --transaction-isolation=READ-COMMITTED --binlog-format=ROW
    restart: always
    volumes:
      - db_data:/var/lib/mysql
    networks:
      - dbnet
    environment:
      - MYSQL_DATABASE=nextcloud
      - MYSQL_USER=nextcloud
      - MYSQL_ROOT_PASSWORD=nextcloud
      - MYSQL_PASSWORD=nextcloud
    expose:
      - 3306
volumes:
  db_data:
  nc_data:
networks:
  dbnet:
  redisnet:
```

```
cd /compose/
mkdir cloud
cd cloud/
nano docker-compose.yml
docker-compose up -d
```