import java.util.Scanner;
public class ArrayInRam2
{
	public static void main(String[] args)
	{
		//���岢��ʼ�����飬ʹ�þ�̬��ʼ��
		int[] a={5,7,20};
		//���岢��ʼ�����飬ʹ�ö�̬��ʼ��
		int[] b=new int[4];
		//���b����ĳ���
		System.out.println("b����ĳ���Ϊ��"+b.length);
		//ѭ�����a�����Ԫ��
		for (int i=0,len=a.length;i<len;i++)
		{
			System.out.println(a[i]);
		}
		//ѭ�����b�����Ԫ��
		for(int i=0,len=b.length;i<len;i++)
		{
			System.out.println(b[i]);
		}
		//��Ϊa��int[]���ͣ�bҲ��int[]���ͣ����Կ��Խ�a��ֵ����b
		//Ҳ������b����ָ��aָ�������
		b=a;
		//�ٴ����b����ĳ���
		System.out.println("b����ĳ���Ϊ��"+b.length);
	}	
}
/*b����ĳ���Ϊ��4
5
7
20
0
0
0
0
b����ĳ���Ϊ��3*/
