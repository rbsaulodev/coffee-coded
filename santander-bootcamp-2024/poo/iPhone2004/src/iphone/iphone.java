package iphone;

import functionalities.MusicPlayer;
import functionalities.Phone;
import functionalities.WebBrowser;

public class iphone implements MusicPlayer, WebBrowser, Phone {
    public String name;
    private int id;
    public String model;

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) { 
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String modelo) {
        this.model = modelo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Metodos - Phone
    @Override
    public void call(String contact) {
        System.out.println("Ligando para: "+contact);
    }

    @Override
    public void answerCall(String contact) {
        System.err.println("Atendendo a ligação de: "+contact);
    }

    @Override
    public void startVoicelEmail() {
        System.err.println("Iniciando correio de voz!");;
    }

    //Metodos - WebBrowser
    @Override
    public void goToURL(String URL) {
        System.err.println("Indo para a URL: "+URL);
    }

    @Override
    public void updatePage() {
        System.err.println("Pagina atualizada");
    }

    @Override
    public void addPage(String page) {
        System.err.println("Pagina "+page+" adicionada");
    }

    // Metodos - MusicPlayer
    @Override
    public void playMusic(String Music) {
        System.err.println("Tocando: "+Music);
    }

    @Override
    public void pauseMusic() {
        System.err.println("Musica pausada!");
    }

    @Override
    public void selectMusic(String Music) {
        System.err.println("Musica "+Music+" selecionada!");
    }
}