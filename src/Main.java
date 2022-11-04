public class Main {
    public static void main(String[] args) {
        Student stud = new Student("giuseppe","rondelli",1837,2022);
        Professor prof = new Professor("mauro","lanini",1312,"java");
        Assistant ass = new Assistant("valerio", "mauro", 1044,false);

        stud.goToCollege();
        prof.goToCollege();
        ass.goToCollege();

        stud.StudyAtHome();
        prof.teachToOtherPeople();
        ass.StudyAtHome();
        ass.teachToOtherPeople();

    }

}