package com.akulik.ocp.module13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Part1 {

  private static final String PATH =
      "/home/akulik/IdeaProjects/software-engineer/ocp/src/main/java/com/akulik/ocp/thirteen/";

  public static void main(String[] args) {
    new ConnectingStream().result();
  }

  private static class ConnectingStream {

    private void result() {
      Charset utf8 = StandardCharsets.UTF_8;

      try (BufferedReader in =
          new BufferedReader(
              new InputStreamReader(
                  new FileInputStream(String.format("%sthirteen_in.txt", PATH)), utf8));
          PrintWriter out =
              new PrintWriter(
                  new OutputStreamWriter(
                      new FileOutputStream(String.format("%sthirteen_out.txt", PATH)), utf8))) {
        String line;
        while ((line = in.readLine()) != null) {
          out.println(line);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
