package be.intecbrussel.CustomerInterface;

public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Me");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Mommy");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Daddy");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Terry");
        AbstractCustomer customer5 = CustomerFactory.getCustomer("Sofia");

        AbstractCustomer customer6 = CustomerFactory.getCustomer("Jill");
        AbstractCustomer customer7 = CustomerFactory.getCustomer("Marie");
        AbstractCustomer customer8 = CustomerFactory.getCustomer("Victoire");

        System.out.println("**************Customers*************");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
        System.out.println(customer5.getName());

        System.out.println("***************Errors**************");
        System.out.println(customer6.getName());
        System.out.println(customer7.getName());
        System.out.println(customer8.getName());

    }
}
