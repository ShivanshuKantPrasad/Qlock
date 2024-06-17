import java.time.LocalTime; public class Qlock { static int x = 0; static int y = 0;
static int i = 0; static int dx = 0; static int[] d = new int[8]; static final int[] f
= {31599,19812,14479,31207,23524,29411,29679,30866,31727,31719,1040}; static void
p(char c) { i = x / 2 / (3 + 2); dx = x / 2 % (3 + 2); if ( i < 8 && (y - 4)/2 < 5
&& dx < 3 && ((f[d[i]]>>((5 - (y - 4)/2  - 1) * 3 + dx))&1) != 0) System.out.printf
("\033[1;42;30m%c\033[0m", c); else System.out.print(c); if (c == 10) { y += 1; x = 0;
} else x += 1; } static void gd() { LocalTime now = java.time.LocalTime.now(); d[0] =
now.getHour() / 10; d[1] = now.getHour() % 10; d[2] = 10; d[3] = now.getMinute() / 10;
d[4] = now.getMinute() % 10; d[5] = 10; d[6] = now.getSecond() / 10; d[7] = now.getSecond()
% 10; } public static void main(String[] args) { while(true){ gd(); x = 0; y = 0; for (char c : src.toCharArray()) {
switch (c) { case 63: for (char x: src.toCharArray()){ switch(x) {
case 34: p('\\'); p((char)34); break; case '\\': p('\\'); p('\\'); break; default: p(x);
} } break; default: p(c); break; } } System.out.printf("\n\033[%dA\033[%dD", y + 1, x);
try { Thread.sleep(1000); } catch (Exception e) { }; gd(); } }
static final String src = """
import java.time.LocalTime; public class Qlock { static int x = 0; static int y = 0;
static int i = 0; static int dx = 0; static int[] d = new int[8]; static final int[] f
= {31599,19812,14479,31207,23524,29411,29679,30866,31727,31719,1040}; static void
p(char c) { i = x / 2 / (3 + 2); dx = x / 2 % (3 + 2); if ( i < 8 && (y - 4)/2 < 5
&& dx < 3 && ((f[d[i]]>>((5 - (y - 4)/2  - 1) * 3 + dx))&1) != 0) System.out.printf
(\"\\033[1;42;30m%c\\033[0m\", c); else System.out.print(c); if (c == 10) { y += 1; x = 0;
} else x += 1; } static void gd() { LocalTime now = java.time.LocalTime.now(); d[0] =
now.getHour() / 10; d[1] = now.getHour() % 10; d[2] = 10; d[3] = now.getMinute() / 10;
d[4] = now.getMinute() % 10; d[5] = 10; d[6] = now.getSecond() / 10; d[7] = now.getSecond()
% 10; } public static void main(String[] args) { while(true){ gd(); x = 0; y = 0; for (char c : src.toCharArray()) {
switch (c) { case 63: for (char x: src.toCharArray()){ switch(x) {
case 34: p('\\\\'); p((char)34); break; case '\\\\': p('\\\\'); p('\\\\'); break; default: p(x);
} } break; default: p(c); break; } } System.out.printf(\"\\n\\033[%dA\\033[%dD\", y + 1, x);
try { Thread.sleep(1000); } catch (Exception e) { }; gd(); } }
static final String src = \"\"\"
?\"\"\"; }
"""; }
