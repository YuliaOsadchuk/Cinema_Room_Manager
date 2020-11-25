class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }

    /*public static void main(String[] args) {
        System.out.println(new Time(0, 1, 2).toString());
        System.out.println(new Time(3, 4, 5).toString());
        System.out.println(new Time(6, 7, 8).toString());
        System.out.println(new Time(9, 10, 11).toString());
    }*/
}