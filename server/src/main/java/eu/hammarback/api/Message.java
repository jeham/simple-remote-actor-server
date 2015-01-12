package eu.hammarback.api;

import java.io.Serializable;

public class Message implements Serializable {

  public String msg;

  public Message(String msg) {
    this.msg = msg;
  }

}
