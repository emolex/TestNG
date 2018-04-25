package test1;

public class MessageUtil {

    private String messg;

    public MessageUtil(String messg) {
        this.messg = messg;}

        public String printMessage () {
            System.out.println(messg);
            return messg;
        }
}
