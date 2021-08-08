package de  programas ;

public  class  aluno {
    // atributos
    public  String nome; // público por ser para todos
    public  String matricula;
    public  boolean ativo;
    public  int nota;
    public  int anoNacimento;
    public   int anoNascimentoNovo;

    // sobrecarga - mais do mesmo
    // construtores
    // encapsulamento - seguranca - getters e setters
    // metodos
    public  void  mostraIdade () {
        Sistema . para fora . println ( " A idade é " + ( 2021  - anoNacimento));
    }
    public  void  mostraIdade ( int  anoAtual ) {
        Sistema . para fora . println ( " A idade é " + (anoAtual - anoNacimento));
    }
    public  void  mostraIdade ( int  anoAtual , int  anoNascimentoNovo ) { // quando é um atributo da classe use a palavra this
        Sistema . para fora . println ( " A idade é " + (anoNacimento - este . anoNascimentoNovo));
        if (anoNacimento ! = anoNascimentoNovo) {
            Sistema . para fora . println ( " Idade alterada ae irmao !! " );
        }
    }

   