Разборали, что такое таблица, строки, столбцы, primary key, нормализация в общих словах: 
[ссылка на таблицу](https://docs.google.com/spreadsheets/d/1mHSmVTr-uHDuQHv9AegU6LU2EQhME8zcnloteN5g1pk/edit?usp=sharing)


```sql
CREATE DATABASE test_db OWNER kate_test;
```

```sql
CREATE USER kate_test WITH PASSWORD 'qwerty';
```

```sql
DROP DATABASE test_db;
```

```sql
CREATE TABLE
  students (
    id serial PRIMARY KEY,
    name varchar(80),
    age integer,
    hobby varchar(80),
    profession varchar(80)
  );
```

```sql
DROP TABLE students;
```

```sql
INSERT INTO
  students (name, age, hobby, profession)
VALUES
  ('Andrey', 40, 'guitar', 'drum'),
  ('Alexandra', 26, 'painting', 'economist'),
  ('Arseni', 37, 'bycicle', 'economist');
```

```sql
SELECT
  name,
  age,
  profession
FROM
  students;
```

```sql
SELECT
  *
FROM
  students
WHERE
  name = 'Alexandra';
  ```

```sql
SELECT
  name
FROM
  students
WHERE
  age > 30
  OR profession = 'economist';
```

```sql
SELECT * FROM students ORDER BY age ASC;
  ```

```sql
UPDATE
  students
SET
  age = 27
WHERE
  id = 2;
```

```sql
DELETE FROM
  students
WHERE
  profession = 'drum';
```
