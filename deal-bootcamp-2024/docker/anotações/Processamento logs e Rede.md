```
docker status {name} - mostra os valores de memoria e CPU e afins
docker update {name} -m 128M --cpus 0.2 - limita a quantidade de memória e CPU
docker info - informações dos servidores
dcoker container logs {name} - mostra todos os logs de execução do contêiner
docker network ls - lista todas as redes disponíveis
docker network inspect {name} - inspeciona a rede selecionada
```

## Separando dois contêiner em uma rede separada
```
docker network create minha-rede
docker run -dti --name Ubuntu-A --network minha-rede ubuntu
docker network inspect minha-rede
docker run -dti --name Ubuntu-B --network minha-rede ubuntu
docker network inspect minha-rede

//verificar se está funcionando é so pegar os dois ip no inspect e executar um ping
docker exec -ti Ubuntu-A bash
apt-get update
apt-get install -y iputils-ping
ping {ip}

//se quiser excluir a rede é so sair do bash excluir os dois contêiners e fazer
docker network rm minha-rede

```

link de auxilio
https://academiapme-my.sharepoint.com/personal/kawan_dio_me/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fkawan_dio_me%2FDocuments%2FSlides%20dos%20Cursos%2FDocker%2FM%C3%B3dulo%201%2FCurso%2004&ga=1

