package com.example;

public class StringTransformer{
    public static String removeHtmlTags(String inputString){
        StringBuffer output = new StringBuffer();

        for (int n = 0; n < inputString.length(); ++n){
            int currentChar = inputString.charAt(n);

            if(currentChar == '<'){
                n = skipTag(inputString, n);
            }

            if(n < inputString.length()){
                output.append(inputString.charAt(n));
            }
        }

        return output.toString();
    }

    private static int skipTag(String input, int index){
        while (index < input.length()  && input.charAt(index) != '/' && input.charAt(index) != '>'){
            index++;
        }

        if (index < input.length() && input.charAt(index) == '/') {
            return index + 4;
        }

        return index + 1;
    }
}