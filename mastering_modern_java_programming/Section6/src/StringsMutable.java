import java.io.CharArrayWriter;
import java.io.IOException;

public class StringsMutable {
    public static void main(String[] args) throws IOException {
        StringBuilder baniFullName = new StringBuilder("burhaudin");
        baniFullName.append(" rabbani");
        System.out.println(baniFullName.toString());

        StringBuffer nicoFullName = new StringBuffer("nico");
        nicoFullName.append(" setiawan");
        System.out.println(nicoFullName);

        CharArrayWriter messiFullName = new CharArrayWriter();
        messiFullName.write("lionel");
        messiFullName.write(" messi");
        String messi = messiFullName.toString();
        System.out.println(messi);
    }
}
