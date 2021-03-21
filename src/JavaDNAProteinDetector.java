import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class JavaDNAProteinDetector {

    /**
     * This program determines whether there is a protein in a strand of DNA.
     *
     * @author Chris Morrison
     * @since 11
     */

    /*

    O       o O       o O       o
    | O   o | | O   o | | O   o |
    | | O | | | | O | | | | O | |
    | o   O | | o   O | | o   O |
    o       O o       O o       O

    */

    public static void main(String[] args) throws IOException {
        //initialize Scanner to collect user input
        Scanner in = new Scanner(System.in);
        FileInputStream dna;
        try {
            System.out.print("Which file would you like to read? Enter filename: ");
            String fileName = in.nextLine();
//            dna = new FileInputStream(fileName);
            //Creating an InputStream object
            InputStream inputStream = new FileInputStream(fileName);
            if (!Files.exists(Path.of(fileName))){
                throw new FileNotFoundException();
            }
            //creating an InputStreamReader object
            InputStreamReader isReader = new InputStreamReader(inputStream);
            //Creating a BufferedReader object
            BufferedReader reader = new BufferedReader(isReader);
            StringBuffer sb = new StringBuffer();
            String str;
            while ((str = reader.readLine()) != null) {
                sb.append(str);
            }
            System.out.println(sb.toString());


            String dnaSeq = new String(sb);
            System.out.println("Number of Nucleotides (length of DNA): " + dnaSeq.length());

            int start = dnaSeq.indexOf("ATG");
            System.out.println("Start: " + start);


            int stop = dnaSeq.indexOf("TGA");
            System.out.println("Stop: " + stop);

            if (start >= 0 && stop > 0 && (stop - (start + 3)) % 3 == 0) {
                System.out.println("That's a protein");
                String protein = dnaSeq.substring(start, stop + 3);
                System.out.println("Protein: " + protein);

            } else System.out.println("That sequence does not contain a protein");


        } catch (FileNotFoundException e) {
            System.err.println("File Not Found. Please enter the name of an existing file.");
        }
    }
}


