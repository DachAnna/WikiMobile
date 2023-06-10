### Выполнены автотесты на мобильное приложение Wikipedia
![изображение](https://user-images.githubusercontent.com/118796374/233400972-3ae6f60d-a151-4deb-bd8b-2b074377ab77.png)

### Реализована возможность запуска тестов на разных окружениях :
- сервис browserstack
- эмулятор Android Studio
- реальное устройство
- 
## :point_right: Проект в Allure TestOps с автотестами с результатами их прохождения.
<a target="_blank" href="https://allure.autotests.cloud/project/2297/dashboards">Проект в Allure TestOps</a>

В Allure TestOps хранится информация по автотестам проекта, по запускам сборок, а также отчет по пройденным сборкам.
![изображение](https://github.com/DachAnna/WikiMobile/assets/118796374/e805499b-f045-424e-959d-a96269f3bae4)



## :point_right:  Jenkins job c Allure Report с результатами пройденной сборки.
<a target="_blank" href="https://jenkins.autotests.cloud/job/08-sub_ekt-wiki/">Сборка в jenkins</a>

В Allure Report отображается вся информация по пройденной сборке
![изображение](https://github.com/DachAnna/WikiMobile/assets/118796374/9f427fe2-ed4e-49e4-bc0f-10e7167886d5)

Команды для запуска тестов:
```bash
gradle clean test -DdeviceHost=browserstack
gradle clean test -DdeviceHost=emulation
gradle clean test -DdeviceHost=real
```

### Для запуска удаленных тестов необходимо заполнить properties или передать значение:

* userName
* accessKey
* baseUrl

Запуск тестов с заполненным properties:
```bash
gradle clean android
```
Сформировать отчет:
```bash
allure serve build/allure-results
```
Пример прохождения одного из автотестов

https://github.com/DachAnna/WikiMobile/assets/118796374/7923cf01-e06d-4a90-8580-e870d1e1d038

