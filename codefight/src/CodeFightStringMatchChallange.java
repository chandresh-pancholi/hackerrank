/**
 * Created by chandresh.pancholi on 23/07/16.
 */
public class CodeFightStringMatchChallange {
    public static void main(String[] args){
        String[] input = {"var a = 2;",
                "/*",
                "var b = 2;",
                "if (a === b) {",
                "  b = a + 1;",
                "  //b = a * 2 - 1;",
                "}",
                "*/",
                "var b = 3;",
                "return a * b;"};

        System.out.println(shortestSolutionLength(input));
    }
    public static  int shortestSolutionLength(String[] source) {
        int count = 0;
        boolean flag = true;
        for(int i = 0; i < source.length; i++) {
            String temp = source[i];
            int start = 0;
            int end = source[i].length();

            while(start < end) {
                if(temp.charAt(start) == '/'
                        && temp.charAt(start + 1) =='*' && flag ) {
                    start+=2;
                    flag = false;
                }
                else if(temp.charAt(start) == '*'&& temp.charAt(start+1) == '/') {
                    start+=2;
                    flag = true;
                }
                else if(temp.charAt(start) == '/' && temp.charAt(start+1) == '/') {
                    break;
                }
                else if(temp.charAt(start) == ';' || temp.charAt(start) == ' '){
                    start++;
                }
                else if(flag) {
                    System.out.print(temp.charAt(start)+ " ");
                    count += 1;
                    start++;
                } else {
                    start++;
                }

                // start++;
            }
            if (flag) {
                count+=1;
            }
            System.out.println();


        }
        return count;
    }

//    public static int shortestSolutionLength(String[] source) {
//        int count = 0;
//        int total = 0;
//        for (int i = 0; i < source.length; i++) {
//            String temp = source[i];
//            int start = 0;
//            int end = source[i].length();
//            boolean flag = true;
//
//            while (start < end-1) {
//                if (temp.charAt(start) == '/'
//                        && temp.charAt(start + 1) == '*' && flag) {
//                    start+=2;
//                    flag = false;
//                } else if (temp.charAt(start) == '*' && temp.charAt(start + 1) == '/' && !flag) {
//                    start+=2;
//                    flag = true;
//                } else if (temp.charAt(start) == '/' && temp.charAt(start + 1) == '/') {
//                    break;
//                } else if(temp.charAt(start) == ';' || temp.charAt(start) == ' ') {
//                    start++;
//                }
//                else if(flag) {
////                    System.out.print(" " + temp.charAt(start) + " ");
//                    count+=1;
//                    start++;
//                } else {
//                    start++;
//                }
//            }
//            count += 1;
//            System.out.println(count);
//        }
//
//        return count;
//    }


}