package com.akulik.ocp.thirteen;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ConnectingStreams {
    private static final String PATH = "/home/akulik/IdeaProjects/software-engineer/ocp/src/main/java/com/akulik/ocp/thirteen/";;

    public static void main(String[] args) {
        Charset utf8 = StandardCharsets.UTF_8;

        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(String.format("%sthirteen.txt", PATH)), utf8));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(String.format("%sthirteen_out.txt", PATH)), utf8))) {
            String line = null;
            while ((line = in.readLine()) != null) {
                out.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
