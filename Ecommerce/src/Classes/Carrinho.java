package  Classes ;

import com.sun.tools.classfile.InnerClasses_attribute.Info;

public  class  Carrinho   Produto {
    // ATRIBUTOS
    private  String auxiliarCod;
    private  int valorTotal;
    private  int auxiliarEstoque;

    // METODOS
    public  Carrinho ( String  produto , int  estoque , String  codigo , double  valor , String  auxiliarCod , int  auxiliarEstoque , int  valorTotal ) {
        super ();
        isso. auxiliarCod = auxiliarCod;
        Info.auxiliarEstoque = auxiliarEstoque;
        isso.valorTotal = valorTotal;
    }
    // ENCAPSULAMENTO
    public  String  getAuxiliarCod () {
        return auxiliarCod;
    }

    public  void  setAuxiliarCod ( String  auxiliarCod ) {
        isso . auxiliarCod = auxiliarCod;
    }

    public  int  getValorTotal () {
        return valorTotal;
    }

    public  void  setValorTotal ( int  valorTotal ) {
        isso . valorTotal = valorTotal;
    }

    public  int  getAuxiliarEstoque () {
        return auxiliarEstoque;
    }

    public  void  setAuxiliarEstoque ( int  auxiliarEstoque ) {
        isso . auxiliarEstoque = auxiliarEstoque;
    }
    public  void  modificarEstoque ( int  qntd ) {
        if (qntd < auxiliarEstoque) {
            Sistema . para fora . println ( " Estourou o estoque! Impossível de realizar !! " );
        } else {
            isso . auxiliarEstoque + = qntd;
        }
    }
}
