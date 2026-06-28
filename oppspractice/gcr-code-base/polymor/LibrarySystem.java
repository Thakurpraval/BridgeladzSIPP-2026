class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName,
                  String memberId) {

        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {

        return 0;
    }

    void display() {

        System.out.println("Name : "
                + memberName);

        System.out.println("ID : "
                + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String name,
                  String id) {

        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {

        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String name,
                  String id) {

        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {

        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String name,
                String id) {

        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {

        return overdueDays * 5;
    }
}

public class LibrarySystem {

    public static void main(String[] args) {

        LibraryMember[] members = {

                new StudentMember("Rahul", "S101"),
                new FacultyMember("Amit", "F201"),
                new GuestMember("Priya", "G301")
        };

        int overdueDays = 4;

        for (LibraryMember m : members) {

            m.display();

            System.out.println("Fine = ₹"
                    + m.calculateFine(overdueDays));

            System.out.println();
        }

        String searchId = "F201";

        System.out.println("Searching ID : "
                + searchId);

        for (LibraryMember m : members) {

            if (m.memberId.equals(searchId)) {

                System.out.println("Member Found");

                m.display();
            }
        }
    }
}