import java.io.*;

public class FileIO {
    public static void main(String[] args) throws Exception {

        // File StdInfo = new File("Student_Info.txt");
        // StdInfo.createNewFile();

        // FileWriter StdInfo = new FileWriter("Student_Info.txt");
        // BufferedWriter bw = new BufferedWriter(StdInfo);
        // bw.write("This is Student 2 Info.");
        // bw.close();

        FileReader fr = new FileReader("Student_Info.txt");
        BufferedReader br = new BufferedReader(fr);

        // System.out.println(br.readLine());
        // String s1 = br.readLine().toString();

        File f2 = new File("Copy_Student_Info.txt");
        f2.createNewFile();

        FileWriter fw2 = new FileWriter("Copy_Student_Info.txt");
        BufferedWriter bw2 = new BufferedWriter(fw2);

        String line;
        while ((line = br.readLine()) != null) {
            bw2.write(line);
            bw2.newLine();
        }

        br.close();
        bw2.close();
    }
}
