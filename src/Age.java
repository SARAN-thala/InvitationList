
public class Age {
    private int age;

    public Age(String age) {
        this.age = Integer.parseInt(age);
    }

    public boolean isLegal(String age) {
        return this.age > Integer.parseInt(age);
    }

    public int getAge() {
        return age;
    }
}
