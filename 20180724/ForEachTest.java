import java.util.Scanner;
public class ForEachTest
{
	public static void main(String[] args)
	{
		String[] books={"s1","s2","s3"};
		for (String book : books)
		{
			book="·è¿ñAjax½²Òå";
			System.out.println(book);
		}
		System.out.println(books[0]);
	}
}