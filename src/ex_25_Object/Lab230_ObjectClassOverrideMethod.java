package ex_25_Object;

public class Lab230_ObjectClassOverrideMethod {
    @Override
    public String toString() {
        System.out.println("This is coming from Object? class");
        return null;

    }

    @Override
    public int hashCode() { //
        System.out.println(" coming from the object. ");
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(" This is also coming from the object class. ");
        return true;
    }
}
