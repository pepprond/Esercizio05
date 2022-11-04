public class Professor extends CollegePerson implements  ITeachingPerson{
    public String teachingSubject;

    public Professor(String name, String surname, int collegeId, String teachingSubject){
        super(name,surname,collegeId);
        this.teachingSubject=teachingSubject;

    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(this.name + " " + this.surname + " teaches");
    }
}
