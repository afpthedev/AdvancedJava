package Generic;

public class Test<T>{
    T nesne;

    public T getNesne() {
        return nesne;
    }

    public void setNesne(T nesne) {
        this.nesne = nesne;
    }

    public Test(T nesne) {
        this.nesne = nesne;
    }
}
