package JavaPackage;

public class StringDemo {
    public static void main(String[] args) {
        String firstName = "Samsuddin";
        String lastName = " Hayder";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //Count String length
        String countStrLeng = String.valueOf(fullName.length());
        System.out.println("Count String value length"+ countStrLeng);

        //equals() & equalsIgnoreCase()  => boolean value
        if (firstName.equalsIgnoreCase(lastName)) {
            System.out.println("Check equals method: Equal");
        }else {
            System.out.println("Check equals method: Not equal");
        }

        //contains() => boolean value
        boolean checkContains = fullName.contains("Sam");
        System.out.println("Check Contains: " + checkContains);

        //concat() => string joint
        String stringJoin = firstName.concat(lastName);
        System.out.println("String Joint Method: " + stringJoin);

        //toUpperCase()
        String upperCaseString = fullName.toUpperCase();
        System.out.println("String Upper case Method: " + upperCaseString);

        //toLowerCase()
        String lowerCaseString = fullName.toLowerCase();
        System.out.println("String Lowr case Method: " + lowerCaseString);

        //startsWith() => boolean value
        boolean checkStringFirstChar = fullName.startsWith("Sa");
        System.out.println("Check String first character Method: " + checkStringFirstChar);

        //endsWith() => boolean value
        boolean checkStringLastChar = fullName.endsWith("re");
        System.out.println("Check String last character Method: " + checkStringLastChar);

        //charAt() => check Index Character
        char checkIndexChar = fullName.charAt(3);
        System.out.println("Check index character Method: " + checkIndexChar);

        //codePointAt() => Unicode value of the character
        int charUnicode = fullName.codePointAt(0);
        System.out.println("Check Character Unicode Value Method: " + charUnicode);

        //indexOf() => position
        int indexPosition = fullName.indexOf("s");
        System.out.println(indexPosition);

        //lastIndexOf

        //trim()

        //replace()
        String replaceString = fullName.replace('S','W');
        System.out.println("Replace String Method: " + replaceString);

        //split()
        String[] splitArrWithStr = fullName.split(" ");
        for (String x : splitArrWithStr) {
            System.out.println(x);
        }




    }
}
