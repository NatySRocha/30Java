CREATE  DATABASE  db_pizzaria_legal ;
USE db_pizzaria_legal;

CRIAR  TABELA  tb_categoria (
    id INT AUTO_INCREMENT,
    tipo VARCHAR ( 20 ) NÃO NULO ,
    tamanho CHAR ( 1 ) NÃO NULO ,
    CHAVE PRIMÁRIA (id)
) MOTOR = INNODB;

CRIAR  TABELA  tb_pizza (
    id INT AUTO_INCREMENT,
    id_categoria INT  NOT NULL ,
    preco decimal ( 4 , 2 ) NÃO NULO ,
    mostarda BOOLEAN  NOT NULL ,
    ketchup BOOLEAN  NOT NULL ,
    CHAVE PRIMÁRIA (id),
    CHAVE ESTRANGEIRA (id_categoria)
        REFERÊNCIAS tb_categoria (id)
) MOTOR = INNODB;

INSERT INTO tb_categoria (tipo, tamanho) VALUES ( " Chocolate " , ' P ' ),
	( " Frango c / Catupiry " , ' G ' ),
	( " Calabresa " , ' M ' ),
    ( " Mussarela " , ' P ' ),
    ( " Portuguesa " , ' G ' );

INSERT INTO tb_pizza (id_categoria, preco, mostarda, ketchup) VALUES ( 1 , 30 . 50 , falso, verdadeiro),
	( 2 , 32 . 50 , verdadeiro, falso),
    ( 3 , 31 . 50 , verdadeiro,),
    ( 4 , 29 . 50 , falso, verdadeiro),
    ( 5 , 32 . 50 , verdadeiro, falso),
    ( 4 , 39 . 50 , falsa, falsas),
    ( 3 , 26 . 50 , falso, verdadeiro),
    ( 2 , 29 . 50 , verdadeiro, falso);

SELECT  *  FROM tb_pizza WHERE preco >  45 . 00 ;

SELECT  *  FROM tb_pizza WHERE preco entre 29  e  60 ;

SELECT  *  FROM tb_pizza INNER JOIN tb_categoria em  tb_pizza . id_categoria  =  tb_categoria . eu ia 
	ONDE  tb_categoria . tipo  LIKE  ' % c% ' ;

SELECT  *  FROM tb_pizza INNER JOIN tb_categoria em  tb_pizza . id_categoria  =  tb_categoria . id ;

SELECT  *  FROM tb_pizza INNER JOIN tb_categoria em  tb_pizza . id_categoria  =  tb_categoria . eu ia 
	ONDE  tb_pizza . id_categoria  =  1 ;