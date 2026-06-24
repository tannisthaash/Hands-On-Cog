package DecoratorPatternExample;

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        System.out.println("Email Notification:");
        emailNotifier.send("System Update Available");

        System.out.println();
        Notifier multiNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        System.out.println("Email + SMS + Slack Notification:");
        multiNotifier.send("Server Down!");
    }
}