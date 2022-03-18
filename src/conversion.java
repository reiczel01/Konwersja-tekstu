
// zczytywanie za pomocą BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class conversion {
    public static void main(String[] args)
            throws IOException
    {
        boolean flg = false;
        while(!flg) {
            // wczytywanie przekazanego stringa do buforu
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // zczytywanie przekazanego stringa używając readLine
            String name = reader.readLine();

            int index_val2 = (name.length() - 1);
            int index_val1 = (name.length() - 3);

            int val1 = Character.getNumericValue(name.charAt(index_val1));
            int val2 = Character.getNumericValue(name.charAt(index_val2));

            Boolean flag_val1 = Character.isDigit(name.charAt(index_val1));
            Boolean flag_val2 = Character.isDigit(name.charAt(index_val2));

            if (!flag_val2 || !flag_val1)
            {
                System.out.println("Wprowadznon nieprawidłowe znaki");
            }
            else {
                // Wyświetlanie wyniku działania
                System.out.println(name.substring(val1, val2));
                flg = true;
            }
        }
    }
}
