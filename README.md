## Васильев Егор  
## Группа 4739
 # JavaHomework
## Домашняя работа 1
### 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
### 2) Вывести все простые числа от 1 до 1000
### 3) Реализовать простой калькулятор
## Домашняя работа 2
### 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.  Данные для фильтрации приведены ниже в виде json-строки.  Если значение null, то параметр не должен попадать в запрос. Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} select * from students where 'name=Ivanov' and 'country=Russia' and...
### 2)* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
## Домашняя работа 3

### Пусть дан произвольный список целых чисел.

### 1) Нужно удалить из него чётные числа
### 2) Найти минимальное значение
### 3) Найти максимальное значение
### 4) Найти среднее значение
## Домашняя работа 4
### 1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
### 2) Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя. 
## Домашняя работа 5
### Реализуйте структуру телефонной книги с помощью HashMap.
### Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов. 
#### Краткая документация к заданию
### Метод add добавляет человека и его номер телефона в телефонную книгу, а если имя уже есть в книге, то номер добавляется в список номеров для этого имени, в другом случае, если имя не существует, то создается новый список с этим именем именем и списком его номеров.
### Метод getPhoneNum выполняет поиск всех имён у которых есть этот номер.
### Метод getByName выполняет поиск контакта, вместе с его телефоном(нами), по имени.
### Метод getAll возвращает строку со всеми записями, а сами записи сортируются по уменьшению колличевста телефонов, которые есть у того или иного имени.

