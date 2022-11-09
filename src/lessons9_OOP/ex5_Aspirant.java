package lessons9_OOP;

public class ex5_Aspirant extends ex5_Students {
    private String work;

    public ex5_Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    public ex5_Aspirant(){
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    //Переопределить метод getScholarship из класса Student в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
    @Override
    public int getScholarship() {
        if (getAverageMark() == 5){
            return 200;
        } else return 180;
    }
}
