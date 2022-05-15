package pt.ulusofona.cm.kotlin.observerobservable

  open abstract class Leitor {
 open val nome : String;
  private open val registo : Boolean = false;

      constructor(nome: String , registo : Boolean) {
          this.nome = nome
          this.registo = registo
      }

      fun leitorAdicionadoComSucesso
}

