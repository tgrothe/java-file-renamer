import java.io.File;

public class Main {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println(
          "Usage: java -jar <jar file> <full path to directory> <dry run (true/false)>");
      System.exit(1);
    }
    String fullPath = args[0];
    boolean dryRun = Boolean.parseBoolean(args[1]);
    File[] files = new File(fullPath).listFiles();
    assert files != null;
    for (File file : files) {
      String newName = file.getName().replaceAll("[^0-9A-Za-z ()\\[\\],.-]", "");
      newName = newName.replaceAll(" {2,}", " ");
      newName = newName.replaceAll(" +,", ",");
      newName = newName.replaceAll("\\( +", "(");
      newName = newName.replaceAll(" +\\)", ")");
      if (!file.getName().equals(newName)) {
        System.out.println("Renaming " + file.getName() + " ---> " + newName);
        if (!dryRun) {
          System.out.println(
              "Result: " + file.renameTo(new File(file.getParent() + File.separator + newName)));
        }
      }
    }
  }
}
