//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Brian Milian


//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number
{
//private instance variable (must be an Integer)
private Integer num;

//constructor
public Number()
{
  num = 0;
}

public Number(int x)
{
  num = x;
}

//getter method
public Integer getNum()
{
  return num;
}

//setter method
public void setNum(int x)
{
  num = x;
}
//isOdd method
public boolean isOdd()
{
  if(num % 2 == 0)
  {
    return false;
  }
  else
  {
    return true;
  }
}

//isPerfect method
public boolean isPerfect()
{
  int x = 0;
  for(int y = 1; y < num; y = y + 1)
  {
    if(num % y == 0)
    {
      x += y;
    }
  }

  if(num == x)
  {
    return true;
  }
  else
  {
    return false;
  }
}

//toString
public String toString()
{
  return ""+num;
}
}