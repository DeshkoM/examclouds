package lessons9_OOP;

public class Demo_ex1_Phone {
    public static void main(String[] args) {
        ex1_Phone phone1 = new ex1_Phone("736-23-65", "Apple", 10);
        ex1_Phone phone2 = new ex1_Phone("555-66-55", "Samsung");
        ex1_Phone phone3 = new ex1_Phone();

        phone1.receiveCall("Anya");
        System.out.println(phone1.getNumber());
        System.out.println();
        phone2.receiveCall("Dasha", "06667774466");     //вызов перегруженного метода receiveCall
        phone1.sendMessage("Hello my dears", "12312313", "222211122", "3553221");


        phone3.setNumber("55445544");
        phone3.setModel("Xiaomi");
        phone3.setWeight(50);

        System.out.println(phone3.getNumber());
        System.out.print(phone3.getModel());
    }
}
