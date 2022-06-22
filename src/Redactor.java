abstract class Redactor {
    Os os;

    public Redactor(Os os) {
        this.os = os;
    }
    abstract void showType();
    void showInfo(){
        showType();
        os.setOs();
    }
}