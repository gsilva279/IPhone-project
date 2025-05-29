public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println();
        //Reprodutor musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println();
        //Telefone
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();
        //Navegador
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaPagina();
    }
    
}
