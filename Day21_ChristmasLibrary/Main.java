public class Main {
    public static void main(String[] args) {

        LibraryManager manager = new LibraryManager();

        TestData.load(manager);
        
        manager.printChristmasReport();
    }
}