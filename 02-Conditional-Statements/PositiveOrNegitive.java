class PositiveOrNegative
{
	public static void main(String[] args)
	{
		int num = -10;

		String res = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

		System.out.println(res);
	}
}