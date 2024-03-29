package edu.yu.compilers;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavanaSemanticTests 
{
    private void runTest(String fileName)
    {
        System.out.println("\n==========Running Semantic check on " + fileName + " Test==============");
        File file = new File("/Users/asherkirshtein/Desktop/coding_courses/Kirshtein_Asher_800610242/Javana/src/test/java/edu/yu/compilers/Code/" + fileName + ".jv");
        // Execute the command
        try 
        {
            Process process = Runtime.getRuntime().exec("java -jar ./target/Javana-1.jar -symbols " + file.getAbsolutePath());
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
        //gets errors
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
        //gets errors
    }
    @Test
    public void SnowsTest()
    {
        runTest("Snows");
    }    
}
