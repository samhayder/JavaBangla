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

        // ******* String Buffer ***********
        StringBuffer sb = new StringBuffer("Salman Yasin ");
        System.out.println("String Buffer output: " + sb);

        // append() => add value any type of data
        sb.append(10);
        System.out.println("Appended value: " + sb);

        // delete()
        sb.delete(12,15);
        System.out.println("Delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reverse String: " + sb);

        //Palindrome String
        String palindromeStr = "madam";
        StringBuffer strReverse = new StringBuffer(palindromeStr);

        String palinReverse = strReverse.reverse().toString();

        if (palindromeStr.equals(palinReverse)) {
            System.out.println(palindromeStr + " is a Palindrome.");
        } else {
            System.out.println(palindromeStr + " is not a Palindrome.");
        }

        // ********* Conversation ************
        // Primitive data type => Object
          /*int => Integer
            byte => Byte
            float => Float
            long => Long
            double => Double
            char = Character
            boolean => Boolean
            short => Short  */
        int priDataInt = 32;
        Integer objInt = Integer.valueOf(priDataInt);
        System.out.println("Primitive int => Object Integer: " + objInt);

        double priDataDouble = 3.1415;
        Double objDouble = priDataDouble;
        System.out.println("Primitive double => Object Double: " + objDouble);

        boolean priDataBoolean = true;
        Boolean objBoolean = priDataBoolean;
        System.out.println("Primitive boolean => Object Boolean: " + objBoolean);

        // Primitive => String
        int priToStr = 420;
        String strToPri = Integer.toString(priToStr);
        System.out.println("Primitive int => String: " + strToPri);

        char priToChar = 'S';
        String strTOChar = Character.toString(priToChar);
        System.out.println("Primitive char => String: " + strTOChar);

        // String => Primitive
        String convertPri = "420";
        int convertStr = Integer.parseInt(convertPri);
        System.out.println("String int => Primitive int: " + convertStr);

        String convertPri2 = "false";
        boolean convertStr2 = Boolean.valueOf(convertPri2);
        System.out.println("String boolean => Primitive boolean: " + convertStr2);


        // ******* Number Conversation ***********
        // Binary, Octal, Hexadecimal => Decimal
        String binary = "10101";
        Integer decimalToBinary = Integer.parseInt(binary,2);
        System.out.println("Binary => Decimal: " + decimalToBinary);

        String octal = "123";
        Integer decimalToOctal = Integer.parseInt(octal,8);
        System.out.println("Octal => Decimal: " + decimalToOctal);

        String hexadecimal = "f";
        Integer decimalToHexa = Integer.parseInt(hexadecimal,16);
        System.out.println("Hexadecimal => Decimal: " + decimalToHexa);



    }
}
