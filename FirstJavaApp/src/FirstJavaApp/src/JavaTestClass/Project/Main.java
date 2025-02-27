package FirstJavaApp.src.JavaTestClass.Project;

public class Main {
    public static void main(String[] args) {
    	
    	
    	args[0] = "java FirstJavaApp.src.JavaTestClass.Project.Main records.txt";

        if (args.length < 1) {
            System.out.println("Usage: java Main <records.txt>");
            return;
        }

        String recordFileName = args[0];
        Records records = new Records();
        records.readRecords(recordFileName);
        records.displayRecords();
    }
}
//"C:\\Users\\Admin\\eclipse-workspace\\FirstJavaApp\\src\\FirstJavaApp\\src\\JavaTestClass\\Project\\records.txt"