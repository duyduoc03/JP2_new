package Generic;

public class GenericClass2<T> implements GenericInterface<T> {

    @Override
    public void display(T value) {
        System.out.println(value);
    }
}
