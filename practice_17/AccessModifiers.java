package practice_17;

public class AccessModifiers {
    public static void main(String[] args)
    {
        //creating object of publicModifiers class.
        publicModifiers public_obj = new publicModifiers();

        public_obj.name = "Dipendra";
        System.out.println("Name:- "   + public_obj.name);

        //creating object for privateModifiers class.
        privateModifiers private_obj = new privateModifiers();

        private_obj.setName("Dipen");  //private member lai access garda we can only access it by creating member function
                                       // of that class called as getter and setter in Java.
        System.out.println("Name:- " + private_obj.getName());

    }

}
