package be.intecbrussel.CustomerInterface;

public class CustomerFactory {

        public static final String[] arr = {"Me", "Mommy", "Daddy", "Terry", "Sofia"};

        public static AbstractCustomer getCustomer(String name){

            for (String temp : arr) {
                if (temp.equalsIgnoreCase(name)){
                    return new RealCustomer(name);
                }
            }
            return new NullCustomer();
        }
}

