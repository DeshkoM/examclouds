package OOP;

public class Demo_phone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("777777","Apple",20);
        Phone phone2 = new Phone("888288","Samsung");
        Phone phone3 = new Phone();

        System.out.println(phone1.getModel());
        System.out.println(phone1.getNumber());
        System.out.println(phone1.getWeight());
        System.out.println();
        System.out.println(phone2.getModel());
        System.out.println(phone2.getNumber());
        System.out.println(phone2.getWeight());
        System.out.println();
        System.out.println(phone3.getModel());
        System.out.println(phone3.getNumber());
        System.out.println(phone3.getWeight());

        phone1.receiveCall("Мама");
        phone2.receiveCall("Папа");
        //Вызываем перегруженый метод receiveCall
        phone1.receiveCall("Аня","55447862");
        //Вызываем метод sendMessage с аргументами переменной длины.
        phone1.sendMessage("Срочно перезвоните","067 522 54 74", "263 225 48 75", "095 698 55 23");
        System.out.println("Всего было создано " + Phone.count + " телефонов");
    }
}
