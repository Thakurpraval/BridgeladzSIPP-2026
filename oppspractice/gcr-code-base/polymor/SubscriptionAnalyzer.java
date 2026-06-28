class Subscription {

    String subscriberName;
    String subscriptionId;

    Subscription(String subscriberName,
                 String subscriptionId) {

        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    double calculateMonthlyCharge() {

        return 0;
    }
}

class BasicPlan extends Subscription {

    BasicPlan(String name, String id) {

        super(name, id);
    }

    @Override
    double calculateMonthlyCharge() {

        return 199;
    }
}

class PremiumPlan extends Subscription {

    PremiumPlan(String name, String id) {

        super(name, id);
    }

    @Override
    double calculateMonthlyCharge() {

        return 499;
    }
}

class FamilyPlan extends Subscription {

    FamilyPlan(String name, String id) {

        super(name, id);
    }

    @Override
    double calculateMonthlyCharge() {

        return 799;
    }
}

public class SubscriptionAnalyzer {

    public static void main(String[] args) {

        Subscription[] subs = {

                new BasicPlan("Rahul", "S101"),
                new PremiumPlan("Amit", "S102"),
                new FamilyPlan("Priya", "S103"),
                new PremiumPlan("Rohit", "S104")
        };

        double total = 0;

        Subscription expensive = subs[0];

        for (Subscription s : subs) {

            total += s.calculateMonthlyCharge();

            if (s.calculateMonthlyCharge() >
                    expensive.calculateMonthlyCharge())

                expensive = s;
        }

        String search = "S102";

        System.out.println("Search ID");

        for (Subscription s : subs)

            if (s.subscriptionId.equals(search))

                System.out.println(s.subscriberName);

        char letter = 'R';

        System.out.println("\nNames Starting With " + letter);

        for (Subscription s : subs)

            if (s.subscriberName.startsWith("" + letter))

                System.out.println(s.subscriberName);

        System.out.println("\nTotal Revenue = ₹" + total);

        System.out.println("Most Expensive Plan Holder : "
                + expensive.subscriberName);
    }
}