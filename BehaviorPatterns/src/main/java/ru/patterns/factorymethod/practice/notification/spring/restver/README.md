# полноценный мини-проект

Spring Boot + Фабричный метод + REST API

Что будет:

HTTP-контроллер NotificationController с GET-методом /notice/send?type=EMAIL&message=Hello.

http://localhost:8081/notice/send?type=EMAIL&message=Hello

curl -X GET 'http://localhost:8081/notice/send'
curl -X GET "http://localhost:8081/notice/send"
curl -X GET "http://localhost:8081/notice/send?type=EMAIL&message=Hello"
http://localhost:8081/notice/send/