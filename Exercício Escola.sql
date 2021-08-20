criar  banco de dados  db_escola1 ;

use db_escola1;

criar  tabela  tb_estudantes (
	id bigint ( 10 ) auto_increment,
    nome varchar ( 20 ) não nulo ,
    série varchar ( 20 ) não nula ,
    idade bigint ( 20 ) não nula ,
    nota bigint ( 10 ),
    chave primária (id)    
);

inserir em tb_estudantes (nome, serie, idade, nota) valores ( " Carlos " , " Sétima série " , " 12 " , " 10 " );
inserir em tb_estudantes (nome, serie, idade, nota) valores ( " Monica " , " Quarta série " , " 9 " , " 8 " );
inserir em tb_estudantes (nome, serie, idade, nota) valores ( " Felipe " , " Sétima série " , " 12 " , " 5 " );
inserir em tb_estudantes (nome, serie, idade, nota) valores ( " Marcia " , " Segunda série " , " 7 " , " 10 " );
inserir em tb_estudantes (nome, serie, idade, nota) valores ( " Claudia " , " Sétima série " , " 12 " , " 4 " );
inserir em tb_estudantes (nome, serie, idade, nota) valores ( " Marcos " , " Sétima série " , " 12 " , " 9 " );
inserir em tb_estudantes (nome, serie, idade, nota) valores ( " Luiz " , " Sétima série " , " 12 " , " 6 " );
inserir em tb_estudantes (nome, serie, idade, nota) valores ( " Vinicius " , " Sétima série " , " 12 " , " 10 " );


selecione  *  de tb_estudantes onde nota >  7 ;
selecione  *  de tb_estudantes onde nota <  7 ;


atualizar tb_estudantes set nota =  9  onde id =  1 ;