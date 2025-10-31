public class controller extends exception {
    String firstName, lastName,Section,Strand,age,gender;
    int studentID;
    int fistQuarter,SecondQuarter,thirdQuarter,forthQuarter,average;
    boolean status;


    controller(String first,String last,String sec,String strnd,
               String ag,String gend,int studID,
               int firstQ,int secondQ,int thirdQ,
               int forthQ,int avg,boolean stat){
        this.firstName = first;
        this.lastName = last;
        this.Section = sec;
        this.Strand = strnd;
        this.age = ag;
        this.gender = gend;
        this.studentID = studID;
        this.fistQuarter = firstQ;
        this.SecondQuarter = secondQ;
        this.thirdQuarter = thirdQ;
        this.forthQuarter = forthQ;
        this.average = avg;
        this.status = stat;
    }

}
