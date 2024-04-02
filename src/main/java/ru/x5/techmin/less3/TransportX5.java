package ru.x5.techmin.less3;

import java.util.Objects;

public class TransportX5 {

  private String type;
  private String number;
  private Driver driver;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TransportX5 that = (TransportX5) o;

    if (!Objects.equals(type, that.type)) return false;
    if (!Objects.equals(number, that.number)) return false;
    return Objects.equals(driver, that.driver);
  }

  @Override
  public int hashCode() {
    int result = type != null ? type.hashCode() : 0;
    result = 31 * result + (number != null ? number.hashCode() : 0);
    result = 31 * result + (driver != null ? driver.hashCode() : 0);
    return result;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }
}
