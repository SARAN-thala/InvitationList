package personDetails;

public class Age {
    private int age;

    public Age(int age) {
        this.age = age;
    }

    boolean isOlderThan(int legalAge) {
        return this.age > legalAge;
    }

    String getAge() {
        return "" + age;
    }
}
