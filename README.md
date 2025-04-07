# Calorie Tracker API

Calorie Tracker — это REST API приложение, разработанное для отслеживания дневной нормы калорий, учета съеденных блюд и управления приемами пищи пользователей.

## Содержание

- [Описание](#Описание)
- [Требования](#Требования)
- [Установка](#Установка)

## Описание

Это приложение позволяет:
- Добавлять пользователей с параметрами, такими как имя, email, возраст, вес, рост и цель (похудение, поддержание или набор массы).
- Добавлять блюда и их калорийность.
- Учитывать приемы пищи и список блюд в каждом приеме пищи.
- Получать отчеты по дневной норме калорий и истории питания.

## Требования

- Java 11 или выше
- Spring Boot
- PostgreSQL
- Maven

## Установка

1. Клонируйте репозиторий:

   ```bash
   git clone git@github.com:DVolodya/Rest_API.git
   cd calorie-tracker
2. Откройте проект при помощи Intelij Idea и подгрузите все зависимости.
3. Убедитесь, что у вас есть установленный PostgreSQL.
Если нет, то создайте базу данных пр помощи sql запроса в программе PostgreSQL

**CREATE DATABASE calorie_tracker;**

4. Настройте файл src/main/resources/application.properties с вашими данными для подключения к базе данных.

properties

spring.datasource.url=jdbc:postgresql://localhost:5432/calorie_tracker

spring.datasource.username=your_username

spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

5. Запустите приложение
