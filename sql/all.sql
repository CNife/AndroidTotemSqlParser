CREATE CLASS product (id int, name char, price int);
INSERT INTO product (id, name, price)
VALUES
  (1, 'mac', 14000);
INSERT INTO product (id, name, price)
VALUES
  (2, 'ipad', 7000);
INSERT INTO product (id, name, price)
VALUES
  (3, 'iphone', 7000);
INSERT INTO product (id, name, price)
VALUES
  (4, 'mi', 2500);
INSERT INTO product (id, name, price)
VALUES
  (5, 'vivo', 3000);
SELECT
  id,
  name,
  price
FROM product;
DELETE FROM product
WHERE
  name = 'mi';
UPDATE product
SET
  price = 4900
WHERE
  name = 'iphone';
SELECT
  id,
  name,
  price
FROM product;
CREATE SELECTDEPUTY usproduct (sales int)
SELECT
  name AS name,
  (price / 7) AS usprice
FROM product
WHERE
  price > 5000;
SELECT
  sales,
  name,
  usprice
FROM usproduct;
UPDATE usproduct
SET
  sales = 3000
WHERE
  name = 'ipad';
UPDATE usproduct
SET
  sales = 2000
WHERE
  name = 'mac';
SELECT
  sales,
  name,
  usprice
FROM usproduct;
CREATE SELECTDEPUTY jpproduct
SELECT
  id AS id,
  (price * 15) AS jpprice
FROM product
WHERE
  price <= 7000;
SELECT
  id,
  jpprice
FROM jpproduct;
SELECT
  jpproduct -> product -> usproduct.sales,
  jpproduct -> product -> usproduct.name
FROM jpproduct
WHERE
  id = 2;
INSERT INTO product (id, name, price)
VALUES
  (6, 'huawei', 7700);
SELECT
  sales,
  name,
  usprice
FROM usproduct;
SELECT
  id,
  jpprice
FROM jpproduct;
UPDATE product
SET
  price = 4900
WHERE
  name = 'huawei';
SELECT
  sales,
  name,
  usprice
FROM usproduct;
SELECT
  id,
  jpprice
FROM jpproduct;
UPDATE product
SET
  price = 4500
WHERE
  name = 'huawei';
SELECT
  sales,
  name,
  usprice
FROM usproduct;
SELECT
  id,
  jpprice
FROM jpproduct;
DELETE FROM product
WHERE
  name = 'ipad';
SELECT
  sales,
  name,
  usprice
FROM usproduct;
SELECT
  id,
  jpprice
FROM jpproduct;
DROP CLASS usproduct;
DROP CLASS product;