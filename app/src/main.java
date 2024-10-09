public class TestClass // Missing Javadoc comment for class
{
    public static void main(String[] args){ // Improper indentation and missing Javadoc for method
        int BAD_VARIABLE=10; // Variable name not in camelCase and missing spaces around '='
        for(int i=0;i<10;i++){ // Missing spaces around operators
            System.out.println("Checkstyle test: " + i);
        }
    }
}