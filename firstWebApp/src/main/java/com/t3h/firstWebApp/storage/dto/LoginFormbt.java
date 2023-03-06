package com.t3h.firstWebApp.storage.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LoginFormbt {
  String name;
  String address;
  String city;
  Boolean gender;
}
