public class App {
    public static void main(String[] args) {
        Iphone primeiroIphone = new Iphone();
        primeiroIphone.adicionarNovaAba();
        primeiroIphone.exibirPagina("web.dio.me");
        primeiroIphone.atualizarPagina();

        primeiroIphone.selecionarMusica("Scar Tissue");
        primeiroIphone.tocar();
        primeiroIphone.pausar();

        primeiroIphone.ligar("88008800");
        primeiroIphone.iniciarCorreioVoz();
        primeiroIphone.atender();
    }
}
