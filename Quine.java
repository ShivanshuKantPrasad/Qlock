public class Quine {
  public static void main(String[] args) {
    String src = "public class Quine {\n  public static void main(String[] args) {\n    String src = \"?\";\n    for (char c : src.toCharArray()) {\n      switch (c) {\n        case 63:\n          for (char x: src.toCharArray()){\n            switch(x) {\n            case 10: System.out.print('\\\\'); System.out.print('n'); break;\n            case 34: System.out.print('\\\\'); System.out.print((char)34); break;\n            case '\\\\': System.out.print('\\\\'); System.out.print('\\\\'); break;\n            default: System.out.print(x);\n            }\n          }\n          break;\n        default:\n          System.out.print(c);\n          break;\n      }\n    }\n  }\n}\n";
    for (char c : src.toCharArray()) {
      switch (c) {
        case 63:
          for (char x: src.toCharArray()){
            switch(x) {
            case 10: System.out.print('\\'); System.out.print('n'); break;
            case 34: System.out.print('\\'); System.out.print((char)34); break;
            case '\\': System.out.print('\\'); System.out.print('\\'); break;
            default: System.out.print(x);
            }
          }
          break;
        default:
          System.out.print(c);
          break;
      }
    }
  }
}
