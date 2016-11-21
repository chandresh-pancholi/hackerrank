

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sudhanshu.gupta on 10/04/16.
 */
public class TestClass {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> requestTypeList = new ArrayList<>();
        List<String> requestUrlList = new ArrayList<>();
        List<String> ipList = new ArrayList<>();
        List<String> requestFormatList = new ArrayList<>();
        List<String> responseCodeList = new ArrayList<>();
        String endingLine = "***************###############***************";
        String line;
        while (!(line=scanner.nextLine().trim()).equalsIgnoreCase(endingLine)) {
            if(line.startsWith("Started ")) {
                String [] array = line.split(" ");
                requestTypeList.add(array[1]);
                requestUrlList.add(array[2].substring(1, array[2].lastIndexOf("\"")));
                ipList.add(array[4]);
            } else if(line.startsWith("Processing by ")) {
                String [] array = line.split(" ");
                if(array.length>4) {
                    requestFormatList.add(array[4]);
                } else
                    requestFormatList.add("HTML");
            } else if(line.startsWith("Completed ")) {
                responseCodeList.add(line.substring(10, line.indexOf(" in")).trim());
            }
        }
        String requestType = scanner.nextLine().trim();
        String requestUrl = scanner.nextLine().trim();
        String ip = scanner.nextLine().trim();
        String requestFormat = scanner.nextLine().trim();
        String responseCode = scanner.nextLine().trim();

        if(requestFormat.equalsIgnoreCase("null")||requestFormat.equalsIgnoreCase("blank")||requestFormat.equalsIgnoreCase("null/blank"))
            requestFormat = "HTML";

        int requestTypeCount =0, requestUrlCount =0, ipCount=0, requestFormatCount=0, responseCodeCount=0;
        for(String rType:requestTypeList) {
            if(rType.equalsIgnoreCase(requestType))
                requestTypeCount++;
        }
        System.out.println(requestTypeCount);

        for(String rUrl:requestUrlList) {
            if(rUrl.equalsIgnoreCase(requestUrl))
                requestUrlCount++;
        }
        System.out.println(requestUrlCount);

        for(String i:ipList) {
            if(i.equalsIgnoreCase(ip))
                ipCount++;
        }
        System.out.println(ipCount);

        for(String rFormat:requestFormatList) {
            if(rFormat.equalsIgnoreCase(requestFormat))
                requestFormatCount++;
        }
        System.out.println(requestFormatCount);

        for(String rCode:responseCodeList) {
            if(rCode.equalsIgnoreCase(responseCode))
                responseCodeCount++;
        }

        System.out.println(responseCodeCount);
    }
}
