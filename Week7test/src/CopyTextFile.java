import java.io.*;
public class CopyTextFile {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("File1.txt");
        BufferedReader br = new BufferedReader(in);

        FileWriter out = new FileWriter("File2.txt", true);
        BufferedReader bw = new BufferedReader(out);
        String line = br.readLine();
        while (line != null){
            bw.write(line);
            bw.newLine ();
            line = br.readline();}

        }
        in.close();
        br.close();
        bw.close();
        out.close();
    }}
