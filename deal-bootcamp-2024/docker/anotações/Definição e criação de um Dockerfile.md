## Criando uma imagem
```
mkdir /images
mkdir ubuntu-python
nano app.py //qualquer código
ls -l
nano dockerfile //código abaixo
docker build {diretorio} -t ubuntu-python
docker images
```

```
FROM ubuntu
RUN apt update && apt install -y python3 && apt clean
COPY app.py /opt/app.py
CMD python3 /opt/app.py
```

## Criando uma imagem personalizada do Apache
```
mkdir debian-apache
cd debian-apache
mkdir site
cd site
//cole um site ou uma aplicação
tar -czf site.tar ./
cp site.tar ../
rm -Rf site
nano Dockerfile //código abaixo
docker image build -t debian-apache:1.0 .
```

```
FROM debian
RUN apt-get update && apt-get install -y apache2 && apt-get clean

//cole as ENV do apache
ADD site.tar /var/www/html

LABEL description = "Apache webserver 1.0"

VOLUME /var/www/html

EXPOSE 80

ENTRYPOINT ["/usr/sbin/apachectl"]

CMD ["-D", "FOREGROUND"]
```

## Criando imagens personalizadas a partir de imagens de linguagens de programação
```
docker pull python
docker images
mkdir python
cd python
nano app.py
nano Dockerfile //cpdigo abaixo
docker image build -t app-python:1.0 .
```

```
FROM python
WORKDIR /usr/src/app
COPY app.py /usr/src/app
CMD ["python", "./app.py"]
```

