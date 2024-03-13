```sql
CREATE TABLE
  authors (id serial PRIMARY KEY, author_name VARCHAR(100));
  
CREATE TABLE
  books (id serial PRIMARY KEY, book_title VARCHAR(100));
  
CREATE TABLE
  author_books (
    PRIMARY KEY (book_id, author_id),
    book_id INT REFERENCES books (id),
    author_id INT REFERENCES authors (id)
  );
```

```sql
INSERT INTO
  authors (author_name)
VALUES
  ('Leo Tolstoy'),
  ('Jane Austen'),
  ('Fyodor Dostoevsky');

INSERT INTO
  books (book_title)
VALUES
  ('War and Peace'),
  ('Anna Karenina'),
  ('Pride and Prejudice'),
  ('Crime and Punishment');
```

```sql
CREATE TABLE
  author_books (
    PRIMARY KEY (book_id, author_id),
    book_id INT REFERENCES books (id),
    author_id INT REFERENCES authors (id)
  );
```

```sql
SELECT
  authors.author_name,
  books.book_title
FROM
  authors
  JOIN author_books ON authors.id = author_books.author_id
  JOIN books ON author_books.book_id = books.id;
```

```sql
SELECT
*
FROM
  authors
  JOIN author_books ON authors.id = author_books.author_id
  JOIN books ON author_books.book_id = books.id;
```


```sql
CREATE TABLE
  farmer (
    id serial PRIMARY KEY,
    name VARCHAR(80),
    age INT,
    height INT,
    number_of_children INT,
    country VARCHAR(80)
  );
```

```sql
INSERT INTO
  farmer (name, age, height, number_of_children, country)
VALUES
  ('Joanes', 47, 180, 5, 'Germany'),
  ('Pierre', 40, 175, 2, 'France'),
  ('Gerard', 60, 184, 4, 'Germany'),
  ('Juan', 35, 164, 1, 'Ecuador'),
  ('Marek', 30, 186, 0, 'Poland');
```

```sql
SELECT
  *
FROM
  farmer
WHERE
  age != 60;
```

```sql
SELECT
  *
FROM
  farmer
WHERE
 name ILIKE 'j%';
```

```sql
SELECT
  *
FROM
  farmer
WHERE
 name ILIKE '%are%';
```

```sql
SELECT
  *
FROM
  farmer
WHERE
 country = 'Germany' AND age='47';
```

```sql
SELECT
  *
FROM
  farmer
WHERE
  country NOT IN ('Germany', 'Poland');
```

```sql
SELECT
  *
FROM
  farmer
WHERE
  height BETWEEN 170 AND 185;
```

```sql
SELECT
  *
FROM
  farmer
WHERE
  number_of_children IS NULL;
```

```sql
SELECT
  AVG(number_of_children)
FROM
  farmer;
```

```sql
SELECT
  MAX(age) AS max_age
FROM
  farmer;
```

```sql
SELECT
  country,
  MIN(age) AS min_age
FROM
  farmer
GROUP BY
  country;
```

```sql
SELECT
  country,
  COUNT(id) AS farmer_count
FROM
  farmer
GROUP BY
  country
HAVING
  COUNT(id) >= 2;
```

```sql
CREATE TABLE
  dress (
    id serial PRIMARY KEY,
    title VARCHAR(80),
    price INT CHECK (price > 0)
  );
```

```sql
INSERT INTO dress
  (title, price)
VALUES
  ('black dress', 100),
  ('red mini dress', -100);
```

```sql
INSERT INTO dress
  (title, price)
VALUES
  ('black dress', 100),
  ('red mini dress', -100);
```

```sql
CREATE TABLE
  dress (
    id serial PRIMARY KEY,
    title VARCHAR(80),
    price INT CONSTRAINT must_be_positive_price CHECK (price > 0),
    discounted_price INT CONSTRAINT must_be_positive_discounted_price CHECK (discounted_price > 0),
    CONSTRAINT valid_price CHECK (price > discounted_price)
  );
```

```sql
INSERT INTO
  dress (title, price, discounted_price)
VALUES
  ('black dress', 100, 80),
  ('red mini dress', 200, 180);
```

```sql
CREATE TABLE
  dress (
    id serial PRIMARY KEY,
    title VARCHAR(80) UNIQUE,
    price INT CONSTRAINT must_be_positive_price CHECK (price > 0),
    discounted_price INT CONSTRAINT must_be_positive_discounted_price CHECK (discounted_price > 0),
    CONSTRAINT valid_price CHECK (price > discounted_price)
  );
```

```sql
INSERT INTO
  dress (title, price, discounted_price)
VALUES
  ('black dress', 100, 80),
  ('red mini dress', 200, 180),
  ('black dress', 300, 180);
```

```sql
CREATE TABLE
  truck (
    id serial PRIMARY KEY,
    brand VARCHAR(80),
    farmer_id INT,
    FOREIGN KEY (farmer_id) REFERENCES farmer(id)
  );
```

```sql
INSERT INTO truck
  (brand, farmer_id)
VALUES
  ('Cross', 2);
```

```sql
INSERT INTO truck
  (brand, farmer_id)
VALUES
  ('Belarus', 6);
```

```sql
CREATE TABLE
  truck (
    id serial PRIMARY KEY,
    brand VARCHAR(80),
    farmer_id INT,
    FOREIGN KEY (farmer_id) REFERENCES farmer(id) ON DELETE CASCADE
  );
```

```sql
DELETE FROM
  farmer
WHERE
  id = 6;
```

```sql
CREATE INDEX farner_index ON farmer(height);
```
