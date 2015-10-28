package kata4;

import java.io.IOException;
import java.util.ArrayList;

public class KATA4 {

    public static void main(String[] args) throws IOException {
        String nameFile = "C:\\Users\\usuario\\Desktop\\KATA4\\data\\email.txt";
        ArrayList<String> mailArray = MailListReader.reader(nameFile);
        Histogram<String> histo = MailHistogramBuilder.build(mailArray);

        new HistogramDisplay(histo).execute();
    }
}
