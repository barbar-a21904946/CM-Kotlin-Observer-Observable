package pt.ulusofona.cm.kotlin.observerobservable

class CorreioDaLusofona {
    val maxLeitores: Int;
  private  val listaNoticias List<Noticia>;
    private val listaOnNoticiaListener List<OnNoticiaListener>;

    constructor(maxLeitores: Int, listaNoticias: Boolean) {
        this.maxLeitores = maxLeitores
        this.listaNoticias = listaNoticias
    }


    get()
    {
        return  maxLeitores;
    }       // getter
    set(value) {         // setter
        maxLeitores = value
    }

fun adicionarLeitor(leitorAdicionar:OnNumeroListener){

}
    fun removerLeitor(leitorAdicionar:OnNumeroListener){

    }

    fun notificarLeitores(){

    }
    fun iniciar(){

    }




}