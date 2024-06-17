import java.nio.file.Files;
import java.nio.file.Path;
public class Blob {
  public static void main(String[] args) {
    try{
      String str = Files.readString(Path.of("./Qlock.java"));
      for(char c: str.toCharArray()) {
        if (c == 63) {
          for(char x: str.toCharArray()) {
            switch(x) {
              case 10: System.out.printf("\n"); break;
              case '\\': System.out.printf("\\\\"); break;
              case 34: System.out.printf("\\\""); break;
              default: System.out.print(x);
            }
          }

        } else {
          System.out.print(c);
        }
      }
    } catch (Exception e) {
    }
  }
}
