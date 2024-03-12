### Диаграммы с занятия
https://drawsql.app/teams/test-team-193/diagrams/lesson-02
https://drawsql.app/teams/ka-7/diagrams/mydiagram

```sql
CREATE TABLE
  category (
  id serial PRIMARY KEY,
  name varchar(80)
  );

CREATE TABLE
  product (
    id serial PRIMARY KEY,
    name varchar(80),
    price money,
    brand varchar(80),
    category_id integer REFERENCES category (id)
  );
```

```sql
INSERT INTO
  category (name)
VALUES
  ('electronics'),
  ('food'),
  ('clothes');
```

```sql
INSERT INTO
  product (name, price, brand, category_id)
VALUES
  ('salami', 10, 'meat world', 2),
  ('iphoneX', 1000, 'apple', 1),
  ('jeans', 200, 'h&m', 3),
  ('milk', 5, 'meat world', 2),
  ('galaxy', 800, 'samsung', 1);
```

```sql
SELECT
  category.name,
  product.name,
  product.price,
  product.brand
FROM
  product
  JOIN category ON category.id = product.category_id;
```
