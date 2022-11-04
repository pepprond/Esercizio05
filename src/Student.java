public class Student extends CollegePerson implements ILearningPerson {

    public int academicYear;

    public Student(String name, String surname, int collegeId, int academicYear){
        super(name, surname, collegeId);
        this.academicYear=academicYear;
    }

    @Override
    public void StudyAtHome() {
        System.out.println(this.name + " " + this.surname + " study at home!");
    }
}
