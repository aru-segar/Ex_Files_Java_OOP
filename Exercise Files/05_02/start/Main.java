public class Main {   
    public static void main(String[] args) {
        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("message.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println("File path: " + digitsOnlyFileReader.getPath());
    } 
}
