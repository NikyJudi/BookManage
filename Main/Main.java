package Main;

import book.BookList;
import usr.ManagerUser;
import usr.NormalUser;
import usr.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        System.out.println(bookList);
        User user = login();
        while (true) {
            user.doOperation(user.menu(), bookList);
        }
    }
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        String name = scanner.next();
        System.out.println("请输入您的id:");
        String id = scanner.next();
        System.out.println("请输入您的角色:(1 普通用户 2 管理员)");
        int role = scanner.nextInt();
        if (role == 1) {
            return new NormalUser(name, id);
        }
        return new ManagerUser(name, id);
    }
}
