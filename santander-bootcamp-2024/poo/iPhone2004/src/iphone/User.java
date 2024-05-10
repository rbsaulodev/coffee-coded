package iphone;

public class User {
    public static void main(String[] args) {
        
        iphone iphoneSaulo = new iphone();
        iphoneSaulo.setName("iPhone de Saulo");
        iphoneSaulo.setId(134535);
        iphoneSaulo.setModel("iPhone 15");

        System.out.println("");
        iphoneSaulo.call("Maria");
        iphoneSaulo.answerCall("Jessu");
        iphoneSaulo.startVoicelEmail();

        System.out.println("");
        iphoneSaulo.goToURL("https://web.dio.me/home");
        iphoneSaulo.updatePage();
        iphoneSaulo.addPage("https://github.com");

        System.out.println("");
        iphoneSaulo.playMusic("Pela Marginal - MC IG ");
        iphoneSaulo.selectMusic("Só Mais Um Copo - MC IG ");
        iphoneSaulo.pauseMusic();
    }
}
