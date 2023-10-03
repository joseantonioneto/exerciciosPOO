public class main {
    public static void main(String[] args){
        //Tipo do objeto - nome do objeto - inicialização do objeto.
        Person Neto = new Person("Neto","Souza",25,"Certto Home Clube","84996985082","antonio.souzneto@gmail.com");
        Person Adri = new Person("Adri","Franca",25,"Ilha verde", "85987445820","adrizona@gmail.com");
        Neto.speak("Oiii!");
        System.out.println("Neto years old to: "+Neto.age);
        Neto.increaseAgeByYears(2);
        System.out.println("Neto years old to: "+Neto.age);
        Adri.displayInfo();
    }

}
