//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Expression Lambda
        IWelcome welcome =  (nom)->
                System.out.println("hello "+nom);

        IWelcome welcome2 =new WelcomeImpl();

        //Classes anonymes
        // (A remplacer par une expression lambda)
        IWelcome welcome3=new IWelcome() {
            @Override
            public void sayHello(String nom) {
                System.out.println("Hola "+nom);
            }
        };

       welcome.sayHello("peter");
       welcome2.sayHello("Marie");
       welcome3.sayHello("Paul");
    }
}