package ExceptDemo;

public class MyExcept extends Exception {
    private int detail;

    public MyExcept(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyExcept{" +
                "detail=" + detail +
                '}';
    }
}
