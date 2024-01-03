package com.example.homework.homework.model;

public class contactm {

  private String id;
  private String ClientName;
  private String ClientEmail;
  private String ClientMessage;

  public contactm(String id, String clientName, String clientEmail, String clientMessage) {
    this.id = id;
    ClientName = clientName;
    ClientEmail = clientEmail;
    ClientMessage = clientMessage;
  }

  public contactm() {

  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getClientName() {
    return ClientName;
  }

  public void setClientName(String clientName) {
    ClientName = clientName;
  }

  public String getClientEmail() {
    return ClientEmail;
  }

  public void setClientEmail(String clientEmail) {
    ClientEmail = clientEmail;
  }

  public String getClientMessage() {
    return ClientMessage;
  }

  public void setClientMessage(String clientMessage) {
    ClientMessage = clientMessage;
  }

}
