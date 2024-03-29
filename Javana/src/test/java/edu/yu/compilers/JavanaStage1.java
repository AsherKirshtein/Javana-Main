package edu.yu.compilers;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavanaStage1
{
    private void runTest(String fileName)
    {
        System.out.println("\n==========Running " + fileName + " Test==============");
        File file = new File("/Users/asherkirshtein/Desktop/coding_courses/Kirshtein_Asher_800610242/Javana/src/test/java/edu/yu/compilers/Code/" + fileName + ".jv");
        try (Scanner myReader = new Scanner(file)) 
        {
            while (myReader.hasNextLine()) 
            {
                String data = myReader.nextLine();
                //System.out.println(data);
            }
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }


        System.out.println("\n==========Tokenizing " + fileName + ".jv==============");
        // Execute the command
        try 
        {
            Process process = Runtime.getRuntime().exec("java -jar ./target/Javana-1.jar -tokens " + file.getAbsolutePath());
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                //System.out.println(line);
            }
            process.waitFor();
            reader.close();
        }
        catch (IOException | InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("\n==========Parsing " + fileName + ".jv==============");
        // Parse the command
        try 
        {
            Process process = Runtime.getRuntime().exec("java -jar ./target/Javana-1.jar -parse " + file.getAbsolutePath());
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
            process.waitFor();
            reader.close();
        }
        catch (IOException | InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("\n==========End " + fileName + " Test==============");
    }

    @Test
    public void HelloWorldTest()
    {
        runTest("HelloWorld");
    }

    @Test
    public void SimpleForLoopTest()
    {
        runTest("SimpleForLoop");
    }

    @Test
    public void TestCase()
    {
        runTest("TestCase");
        //doesn't pass
    }

    @Test
    public void TestFunction()
    {
        runTest("TestFunction");
    }

    @Test
    public void TestIf()
    {
        runTest("TestIf");
    }

    @Test
    public void TestProcedure()
    {
        runTest("TestProcedure");
    }

    @Test
    public void TestProcedureVar()
    {
        runTest("TestProcedureVar");
    }

    @Test
    public void TestWhile()
    {
        runTest("TestWhile");
    }

    @Test
    public void TypeTest()
    {
        runTest("TypeTest");
        //doesn't pass
    }
    @Test
    public void SnowsTest()
    {
        runTest("Snows");
    }  
}
