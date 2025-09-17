# patterns-study

future/intro



git remote add origin https://github.com/alexmnv03/patterns-study.git
git branch -M main
git push -u origin main

https://github.com/smetaniny/design-patterns/tree/master/StructuralPatterns
Паттерны проектирования Банды Четырех (Gang of Four, GoF) — это набор 23 классических паттернов, описанных в книге "Design Patterns: Elements of Reusable Object-Oriented Software", написанной Эриком Гаммой, Ричардом Хелмом, Ральфом Джонсом и Джоном Влипертом. Эти паттерны служат шаблонами для решения распространенных проблем проектирования программного обеспечения и помогают разработчикам создавать гибкие и легко расширяемые системы.

Основные группы паттернов
Паттерны Банды Четырех делятся на три основные категории:

BehaviorPatterns
Порождающие паттерны: Эти паттерны касаются процесса создания объектов. Они обеспечивают механизм, который позволяет создавать объекты, не указывая конкретный класс создаваемого объекта. Примеры: Singleton, Factory Method, Abstract Factory, Builder, Prototype.

StructuralPatterns
Структурные паттерны: Эти паттерны касаются компоновки классов или объектов. Они помогают обеспечить гибкость и простоту взаимодействия между различными частями системы. Примеры: Adapter, Composite, Decorator, * Facade*, Proxy.

GeneratePatterns
Поведенческие паттерны: Эти паттерны касаются взаимодействия между объектами. Они определяют, как объекты взаимодействуют друг с другом и распределяют обязанности между ними. Примеры: Observer, Strategy, **Command **, Mediator, State.

Цели использования паттернов проектирования
Упрощение разработки: Паттерны предоставляют проверенные решения, которые уменьшают необходимость изобретать велосипед.
Увеличение читаемости и понимания кода: Использование паттернов делает код более понятным для других разработчиков, так как они знакомы с этими концепциями.
Повышение гибкости и расширяемости: Паттерны помогают разработать систему, которая легко адаптируется к изменениям и новым требованиям.
Заключение
Изучение паттернов Банды Четырех является важной частью подготовки программистов, особенно тех, кто работает с объектно-ориентированным программированием. Эти паттерны помогают создавать более качественное, чистое и поддерживаемое программное обеспечение.

Singleton (Одиночка)
Factory Method (Фабричный метод)
Abstract Factory (Абстрактная фабрика)
Builder (Строитель)
Prototype (Прототип)
Adapter (Адаптер)
Bridge (Мост)
Composite (Компоновщик)
Decorator (Декоратор)
Facade (Фасад)
Flyweight (Приспособленец)
Proxy (Заместитель)
Chain of Responsibility (Цепочка обязанностей)
Command (Команда)
Interpreter (Интерпретатор)
Iterator (Итератор)
Mediator (Медиатор)
Memento (Хранитель)
Observer (Наблюдатель)
State (Состояние)
Strategy (Стратегия)
Template Method (Шаблонный метод)
Visitor (Посетитель)
Dependency Injection (Внедрение зависимости)
Repository (Репозиторий)
Service Locator (Локатор сервисов)
Event Sourcing (Событийное хранение)
CQRS (Command Query Responsibility Segregation)
Aggregator (Агрегатор)
Specification (Спецификация)
Null Object (Объект-Нуль)
Type Object (Объект типа)
Unit of Work (Единица работы)
Module (Модуль)
Chain of Command (Цепочка команд)
Lazy Initialization (Ленивая инициализация)
Promise (Обещание)
Observer Pattern (Наблюдатель)
Data Mapper (Отображение данных)
Factory (Фабрика)
Active Record (Активная запись)
Command Pattern (Паттерн команды)
Object Pool (Объектный пул)
Interpreter Pattern (Паттерн интерпретатор)
Template Pattern (Паттерн шаблон)
Prototype Pattern (Паттерн прототип)
Strategy Pattern (Паттерн стратегия)
Event-Driven Pattern (Паттерн событий)
Policy Pattern (Паттерн политики)
Wizard/Stepper Pattern (Паттерн "мастера")
State Machine/State Chart (Паттерн конечного автомата) (При создании многостраничных форм со сложной логикой на React)
Presenter Pattern (Паттерн "презентера") (При создании многостраничных форм со сложной логикой на React)
Compound Component (Паттерн "составных компонентов") (При создании многостраничных форм со сложной логикой на React)
Form State Management Pattern (При создании многостраничных форм со сложной логикой на React)


/*

<?xml version="1.0" encoding="UTF-8" ?> 
- <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion> 
  <groupId>ru.tmh.gv</groupId> 
  <artifactId>mss-csc-gv</artifactId> 
  <version>1.1.0-SNAPSHOT</version> 
  <packaging>pom</packaging> 
- <parent>
  <groupId>org.springframework.boot</groupId> 
  <artifactId>spring-boot-starter-parent</artifactId> 
  <version>2.6.7</version> 
  <relativePath /> 
  </parent>
- <properties>
  <maven.compiler.source>14</maven.compiler.source> 
  <maven.compiler.target>14</maven.compiler.target> 
  </properties>
- <modules>
  <module>mss-keycloak-auth-server</module> 
  <module>mss-oauth-resource-server</module> 
  </modules>
  </project>



<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
<parent>
<groupId>com.alex.study.hibernatespring</groupId>
<artifactId>parent-jpa</artifactId>
<version>0.0.1-SNAPSHOT</version>
<relativePath>../parent-jpa</relativePath>
</parent>

	<groupId>com.alex.study.hibernatespring.mapping-inheritance-modules</groupId>
	<artifactId>mapping-inheritance-modules</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>mapping-inheritance-modules</name>
	<packaging>pom</packaging>
	<description>Demo project for Spring Boot</description>
	<properties>
		<java.version>17</java.version>
	</properties>
	
    <modules>
		<!-- <module>value</module>
		<module>value</module>
		<module>value</module> -->
		
    </modules>

</project>






<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
<parent>
<groupId>com.alex.study.hibernatespring</groupId>
<artifactId>hibernate-spring</artifactId>
<version>0.0.1-SNAPSHOT</version>
</parent>

	<!-- <groupId>com.alex.study.hibernatespring</groupId> -->
	<artifactId>parent-boot</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>parent-boot</name>
	<packaging>pom</packaging>
	<description>Demo project for Spring Boot</description>
	<properties>
		<java.version>17</java.version>
		<spring-boot.version>2.7.0</spring-boot.version>
	</properties>

	<dependencyManagement>
    	<dependencies>
        	<dependency>
            	<groupId>org.springframework.boot</groupId>
            	<artifactId>spring-boot-dependencies</artifactId>
            	<version>${spring-boot.version}</version>
            	<type>pom</type>
            	<scope>import</scope>
        	</dependency>
    	</dependencies>
	</dependencyManagement>	
	<dependencies>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

		
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
*/