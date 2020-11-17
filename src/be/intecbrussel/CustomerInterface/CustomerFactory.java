package be.intecbrussel.CustomerInterface;

public class CustomerFactory {

        public static final String[] arr = {"Me", "Mommy", "Daddy", "Terry", "Sofia"};

        public static AbstractCustomer getCustomer(String name){

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equalsIgnoreCase(name)){
                    return new RealCustomer(name);
                }
            }
            return new NullCustomer();
        }
}

