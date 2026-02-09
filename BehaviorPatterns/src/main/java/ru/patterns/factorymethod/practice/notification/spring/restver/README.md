# полноценный мини-проект

Spring Boot + Фабричный метод + REST API

Что будет:

HTTP-контроллер NotificationController с GET-методом /notice/send?type=EMAIL&message=Hello.

http://localhost:8081/notice/send?type=EMAIL&message=Hello

curl -X GET 'http://localhost:8081/notice/send'
curl -X GET "http://localhost:8081/notice/send"
curl -X GET "http://localhost:8081/notice/send?type=EMAIL&message=Hello"
http://localhost:8081/notice/send/

curl "http://localhost:8080/send?type=EMAIL&message=Hello+World"
curl "http://localhost:8080/send?type=SMS&message=Test"
curl "http://localhost:8080/send?type=PUSH&message=Push+Test"

Добавим еще один контроллер
/types → вернуть список всех доступных фабрик (типов уведомлений), зарегистрированных в Spring.
/send?type=...&message=... → отправить уведомление выбранного типа.



Пример работы API вручную
▶ Запрос 1: Получить список типов
GET http://localhost:8080/api/types

Ответ:

["EMAIL","PUSH","SMS"]

▶ Запрос 2: Отправить уведомление
GET http://localhost:8080/api/send?type=EMAIL&message=Test+Message

