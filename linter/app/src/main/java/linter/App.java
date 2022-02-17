/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void javaScriptLinter(String filePath) {


        Path javaScriptScanPath = Paths.get(filePath);

        Scanner linterScanner = null;
        try {
            linterScanner = new Scanner(javaScriptScanPath);
        } catch (
                IOException ioe) {
            System.out.println("Cannot scan file");
            ioe.printStackTrace();
            System.exit(1);
        } finally {
            System.out.println("Scan attempt complete");
        }

        HashMap<String, Integer> linterCheckMap = new HashMap<>();
        //String[] expectedSyntaxSymbols = {";", "{", "}", "if", "else"};
        int lineCounter = 0;
        while (linterScanner.hasNextLine()) {
            lineCounter++;
            String currentLineScanned = linterScanner.nextLine();

            if (!currentLineScanned.endsWith(";") &&
                    !currentLineScanned.endsWith("{") &&
                    !currentLineScanned.endsWith("}") &&
                    !currentLineScanned.contains("if") &&
                    !currentLineScanned.contains("else") &&
                    currentLineScanned.length() > 0
            ) {
                System.out.println("Line " + lineCounter + ": Missing semicolon.");
            }
        }
    }

    public static void main(String[] args) {
        javaScriptLinter("../../resources/gates.js");
    }
}
