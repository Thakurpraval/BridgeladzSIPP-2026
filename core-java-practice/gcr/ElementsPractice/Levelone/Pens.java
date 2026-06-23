class Pens {
    public static void main(String[] args) {
        int pens = 14, students = 3;

        int each = pens / students;
        int rem = pens % students;

        System.out.println("The Pen Per Student is " + each +
                " and the remaining pen not distributed is " + rem);
    }
}