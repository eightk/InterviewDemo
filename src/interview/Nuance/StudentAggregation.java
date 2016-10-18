/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Nuance;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dstFile))) {
            new StudentAggregationDriver().aggregateRecords(in, out);
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
