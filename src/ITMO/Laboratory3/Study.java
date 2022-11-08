package ITMO.Laboratory3;

class Study {
    private String course;
    Study (String course) {
        this.course = course;
    }
    public String printCourse() {
        return  this.course;
    }
}

class JavaProgramm {
    public static void main(String[] args) {
        //String course = "Изучение Java - это просто!";
        Study study1 = new Study("Изучение Java - это проSSSSSSSто!");
        System.out.println(study1.printCourse());
    }
}
