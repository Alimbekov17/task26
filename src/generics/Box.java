package generics;

public class Box<T> {
    private T e;

    public Box(T e) {
        this.e = e;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Box{" +
                "e=" + e +
                '}';
    }

    public static <T1> Box<T1> getBox(Box<T1> box) {
        return box;
    }
}
