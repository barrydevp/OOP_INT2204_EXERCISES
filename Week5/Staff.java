public class Staff extends Person {
  // property
  private String school;
  private double pay;
  
  /** 
   * 
   */
  Staff() {
    super();
    this.school = "UET";
    this.pay = 0.0;
  }
  
  /**
   * 
   * @param name
   * @param address
   * @param school
   * @param pay
   */
  Staff(String name, String address, String school, double pay) {
    super(name, address);

    this.school = school;
    this.pay = pay;
  }

  /**
   * @return the school
   */
  public String getSchool() {
    return school;
  }

  /**
   * @param school the school to set
   */
  public void setSchool(String school) {
    this.school = school;
  }

  /**
   * @return the pay
   */
  public double getPay() {
    return pay;
  }

  /**
   * @param pay the pay to set
   */
  public void setPay(double pay) {
    this.pay = pay;
  }

  /** 
   * 
   * @return object Staff to String
   */
  public String toString() {
    return "Staff[" + super.toString() + ",school=" + this.school + ",pay=" + this.pay + "]";
  }
}