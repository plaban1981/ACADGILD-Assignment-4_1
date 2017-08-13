class sum1
{
	public  int Sum1(int x,int y)
	{
		return(x+y);
    }

public  int Sum1(int x,int y,int z)
{
return(x+y+z);
    }
}
public class SumOverloading {

	public static void main(String[] args) {
        sum1 obj = new sum1();
        System.out.println(obj.Sum1(10,20));
        System.out.println(obj.Sum1(10,20,30));


	}

}
