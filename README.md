# Командный проект по курсу «Java для тестировщиков»

* [Цели проекта.](#цели-проекта)
* [Чеклист готовности к работе над проектом.](#Чеклист-готовности-к-работе-над-проектом)
* [Описание проекта.](#Описание-проекта)
* [Сроки реализации проекта.](#Сроки-реализации-проекта)
* [Инструкция к выполнению:](#Инструкция-к-выполнению)
    * [1 этап,](#1-этап)
    * [2 этап,](#2-этап)
    * [3 этап,](#3-этап)
    * [4 этап,](#4-этап)
    * [5 этап.](#5-этап)
* [Правила сдачи проекта.](#Правила-сдачи-проекта)
* [Критерии оценки.](#критерии-оценки)


## Цели проекта

Цель командного проекта — протестировать приложение для операций с банковскими счетами.  
Вам предстоит:

- самостоятельно протестировать часть проекта,
- составить баг-репорты на найденные баги
- закрыть составленные вашим коллегой баг-репорты, исправив баги.

Выполнив командный проект, вы:

- получите практический опыт работы в команде,
- прокачаете навыки коммуникации и умение выполнять задачи в срок,
- закрепите навыки работы с GitHub,
- потренируете навык проверки кода и совместной разработки.

## Чеклист готовности к работе над проектом

1. Изучили «Инструкцию по выполнению командного проекта» и «Правила работы в команде» в личном кабинете.
2. Знаете, кто с вами в команде.
3. Познакомились с напарником и определились, каким способом будете общаться: переписка в любом мессенджере, видеозвонки.
4. Договорились, кто будет размещать общий репозиторий проекта и отправлять его на проверку. Далее этот участник команды называется участником `A`.
5. Прошли материалы модуля до лекции «Исключительные ситуации и их обработка. Тестирование исключений» включительно.

Если все этапы чеклиста пройдены, можно приступать к работе над проектом. Успехов.

## Описание проекта

- В репозитории находится заготовка проекта, в которой есть классы для двух видов банковских счетов: сберегательного (`SavingAccount`) и кредитного (`CreditAccount`).

- Оба счёта имеют три основные операции: пополнение (`add`), покупку (`pay`) и прогноз процентов за год (`yearChange`).

- Для дополнительного задания есть ещё класс `Bank`, в котором есть операция перевода (`transfer`) с одного счёта на другой.

- В загатовке дана реализация этих классов, в которой есть дефекты.

- Над каждым методом в коде есть подробное описание того, как он должен работать. При этом часть методов в этих классах не реализована, часть реализована с дефектами.

**Ваша задача** — исправить эти дефекты и дописать нереализованные методы.

## Сроки реализации проекта

Работа над проектом рассчитана на 10 дней для команды из двух человек. Для планирования времени рекомендуем опираться на роадмап. Придерживайтесь следующего деления проекта на этапы и задачи участников:
| Этапы | Количество дней | Задачи |
| ----- | --------------- | ----- |
| 1, 2 этапы | 1 день | Создание репозитория для проекта, предоставление доступа участникам, распределение задач |
| 3 этап | 2 дня | Поиск дефектов, добавление тестов и составление баг-репортов|
| 4 этап | 2 дня | Исправление дефектов и реализация методов |
| 5 этап | 2 дня| Проверка на дефекты |
| Сдача проекта | 3 дня | Отправка и обратная связь от проверяющего преподавателя |
| Доработка по результатам* (при необходимости) | 2 дня | Доработка проекта по итогам обратной связи от проверяющего |
| Повторная сдача проекта* (при необходимости) | 3 дня | Отправка и обратная связь от проверяющего преподавателя |

Параллельно вы можете делать дополнительное зедание в более свободной форме (см. ниже).

## Инструкция к выполнению

### 1 этап. Создание общего репозитория  

- Один из участников (`участник A`) создаёт у себя репозиторий и размещает в нём содержимое этого репозитория, не через `Fork`, настраивает CI. Для этого можно склонировать этот репозиторий и добавить новый `remote` в свой репозиторий.

Например, так:

```bash
git clone <адрес этого репозитория>
cd javaqa-team-diplom-2
git remote remove origin
git remote add origin <адрес вашего репозитория>
git remote -v
```

- Чтобы выдать доступ второму участнику, участнику А нужно зайти в `Settings` репозитория проекта, найти раздел `Collaborators`, кликнуть по кнопке `Add people`, добавить ник напарника и выбрать роль `Admin`.

### 2 этап. Распределение задач

Распределите задачи между участниками в соответствии с таблицей.
|  | Участник А | Участник Б |
| --- | ----------- | ----- |
| Ищет дефекты в | Класс `CreditAccount` | Класс `SavingAccount` |
| Исправляет дефекты в | Класс `SavingAccount` | Класс `CreditAccount` |

Отведите две ветки — `saving` для исправления дефектов в `SavingAccount` и `credit` для исправления дефектов в `CreditAccount` от одного и того же последнего коммита.

### 3 этап. Поиск дефектов

|  | Участник А | Участник Б |
| --- | ----------- | ----- |
| Ищет дефекты в | Класс `CreditAccount` | Класс `SavingAccount` |
| Добавляет тесты в | Класс `CreditAccountTest` | Класс `SavingAccountTest` |
| Делает это в ветке | `credit` | `saving` |
| Составляет баг-репорты | по образцу ниже | по образцу ниже |

**Важно**: никакие классы на этом этапе менять нельзя.

Формат оформления баг-репорта вам [был дан](https://github.com/netology-code/javaqa-homeworks-video/blob/javaqa-55/HW_INTRO.md#%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82-%D0%BE%D1%84%D0%BE%D1%80%D0%BC%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B1%D0%B0%D0%B3-%D1%80%D0%B5%D0%BF%D0%BE%D1%80%D1%82%D0%B0) в первом домашнем задании.
Стоит учесть следующие моменты и дополнения.

* Локация дефекта — это не место с тестом, а место тестируемого класса, где, на ваш взгляд, происходит дефект; можно указать просто на первую строчку объявления метода.
* В шагах следует описывать те действия, которые нужно сделать с тестируемым объектом, чтобы найти дефект. Например, создать объект такого-то класса с таким-то начальным балансом, пополнить счёт на столько-то рублей.
* После ожидаемого и фактического результатов вставьте ещё один раздел, в котором сошлётесь на тест, проверяющий то, что вы описали в шагах. Оформите вставку кода как с локацией дефекта.

### 4 этап. Исправление дефектов и реализация методов  

|  | Участник А | Участник Б |
| --- | ----------- | ----- |
| Исправляет найденные баги в | Класс `SavingAccount` | Класс `CreditAccount` |
| Исправления коммитятся в ветку | `saving` | `credit` |

Никакие другие классы менять нельзя.

### 5 этап. Проверка на дефекты  

- Оба участника возвращаются к этапу 3 **«Поиск дефектов»** и составляют новые баг-репорты.

- Если новые дефекты найдены, участники переходят опять к этапу 4 **«Исправление дефектов и реализация методов»**.

- Если дефектов в ветке не найдено, то участник, который поддерживает эту ветку, делает `merge` в `main`, при необходимости разрешая конфликты. `merge` следует делать через `PullRequest`.

### Дополнительное задание

- Дополнительно можно протестировать операцию перевода денег со счёта на счёт в классе `Bank`. 

- Кто заводит баг-репорты, а кто исправляет, договоритесь сами. Можно решать и командным брейнштормом, т. е. обсуждая реализацию вместе.

- Дополнительное задание можно выполнять в одиночку. Если оба решили выполнить в одиночку, отведите ветки — `bank-a` для работы `участника A` и `bank-b` для работы `участника B`.

- Если вы сделали дополнительное задание, напишите об этом при отправке.

## Правила сдачи проекта

- Все дефекты исправлены.
- Все ветки слиты в `main`.
- Все баг-репорты закрыты.
- CI-сборка зелёная.
- Добавлена ссылка на публичный репозиторий в личном кабинете в поле «Ссылка на решение».
- Важно: перед отправкой в поле «Отправить на проверку эксперту» проставлена галочка.

## Критерии оценки проекта

В командном проекте будет оцениваться:

* какие дефекты были найдены каждым участником команды, как они были оформлены;
* какие дефекты были исправлены каждым участником команды, включая качество кода.

Если ряд важных багов не выявили, с подсказками проверяющего преподавателя можно вернуться к этапу 4 для исправления упущенных дефектов. Дорабатывать можно уже сразу в ветке `main`.

**Зачёт ставится обоим студентам при выполнении всех требований командного проекта.**

