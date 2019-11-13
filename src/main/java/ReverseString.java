class ReverseString {

    String reverse(String inputString) {
        // TODO: 12/11/19 -1st method
      /*  String input = "";
        for (int lastIndex = inputString.length() - 1; lastIndex >= 0; lastIndex--) {
            input = input + inputString.charAt(lastIndex);
        }
        return input;*/
// TODO: 12/11/19 -2nd method with string builder with append method
        //we can use here string builder class
        //StringBuilder=use to create mutable (modifiable string)

        /* char[] input = inputString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int lastIndex = input.length - 1; lastIndex >= 0; lastIndex--) {
            stringBuilder.append(input[lastIndex]);
        }
        return stringBuilder.toString();*/

        // TODO: 12/11/19 -3rd method with string builder with reverse method
        //        return new StringBuilder(inputString).reverse().toString(); we can do this way also
        StringBuilder stringBuilder = new StringBuilder(inputString);
        return stringBuilder.reverse().toString();


    }

}