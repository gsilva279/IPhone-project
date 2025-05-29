public class Iphone implements ReprodutorMusical, Telefone, Navegador{

    //Reprodutor Musical
    public void tocar(){
        System.out.println("Tocando música");
    }
    public void pausar(){
        System.out.println("Pausando a música");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando a música");
    }

    //Telefone
    public void ligar(){
        System.out.println("Ligando");
    }
    public void atender(){
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    //Navegador
    public void exibirPagina(){
        System.out.println("Exibindo a página");
    }
    public void adicionarNovaPagina(){
        System.out.println("Adicionando a página");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a página");
    }
}
