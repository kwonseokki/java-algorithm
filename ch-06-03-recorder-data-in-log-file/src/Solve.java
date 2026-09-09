public class Solve {
    public static void main(String[] args) {
        Solve.reoderLogFiles2(new String[] {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"});
    }

    public static String[] reoderLogFiles2(String[] logs) {

        String[] logList = new String[logs.length];
        String[] digitList = new String[logs.length];

        // 문자배열과 숫자배열을 별도의 배열로 분리
        // 숫자배열은 순서를 유지하기 때문에 문자를 처리하고 이어붙힌다.
        int letterCount = 0;
        int digitCount = 0;
        for (String log : logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                digitList[digitCount++] = log;
            } else {
                logList[letterCount++] = log;
            }
        }

        // 문자 배열만 처리
        for (int i = 0; i < letterCount; i++) {

            int index = i;

            for (int j = i; j < letterCount; j++) {

                // 현재 문자와 타켓문자의 우선순위를 비교하고 swap
                String s1 = logList[index].substring(logList[index].indexOf(" "));
                String s2 = logList[j].substring(logList[j].indexOf(" "));
                String c1 = logList[index].substring(0, logList[index].indexOf(" "));
                String c2 = logList[j].substring(0, logList[j].indexOf(" "));

                if (s2.compareTo(s1) < 0) {
                    index = j;
                } else if (s2.compareTo(s1) == 0 && c2.compareTo(c1) < 0) {
                    index = j;
                }
            }
            String temp = logList[i];
            logList[i] = logList[index];
            logList[index] = temp;
        }

        // 문자배열에 숫자배열값을 이어붙힌다
        for (int i = 0; i < digitCount; i++) {
            logList[letterCount + i] = digitList[i];
        }

        return logList;
    }

    public String[] reorderLogFiles(String[] logs) {

        // 로그의 길이만큼 배열 크기 할당
        String[] logList = new String[logs.length];

        for (int i = 0; i < logs.length; i++) {
            boolean inserted = false;
            int index = 0;
            for (int j = 0; j < i; j++) {
                // 문자로그 우선순위가 높은경우
                // 문자로그 우선순위가 같다면 식별자 비교
                String s1 = logs[i].substring(logs[i].indexOf(" "));
                String s2 = logList[j].substring(logList[j].indexOf(" "));
                String c1 = logs[i].substring(0, logs[i].indexOf(" "));
                String c2 = logList[j].substring(0, logList[j].indexOf(" "));
                boolean isDigit = Character.isDigit(logs[i].split(" ")[1].charAt(0));
                boolean targetIsDigit = Character.isDigit(logList[j].split(" ")[1].charAt(0));

                // 숫자로그가 아니면서 현재 로그 우선순위가 높은경우
                if ((s1.compareTo(s2) < 0 || targetIsDigit) && !isDigit) {
                    for (int k = i; k > j; k--) {
                        logList[k] = logList[k - 1];
                    }
                    logList[j] = logs[i];
                    inserted = true;
                    break;
                } else if (s1.compareTo(s2) == 0 && c1.compareTo(c2) < 0) {
                    for (int k = i; k > j; k--) {
                        logList[k] = logList[k - 1];
                    }
                    logList[j] = logs[i];
                    inserted = true;
                    break;
                }
                index++;
            }

            // 최종 인덱스 삽입
            if (!inserted) {
                logList[index] = logs[i];
            }
        }

        return logList;
    }
}
