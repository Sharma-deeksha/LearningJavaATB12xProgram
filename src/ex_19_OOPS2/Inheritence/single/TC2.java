package ex_19_OOPS2.Inheritence.single;

public class TC2 extends CommonToAllTCs{
    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running TC2");
        closeBrowser();
    }
}
