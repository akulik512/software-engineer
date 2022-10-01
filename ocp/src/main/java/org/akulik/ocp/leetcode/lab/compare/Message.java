package org.akulik.ocp.leetcode.lab.compare;

public class Message {

  private final int id;
  private final String msg;

  public Message(int id, String msg) {
    this.id = id;
    this.msg = msg;
  }

  public int getId() {
    return id;
  }

  public String getMsg() {
    return msg;
  }

  @Override
  public String toString() {
    return "Message{" + "id=" + id + ", msg='" + msg + '\'' + '}';
  }
}
