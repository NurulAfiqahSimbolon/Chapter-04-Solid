//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {Cow cow = new Cow();
        // Inversion of Control: Implementasi konkret disediakan oleh klien atau framework
        MessageService emailService = new EmailService();
        User user = new User(emailService);
        user.sendMessage("Hello, Dependency Inversion!");
    }
}