public class Girl extends Person{
    protected String name;
    protected int age;
    protected String sex;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getSex(){
        return sex;
    }
}
