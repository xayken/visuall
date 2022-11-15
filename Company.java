import javax.swing.*;
import java.util.ArrayList;

public class Company {


    ArrayList<Customer> customers = new ArrayList<Customer>();


    public void createCustomer(){

        Customer cst = new Customer();
        cst.name = "Emre";
        cst.surname ="Oktem";
        cst.customerID = 1;
        cst.email = "abisikinqisi29@otmail.com";
        Product product = new Product(1, 2, "malemre");
        Order order = new Order(1);
        order.products.add(product);
        cst.order = order;
        customers.add(cst);

    }

    public void showProduct(){

        String output = " ";

        for(Customer c : customers){

            for (Product p: c.order.products) {
                output+= p.title;
            }

        }

        JOptionPane.showMessageDialog(null, output);

    }

    public void showCustomers(){

        String output = " ";

        for (Customer c: customers) {

            output+= c.name+" "+ c.surname+"\n";




        }

        JOptionPane.showMessageDialog(null, output);



    }

    public void showCustomer(int customerID){

        String output = " ";

        for(Customer c: customers){

            if(c.customerID == customerID){
                output += c.name+" "+
                           c.customerID+" "+
                            c.email+" "+
                            c.surname+" ";
            }

        }

        JOptionPane.showMessageDialog(null, output);

    }


    public static void main(String[] args) {


        Company oktem = new Company();
        oktem.createCustomer();
        //oktem.showCustomer(1);
        oktem.showProduct();



    }

}
