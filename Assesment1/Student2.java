class Student2 {
    private String first_name ;
    private String last_name ;
    private int class_year ;
    private String major;

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setClass_year(int class_year) {
        this.class_year = class_year;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getMajor() {
        return major;
    }
    public int getClass_year() {
        return class_year;
    }


    public static void main(String[] args) {
       
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        s1.setFirst_name("Divya");
        s1.setLast_name("Vaishnavi");
        s1.setMajor("CSE");
        s1.setClass_year(2020);

        s2.setFirst_name("vanita");
        s2.setLast_name("rutu");
        s2.setMajor("civil");
        s2.setClass_year(2022);

        System.out.println(s1.getFirst_name());
        System.out.println(s1.getLast_name());
        System.out.println(s1.getMajor());
        System.out.println(s1.getClass_year());

        System.out.println("\n ");
       
        System.out.println(s2.getFirst_name());
        System.out.println(s2.getLast_name());
        System.out.println(s2.getMajor());
        System.out.println(s2.getClass_year());
    }
}
