## Comandos - Apache
```
docker pull httpd
mkdir /data/apache-A
cd /data/apache-A
nano index.html
cola um codigo html
Crtl O e Crtl X
docker run --name apache-A -d -p 80:80 --volume=/data/apache-A:/usr/local/apache2/htdocs httpd
ip a
pega o ip e cola no browser
```
------
## Comandos - PHP Apache
```
docker pull php:7.4-apache
mkdir php-A
docker run --name php-A -d -p 8080:80 ---volume=/data/php-A:/var/www/html php:7.4-apache
ls
cd php-A
nano index.php
cola um codigo html com um comando PHP
Crtl O e Crtl X
ip a
pega o ip e cola no browser
```

Arquivos de estudos sobre Mount
https://academiapme-my.sharepoint.com/personal/kawan_dio_me/_layouts/15/onedrive.aspx?ga=1&id=%2Fpersonal%2Fkawan_dio_me%2FDocuments%2FSlides%20dos%20Cursos%2FDocker%2FM%C3%B3dulo%201%2FCurso%2003%2FMaterial%20Complementar
