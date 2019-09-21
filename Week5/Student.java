public class Student extends Person {
  // property
  private String program;
  private int year;
  private double fee;
  
  /** 
   * 
   */
  Student() {
    super();
    this.program = "IT";
    this.year = 2018;
    this.fee = 0.0;
  }
  
  /**
   * 
   * @param name
   * @param address
   * @param program
   * @param year
   * @param fee
   */
  Student(String name, String address, String program, int year, double fee) {
    super(name, address);

    this.program = program;
    this.year = year;
    this.fee = fee;
  }

  /**
   * @return the program
   */
  public String getProgram() {
    return program;
  }

  /**
   * @param program the program to set
   */
  public void setProgram(String program) {
    this.program = program;
  }

  /**
   * @return the year
   */
  public int getYear() {
    return year;
  }

  /**
   * @param year the year to set
   */
  public void setYear(int year) {
    this.year = year;
  }

  /**
   * @return the fee
   */
  public double getFee() {
    return fee;
  }

  /**
   * @param fee the fee to set
   */
  public void setFee(double fee) {
    this.fee = fee;
  }

  /** 
   * 
   * @return object Student to String
   */
  public String toString() {
    return "Student[" + super.toString() + ",year=" + this.year + ",fee=" + this.fee + "]";
  }
}