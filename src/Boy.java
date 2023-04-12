public class Boy extends Person{
    protected String name;
    protected  int age;
    protected String sex;

    public String getSex(){
        return sex;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
