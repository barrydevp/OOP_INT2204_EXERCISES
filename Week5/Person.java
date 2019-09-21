public class Person {
  // property
  private String name;
  private String address;
  
  /** 
   * 
   */
  Person() {
    this.name = "Dao Minh Hai";
    this.address = "Lao Cai";
  }
  
  /**
   * 
   * @param name
   * @param address
   */
  Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /** 
   * 
   * @return object Person to String
   */
  public String toString() {
    return "Person[name=" + this.name + ",address=" + this.address + "]";
  }
}