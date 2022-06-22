public class Test {
    public static void main(String[] args) {
        Redactor redactor = new Text(new Windows());
        Redactor redactor1 = new Graphics(new Windows());
        Redactor redactor2 = new Text(new Linux());
        Redactor redactor3 = new Graphics(new Linux());

        redactor.showInfo();
        redactor1.showInfo();
        redactor2.showInfo();
        redactor3.showInfo();
    }
}