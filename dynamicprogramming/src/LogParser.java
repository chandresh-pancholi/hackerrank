import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chandresh.pancholi on 12/04/16.
 */
public class LogParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> requestTypeList = new ArrayList<>();
        List<String> requestURLList = new ArrayList<>();
        List<String> ipList = new ArrayList<>();
        List<String> requestFormatList = new ArrayList<>();
        List<String> responseCodeList = new ArrayList<>();

        String endOfLog = "***************###############***************";
        String line;

        while (!(line = sc.nextLine().trim()).equalsIgnoreCase(endOfLog)) {
            if (line.startsWith("Started ")) {
                String[] splittedLine = line.split(" ");

                requestTypeList.add(splittedLine[1]);

                requestURLList.add(splittedLine[2].substring(1, splittedLine[2].lastIndexOf("\"")));

                ipList.add(splittedLine[4]);
            } else if(line.startsWith("Processing by ")) {
                String[] splittedLine = line.split(" ");

                if(splittedLine.length > 4)
                    requestFormatList.add(splittedLine[splittedLine.length - 1]);
                else
                    requestFormatList.add("HTML");
            } else if(line.startsWith("Completed ")) {
                responseCodeList.add(line.substring(10, line.indexOf(" in")).trim());
            }
        }

        String requestType = sc.nextLine();
        String requestURL = sc.nextLine();
        String ip = sc.nextLine();
        String requestFormat = sc.nextLine();
        String responseCode = sc.nextLine();

        if(requestFormat.equalsIgnoreCase("null") || requestFormat.equalsIgnoreCase("blank")) {
            requestFormat = "HTML";
        }

        int requestCount = 0;
        int requestURLCount = 0;
        int ipCount = 0;
        int requestFormatCount = 0;
        int responseCodeCount = 0;

        for(String request : requestTypeList) {
            if(request.equalsIgnoreCase(requestType)) {
                requestCount++;
            }
        }

        for(String url : requestURLList) {
            if(url.equalsIgnoreCase(requestURL)) {
                requestURLCount++;
            }
        }

        for(String ipData : ipList) {
            if(ipData.equalsIgnoreCase(ip)) {
                ipCount++;
            }
        }

        for(String format : requestFormatList) {
            if(format.equalsIgnoreCase(requestFormat))
                requestFormatCount++;
        }

        for(String code : responseCodeList) {
            if(code.equalsIgnoreCase(responseCode))
                responseCodeCount++;
        }

        System.out.println(requestCount);
        System.out.println(requestURLCount);
        System.out.println(ipCount);
        System.out.println(requestFormatCount);
        System.out.println(responseCodeCount);

    }

}
