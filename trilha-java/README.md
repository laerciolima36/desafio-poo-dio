# desafio-poo-dio
Desafio Implementado para o BootCamp da DIO

```mermaid 

  classDiagram
    class Iphone {
        + tocar()
        + pausar()
        + selecionarMusica(musica: String)
        + ligar(numero: String)
        + atender()
        + iniciarCorreioVoz()
        + exibirPagina(url: String)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    class ReprodutorMusical {
        + tocar()
        + pausar()
        + selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        + ligar(numero: String)
        + atender()
        + iniciarCorreioVoz()
    }

    class NavegadorInternet {
        + exibirPagina(url: String)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    Iphone --|> ReprodutorMusical
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegadorInternet
