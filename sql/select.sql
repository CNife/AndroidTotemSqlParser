SELECT id, name, price FROM product;
SELECT name AS name, (price / 7) AS usprice FROM product WHERE price > 5000;
SELECT sales, name, usprice FROM usproduct;
SELECT jpproduct -> product -> usproduct.sales, jpproduct -> product -> usproduct.name FROM jpproduct WHERE id = 2;