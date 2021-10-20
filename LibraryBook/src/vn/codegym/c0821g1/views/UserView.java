package vn.codegym.c0821g1.views;

import vn.codegym.c0821g1.model.User;
import vn.codegym.c0821g1.services.IUserService;
import vn.codegym.c0821g1.services.UserService;

import java.util.Scanner;

public class UserView {
    private IUserService userService;
    private Scanner scanner;

    public UserView() {
        scanner = new Scanner(System.in);
        userService = new UserService();
    }

    public void addUser() {
        System.out.print("So CCCD:");
        long id = scanner.nextLong();
        System.out.print("Ho va Ten:");
        String fullName = scanner.next();
        System.out.print("Nam Sinh:");
        int birthDay = scanner.nextInt();
        System.out.print("So dien thoai:");
        String phoneNumber = scanner.next();
        System.out.print("Dia Chi:");
        String address = scanner.next();
        User user = new User(id, fullName, birthDay, phoneNumber, address);

        try {
            userService.addUser(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void showUsers() {
        System.out.println("Users Ca Dong");

    }
}
