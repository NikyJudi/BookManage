package usr;
import operations.*;
import java.util.Scanner;

public class ManagerUser extends User{
    public ManagerUser(String name, String id) {
        super(name, id);
        operations = new IOperation[]{
                new Exit(),
                new Search(),
                new AddOperation(),
                new Delete(),
                new Display(),
        };
    }
    @Override
    public int menu() {
        System.out.println("============");
        System.out.println("hello " + name);
        System.out.println("1. 查找书籍");
        System.out.println("2. 增加书籍");
        System.out.println("3. 删除书籍");
        System.out.println("4. 打印所有信息");
        System.out.println("0. 退出");
        System.out.println("============");
        System.out.println("请输入您的选择: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
