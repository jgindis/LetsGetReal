public abstract class Number {

  public abstract double getValue();

  public int compareTo(Number other){
   int var = 0;
   if (getValue() > other.getValue()) var = 1;
   if (getValue() == other.getValue()) var = 0;
   if (getValue() < other.getValue()) var = -1;
   return var;
 }

  public boolean equals(Number other) {
    return (getValue() == other.getValue());
  }

}
