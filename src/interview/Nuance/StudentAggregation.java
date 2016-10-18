/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Nuance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author huico
 */
public class StudentAggregation {

    public static void main(String[] args) {
        String srcFile = new File(".").getAbsolutePath() + "\\testSample.txt";
        String dstFile = new File(".").getAbsolutePath() + "\\resultSample.txt";
        // try opening the source and destination file
        // with FileReader and FileWriter
        try (BufferedReader inputFile = new BufferedReader(new FileReader(srcFile));
                BufferedWriter outputFile = new BufferedWriter(new FileWriter(dstFile))) {
            int ch = 0;
            // while there are characters to fetch, read the characters from
            // source stream and write them to the destination stream
            Map<String, Integer> provinceMapping = new Hashtable();
            Map<String, Integer> cityMapping = new Hashtable();
            Map<String, Integer> schoolMapping = new Hashtable();
            Map<String, Integer> gradeMapping = new Hashtable();

            StringBuffer sb = new StringBuffer();

            while ((ch = inputFile.read()) != -1) {
                if (ch != 13) {
                    sb.append((char) ch);
                } else {
                    String rowValue = sb.toString();
                    System.out.println(rowValue);
                    String[] rowParts = rowValue.split("\t");
                    if (rowParts.length != 4) {
                        System.err.println("Wrong row record: " + rowValue);
                    } else {
                        String grade = rowParts[3].substring(0, 1);
                        Integer value;
                        try {
                            value = Integer.parseInt(rowParts[3].substring(1));
                        } catch (NumberFormatException ex) {
                            System.err.println("Failed to get the number of the record: " + rowValue);
                            break;
                        }

                        if (value != null) {
                            provinceMapping = MapUtils.addRecord(provinceMapping, rowParts[0], value);
                            cityMapping = MapUtils.addRecord(cityMapping, rowParts[1], value);
                            schoolMapping = MapUtils.addRecord(schoolMapping, rowParts[2], value);
                            gradeMapping = MapUtils.addRecord(gradeMapping, grade, value);
                        }
                    }
                    sb = new StringBuffer();
                }
                //outputFile.write((char) ch);
            }
            MapUtils.writeResult(provinceMapping, outputFile);
            MapUtils.writeResult(cityMapping, outputFile);
            MapUtils.writeResult(schoolMapping, outputFile);
            MapUtils.writeResult(gradeMapping, outputFile);
            // no need to call flush explicitly for outputFile - the close()
            // method will first call flush before closing the outputFile stream
        } catch (FileNotFoundException fnfe) {
            // the passed file is not found ...
            System.err.println("Cannot open the file " + fnfe.getMessage());
        } catch (IOException ioe) {
            // some IO error occurred when reading the file ...
            System.err.printf("Error when processing file; exiting ... ");
        }
        // try-with-resources will automatically release FileReader object
    }
}
