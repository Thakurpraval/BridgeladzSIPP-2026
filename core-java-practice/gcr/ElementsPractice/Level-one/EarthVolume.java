class EarthVolume {
    public static void main(String[] args) {
        double r = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * r * r * r;
        double volumeMiles = volumeKm / (1.6 * 1.6 * 1.6);

        System.out.println("The volume of earth in cubic kilometers is "
                + volumeKm +
                " and cubic miles is " + volumeMiles);
    }
}