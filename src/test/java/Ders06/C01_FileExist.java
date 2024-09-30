package Ders06;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileExist {

    @Test
    public void test() {
        System.out.println(System.getProperty("user.dir"));

        // ANA DİZİN
        System.out.println(System.getProperty("user.home"));

        String file ="C:\\Users\\Sefa\\Desktop\\dedede.txt";
        Assert.assertTrue(Files.exists(Paths.get(file)));

    }
}
