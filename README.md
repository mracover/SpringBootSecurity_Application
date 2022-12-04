# SpringBootSecurity_Application
Приложение на Spring Boot. Аунтификация и авторизации сделана с помощью Spring Security.

# Работа приложения
+ Пользователь `user`. Показывают всю информаицю о пользователе.
+ Пользователь `admin`. Имеет возможность добавлять, удалять и редактировать всех пользователей из БД. Также во вкладке `user` можно посмотреть информацию 
о пользователи с ролью `admin`.
https://user-images.githubusercontent.com/79517707/205501348-7145ba68-1837-434b-a0f0-6a25159ae634.mp4
Реализован вход и регистрация для новых пользователей. Новые пользователи по умолчанию имеют роль `user` . <br/>
Перед началом работы необходимо произвести sql запросы для создания `admin` . Они прописаны в файле `addInitAdmin.sql` . <br/>

# Используемые технологии
+ Java 11
+ Maven
+ Spring (Sring boot, Spring MVC, Spring security)
+ MySQL
+ Hibernate
+ Rest API 
+ Thymeleaf
+ Bootstrap
+ JavaScript (AJAX, Fetch)
