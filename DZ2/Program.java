package DZ2;

public class Program {

    public static String data = """
                                    sdsfds@
                                    fdfsadf@
                                    asdfg@""";


    public static void main(String[] args) {
        LogReader lReader = new PoemReader(data);
        lReader.setCurrentPosition(2);

        for (LogEntry log: lReader.readLogEntry()){
            System.out.println(log.getText());
        }
    }
}
