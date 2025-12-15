# spring-parent

Это модуль содержит спринг зависимости, чтобы можно было добавить их в проект
Для это надо всего лишь указать в качестве предков этот модуль вот так:

```
  <parent>    
    <groupId>com.alex.patterns</groupId>
    <artifactId>spring-parent</artifactId>
    <version>0.0.1-SNAPSHOT</version>
  </parent>
```
Если в модуле не нужен спринг, то в качестве предка надо использовать это:

```
<parent>
    <groupId>com.alex.patterns</groupId>
    <artifactId>patterns-study</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</parent>
```
spring-boot-starter НЕ будет подключаться ко всем модулям.

Он подключится только к тем модулям, которые наследуются от spring-parent, то есть только к BehaviorPatterns.

Как работает наследование в Maven

Если модуль НЕ наследуется от spring-parent,
он не получит ни:

dependencyManagement из spring-parent

ни <dependencies> spring-parent

ни spring-boot-starter

ни spring-boot-dependencies BOM

То есть Spring не “протекает вверх” и не распространяется автоматически.

✔️ Поведение в твоём проекте
▸ BehaviorPatterns