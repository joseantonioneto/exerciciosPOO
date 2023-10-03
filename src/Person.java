import javax.sound.midi.Soundbank;
public class Person {
    String firstname;
    String lastname;
    int age;
    String address;
    String phoneNumber;
    String email;
    public Person (String firstname, String lastname,int age, String address,String phoneNumber,String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email= email;
    }
    public void speak(String message){
        System.out.println(firstname+ " says: "+message);
    }
    public void walk(int distanceInMeters){
        System.out.println(firstname+" is walking "+ distanceInMeters+ " meters.");
    }
    public int increaseAgeByYears(int yearsToAdd){
        this.age = yearsToAdd+this.age;
        return age;
    }
    public void eat(String food){
        System.out.println(firstname+" is eating "+food);
    }
    public void displayInfo(){
        System.out.println("First Name: "+firstname);
        System.out.println("Last Name: "+lastname);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Phone Number "+phoneNumber);
        System.out.println("Email: "+email);

    }
}
//Crie um método na classe Person chamado displayInfo que imprima no console
//todas as informações da pessoa, exatamente como no exemplo abaixo:
//First Name: Paulo
//Last Name: Silva
//Age: 20
//Address: Avenue 5
//Phone Number: 88-99999999
//Email: paulo@gmail.com