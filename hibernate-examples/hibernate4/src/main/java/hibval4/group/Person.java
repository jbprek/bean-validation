package hibval4.group;

import javax.validation.constraints.NotNull;

/**
 * Created by prekezes on 6/5/2014.
 */
public class Person {
    @NotNull
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
