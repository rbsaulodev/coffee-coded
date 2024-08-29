## Modelo Cliente-Servidor
É um modelo onde temos um servidor onde vamos ter um recurso onde os user vão usar e afins, e toda vez que eles precisam consumir este recurso eles consomem através de requisições https explicando em [[Verbos HTTP]]

## Cloud
É o modelo que o acesso do recurso e demanda é na internet, fazendo a requisição numa rede global de servidores remotos exemplos: AWS e Azure

## Virtualização
É uma maneira de "dividir" o hardware em varias "caixas" para determinada aplicação, que vou ser chamado de servidores virtuais

## Micro serviços
É uma abordagem arquitetônica e organizacional que separam um bloco de código em micro serviços independentes que se comunicam APIs

Exemplo:
Em um aplicativo de banco temos a parte de login, em vez de fazemos o login puxando em um bloco de código todo, vamos ter uma micro serviço ou um bloco de código independe só para a parte de login assim ajudando na organização escalabilidade do software. Assim vai para os demais serviços do aplicativo: Checar Estrato, Ver Saldo, Investimentos, Fazer TED, Fazer pix e etc.

## Contêiner
É uma forma de separar a sua aplicação em varias "caixas" criando uma virtualização para cada componente dela exemplos: API, Front-end e BD.

## Docker
É o software que ajuda a trabalhar com os contêineres conseguindo manipular eles da maneira de você quiser.

-----
### **Links Úteis** 

Separamos aqui alguns materiais complementares como **artigos, apostilas, apresentações**, entre outros. Esses materiais serão úteis para você se aprofundar ainda mais nos principais temas deste Módulo, listados a seguir:

**O que são containers?** 

[https://www.ibm.com/br-pt/cloud/learn/containers](https://www.ibm.com/br-pt/cloud/learn/containers)

[https://www.redhat.com/pt-br/topics/containers](https://www.redhat.com/pt-br/topics/containers)

**Diferenças entre containers e máquinas virtuais (VMs)**

[https://www.redhat.com/pt-br/topics/containers/containers-vs-vms](https://www.redhat.com/pt-br/topics/containers/containers-vs-vms)

**O que é Docker?**

[https://www.redhat.com/pt-br/topics/containers/what-is-docker](https://www.redhat.com/pt-br/topics/containers/what-is-docker)

[https://docs.microsoft.com/pt-br/dotnet/architecture/microservices/container-docker-introduction/docker-defined](https://docs.microsoft.com/pt-br/dotnet/architecture/microservices/container-docker-introduction/docker-defined)

**Comandos essenciais** 

[https://medium.com/xp-inc/principais-comandos-docker-f9b02e6944cd](https://medium.com/xp-inc/principais-comandos-docker-f9b02e6944cd)

[https://docs.docker.com/engine/reference/commandline/docker/](https://docs.docker.com/engine/reference/commandline/docker/)

[https://dev.to/soutoigor/docker-imagens-containers-e-seus-principais-comandos-23p6](https://dev.to/soutoigor/docker-imagens-containers-e-seus-principais-comandos-23p6)