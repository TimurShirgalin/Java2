package Lesson3.Ex2;

import java.util.Objects;

public class Data {
    private String name;
    private String phoneNum;

    public Data(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Фамилия - " + name + ", Номер телефона - " + phoneNum;
    }

    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }

        Data data = (Data) obj;

        if (!phoneNum.equals(data.phoneNum)) {
            return false;
        }
        return Objects.equals(name, data.name);
    }
}
