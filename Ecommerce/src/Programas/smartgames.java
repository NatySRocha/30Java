package Classes;
public class smartgames;
importar  Classes.Celulares ;
import  Classes.Produto ;
import  Classes.Jogos ;

import  java.util.ArrayList ;
import  java.util.List ;
import  java.util.Scanner ;


public  class  SmartGamer {
    public  static  void  main ( String [] args ) {
        String auxProd;
       int x =  0 ;
       pos int =  - 1 ;
       int auxProd1;


        Scanner leia =  novo  Scanner ( Sistema . In );
        Lista < Produto > lista =  novo  ArrayList <> ();
        // LISTAS A SEREM PREENCHIDAS

        lista . ADD ( novas  Celulares ( " RogPhone 3 \ t " , 10 , " G4-2 " , 0000 . 0 ));
        lista . adicionar ( novas  Celulares ( " LG K20 \ t     " , 10 , " G4-3 " , 0000 . 0 ));
        lista . adicionar ( novas  Celulares ( " Galaxy S10 \ t " , 10 , " G4-4 " , 0000 . 0 ));
        lista . adicionar ( novas  Celulares ( " Iphone X \ t   " , 10 , " G4-5 " , 0000 . 00 ));
        lista . adicionar ( nova  Jogos ( " TheWitcher \ t " , 10 , " G4-6 " , 0000 . 0 , " Galaxy 1.5 " ));
        lista . adicionar ( nova  Jogos ( " rDR2 \ t       " , 10 , " G4-7 " , 0000 . 0 , " Galaxy 1.5 " ));
        lista . adicionar ( nova  Jogos ( " GTA5 \ t       " , 10 , " G4-8 " , 0000 . 0 , " Galaxy 1.5 " ));
        lista . adicionar ( nova  Jogos ( " undertale \ t  " , 10 , " G4-9 " , 0000 . 0 , " Galaxy 1.5 " ));
        lista . adicionar ( nova  Jogos ( " inFamous \ t   " , 10 , " G4-10 " , 0000 . 0 , " Galaxy 1.5 " ));


        // MOSTRAR NA TELA O CLIENTE QUER
        Sistema . para fora . println ( " COD \ t \ t PRODUTO \ t \ t \ t VALOR \ t \ t ESTOQUE " );

        para ( PRODUTO artigo : Lista) {
            Sistema . para fora . println (item . getCodigo () + " \ t " + item . getProduto () + " \ t " + item . getValor () + " \ t \ t \ t " + item . getEstoque ());
        }
        Sistema . para fora . println ( " Digite o código do produto: " );
        auxProd = leia . próximo () . toUpperCase ();


        para (x =  0 ; x < lista . tamanho (); x ++ ) {
            if (lista . get (x) . getCodigo () . equals (auxProd)) {
                pos = x;
                pausa ;
            }
        }
        Sistema . para fora . printf ( " % s \ t % .2f \ t % d \ t % s \ n " , lista . get (pos) . getCodigo (), lista . get (pos) . getValor (), lista . get (pos) . getEstoque (), lista . get (pos) . getProduto ());
    if (pos > = 0 ) {
        Sistema . para fora . println ( " Produto selecionado: " );
        Sistema . para fora . println ( " COD \ t \ t PRODUTO \ t \ t \ t VALOR \ t \ t ESTOQUE " );
        Sistema . para fora . printf ( " % s \ t % .2f \ t % d \ t % s \ n " , lista . get (pos) . getCodigo (), lista . get (pos) . getValor (), lista . get (pos) . getEstoque (), lista . get (pos) . getEstoque ());
        Sistema . para fora . println ( " Informe a quantidade necessária: " );
        int auxQtde = leia . nextInt ();
    }
    }
}