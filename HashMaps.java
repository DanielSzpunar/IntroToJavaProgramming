import java.util.HashMap;

public class HashMaps{
  public static void main(String[] args) {
    HashMap<String, String> nicknames = new HashMap<String, String>();
    nicknames.put("matti", "mage");
	  nicknames.put("mikael", "mixu");
	  nicknames.put("arto", "arrpa");
		System.out.println(nicknames.get("mikael"));
  }
}
