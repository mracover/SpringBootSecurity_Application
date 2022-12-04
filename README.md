# SpringBootSecurity_Application
Приложение на Spring Boot. Аунтификация и авторизации сделана с помощью Spring Security.

# Работа приложения
+ Пользователь `user`. Показывают всю информаицю о пользователе.
+ Пользователь `admin`. Имеет возможность добавлять, удалять и редактировать всех пользователей из БД. Также во вкладке `user` можно посмотреть информацию 
о пользователи с ролью `admin`.
<p align="center">
https://user-images.githubusercontent.com/79517707/205501585-53b2412b-b5ce-4d41-a1fc-f8ac0e1814a0.mp4
</p>
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







