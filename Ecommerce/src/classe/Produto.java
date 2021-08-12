package  Classe ;


public  class  Produto {
    // ATRIBUTOS
    protegido  String produto;
    protegido  int Estoque;
@@ -9,12 +9,7 @@

    // METODOS

    public  ClasseMae ( String  produto , String  codigo ) {
        isso . produto = produto;
        isso . codigo = codigo;
    }

    public  ClasseMae ( String  produto , int  estoque , String  codigo , double  valor ) {
     Produto público ( String  produto , int  estoque , String  codigo , valor duplo  ) {
        super ();
        isso . produto = produto;
        isso . estoque = estoque;
@@ -35,11 +30,11 @@ public void setProduto (String produto) {
    public  int  getEstoque () {
        retorno estoque;
    }
    / *
    public void setEstoque (Celulares estoque ) {

    public  void  setEstoque ( String produto ) { 
        isso . estoque = estoque;
    }
    * /

    public  String  getCodigo () {
        return codigo;
    }
@@ -70,4 +65,5 @@ public void RetiraEstoque (int quantidade) {
        }
    }


}
