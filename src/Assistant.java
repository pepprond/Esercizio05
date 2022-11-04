public class Assistant extends CollegePerson implements ILearningPerson,ITeachingPerson{
    public boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD){
        super(name,surname,collegeId);
        this.isGoingToBeAPhD=isGoingToBeAPhD;


    }


    @Override
    public void StudyAtHome() {
        System.out.println("the assistant " + this.name + " " + this.surname + " study");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("the assistant " + this.name + " " + this.surname + " teaches");
    }
}
