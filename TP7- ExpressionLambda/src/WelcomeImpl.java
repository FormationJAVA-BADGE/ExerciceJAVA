public class WelcomeImpl implements IWelcome{

    @Override
    public void sayHello(String nom) {
        System.out.println("bonjour "+nom);
    }
}
