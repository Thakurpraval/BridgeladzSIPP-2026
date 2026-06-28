class Notification {

    String recipientName;
    String message;

    Notification(String recipientName, String message) {

        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {

        System.out.println("Notification Sent");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {

        super(recipientName, message);
    }

    @Override
    void sendNotification() {

        System.out.println("Email sent to "
                + recipientName);

        System.out.println("Message : " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {

        super(recipientName, message);
    }

    @Override
    void sendNotification() {

        System.out.println("SMS sent to "
                + recipientName);

        System.out.println("Message : " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String recipientName,
                     String message) {

        super(recipientName, message);
    }

    @Override
    void sendNotification() {

        System.out.println("Push Notification to "
                + recipientName);

        System.out.println("Message : " + message);
    }
}

public class SmartNotification {

    public static void main(String[] args) {

        Notification[] notifications = {

                new EmailNotification(
                        "Rahul",
                        "Welcome Email"),

                new SMSNotification(
                        "Amit",
                        "OTP : 123456"),

                new PushNotification(
                        "Priya",
                        "Sale Starts Today")
        };

        for (Notification n : notifications) {

            n.sendNotification();

            System.out.println();
        }
    }
}