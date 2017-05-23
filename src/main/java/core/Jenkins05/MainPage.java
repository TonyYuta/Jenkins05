package core.Jenkins05;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;

public class MainPage {
	
/*	Checkstyle checkstyle;
	Findbugs findbugs;
	CPD cpd;
	PMD pmd;*/
	
	
    public static void main( String[] args ) {

    	Checkstyle checkstyle = new Checkstyle();
    	Findbugs findbugs = new Findbugs();
    	CPD cpd = new CPD();
    	PMD pmd = new PMD();
    	
    	checkstyle.MethodNameMethodNameMethodName();
    	
    	findbugs.BigInteger();
  //  	findbugs.findBugs02();
  //  	findbugs.findBugs03();
    	findbugs.findBugs04();
    	
    	cpd.bar();
    	cpd.BigInteger();
    	
    	pmd.bar();
    	pmd.BigInteger();
    	
    	
    	
    }
    
    public int sum2numbers (int first, int second) {
    	return first + second;
    }
    
    public int subtract2numbers (int first, int second) throws FileNotFoundException {
    	FileOutputStream fos = new FileOutputStream("hello-world.zip");
    	BufferedOutputStream bos = new BufferedOutputStream(fos);
    	ZipOutputStream zos = new ZipOutputStream(bos);
    	return first - second;
    }
    
    public int multiplication2numbers (int first, int second) {
    	return first * second;
    }
    
    public int division2numbers (int first, int second) {
    	return first / second;
    } 
    
    public int division2numbersZero (int first, int second) {
    	second = 0;
    	return first / second;
    } 
    
    
    
    
}
