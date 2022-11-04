public class CollegePerson {
    public String name;
    public String surname;
    public int collegeId;

    public CollegePerson(String name, String surname, int collegeId){
        this.name =name;
        this.surname=surname;
        this.collegeId=collegeId;
    }

    public void goToCollege(){
        System.out.println("name: " + this.name + "\nsurname: " + this.surname + "\ncollegeId: " + this.collegeId );
    }


}
