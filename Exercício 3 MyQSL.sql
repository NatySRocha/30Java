CRIAR  BANCO  DE DADOS db_farmacia_do_bem ;
USE db_farmacia_do_bem;

CRIAR  TABELA  tb_categoria (
    id int AUTO_INCREMENT,
    tipo VARCHAR ( 25 ) NÃO NULO ,
    prescricao BOOLEANO  NÃO NULO ,
    CHAVE PRIMÁRIA (id)
) MOTOR = INNODB;

CRIAR  TABELA  tb_produto (
    id int AUTO_INCREMENT,
    valor decimal ( 10 , 2 ) NÃO NULO ,
    nome VARCHAR ( 20 ) NÃO NULO ,
    id_categoria int  NOT NULL ,
    estoque int  NÃO NULO ,
    CHAVE PRIMÁRIA (id),
    CHAVE ESTRANGEIRA (id_categoria) REFERÊNCIAS tb_categoria (id)
) MOTOR = INNODB;

INSERT INTO tb_categoria (tipo, prescricao)
    VALORES ( " TARJA PRETA " , verdadeiro), ( " TARJA VERMELHA " , verdadeiro), ( " TARJA AMARELA " , falso), ( " TARJA VERMELHA " , verdadeiro),
    ( " COMESTICOS " , falso);

INSERT INTO tb_produto (valor, nome, id_categoria, estoque)
    VALORES ( 120 . 00 , " Fluoxetina " , 1 , 50 ), ( 75 . 00 , " mupirocina " , 2 , 50 ), ( 70 , " antialérgico " , 3 , 50 ), ( 75 . 00 , " Respiridona " , 4 , 50 ),
    ( 5 . 00 , " Desodorante " , 5 , 50 ), ( 100 . 00 , " Colecaciferol " , 4 , 50 ), ( 90 . 00 , " Kit para Cabelo " , 5 , 50 ), ( 234 . 00 , " Escitalopram " , 1 , 50 );

SELECT  *  FROM tb_produto
    ONDE valor >  50 ;

SELECT  *  FROM tb_produto
    ONDE valor entre 3  E  60 ;

SELECT  *  FROM tb_produto
    ONDE nome LIKE  " % b% " ;

SELECT  *  FROM tb_produto
    INNER JOIN tb_categoria
        ON  tb_produto . id_categoria  =  tb_categoria . id ;

SELECT  *  FROM tb_produto
    INNER JOIN tb_categoria
        ON  tb_produto . id_categoria  =  tb_categoria . eu ia
            ONDE  tb_produto . id_categoria  =  5 ;