package shop;

//Создаем перечисление содержащее значения для операций

//Просмотр списка каталогов товаров.
//Просмотр списка товаров определенного каталога.
//Выбор товара в корзину.
//Покупка товаров, находящихся в корзине

import java.util.Scanner;

public enum Action {

    AUTHENTIFICATION {
        //Аутентификация пользователя. Пользователь вводит логин и пароль с клавиатуры.
        @Override
        public void authentification(User user) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ваш логин ");
            String inputUser = scanner.nextLine();
            while (!(inputUser.equals(user.getLogin()))) {
                System.out.println("Вы ввели неверный логин, попробуйте ещё ");
                inputUser = scanner.nextLine();
            }
            System.out.println("Привет " + user.getLogin() + " введите пароль");

            String inputPassword = scanner.nextLine();
            while (!(inputPassword.equals(user.getPassword()))) {
                System.out.println("Вы ввели неверный пароль, попробуйте ещё ");
                inputPassword = scanner.nextLine();
            }
            System.out.println("deshko86 ваш пароль " + inputPassword.charAt(1) + "****** " + "ПРИНЯТ");
            System.out.println();
        }
    },
    CATEGORYLIST {
        //Просмотр списка каталогов товаров.
        @Override
        public void categoryList(Category[] categorys) {
            System.out.println("В каталоге товаров есть такие категории ");
            System.out.println("----------------------------------------");
            for (Category category : categorys) {
                System.out.print(category.getName() + " | ");
            }
            System.out.println();
            System.out.println("----------------------------------------");
        }
    },
    PHONELIST {
        @Override
        public void productList(Product[] products) {
            System.out.println("В категории ТЕЛЕФОНЫ у нас ");
            for (Product product : products) {
                if (product instanceof Phone) {
                    System.out.print(product.getName() + "  по цене " + product.getCost() + " грн" + " | ");
                }
            }
            System.out.println();
            System.out.println("----------------------------------------");
        }
    },
    PCLIST {
        @Override
        public void productList(Product[] products) {
            System.out.println("В категории Компьютеры у нас ");
            for (Product product : products) {
                if (product instanceof Pc) {
                    System.out.print(product.getName() + "  по цене " + product.getCost() + " грн" + " | ");
                }
            }
            System.out.println();
            System.out.println("----------------------------------------");
        }
    },
    TVLIST {
        @Override
        public void productList(Product[] products) {
            System.out.println("В категории Телевизоры у нас ");
            for (Product product : products) {
                if (product instanceof Tv) {
                    System.out.print(product.getName() + "  по цене " + product.getCost() + " грн" + " | ");
                }
            }
            System.out.println();
            System.out.println("----------------------------------------");
        }
    },
    PRODUCTBASKET {
        @Override
        public void productList(Product[] products) {
            System.out.println("В вашей корзине сейчас  " + products.length + " товаров ");
            for (Product product : products) {
                System.out.print(product.getName() + "  по цене " + product.getCost() + " грн" + " | ");
            }
            System.out.println();
            System.out.println("----------------------------------------");
        }
    };

    public void authentification(User user) {
    }

    public void categoryList(Category[] categorys) {
    }

    public void productList(Product[] products) {
    }
}



