import java.util.Base64;

public class LineManWongnai {
    public static void main(String args[]) {
      String secret = "aWFuZ25vVzpOQU06RU5JTDp0YTpzdTpuaW9K";
      byte[] decodedBytes = Base64.getDecoder().decode(secret);
      String decodedString = new String(decodedBytes);
      System.out.println("Result = " + decodedString);
    }
}