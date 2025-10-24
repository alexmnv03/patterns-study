# Фабричный метод

Стройка

Надо создать созадние роботов строителей

К нам приходит запрос на создание нужного типа робота-строителя метод builderGenerator.
И в ответе получаем конкретный тип фабрики для создания нужного строителя - метод только для демонстрации

BuilderRobot - общий тип роботов
Конкретные типы:
WelderBot - сварщик
MasonBot - каменщик
CraneBot - крановщик
CarpenterBot - плотник
PlastererBot - штукатур
PlumberBot - сантехник
HelperBot - подсобник

BuilderAbstractFactory - абстрактная фабрика
Конкретные фабрики
WelderBotFactory
MasonBotFactory
CraneBotFactory
CraneBotFactory
CraneBotFactory
PlastererBotFactory
Factory
