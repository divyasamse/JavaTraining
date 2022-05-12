//program for printing square of numbers present in array
class Square{
public static void main(String args[]){

int[] arr={2,3,4,5,7};

for(int i=0;i<arr.length;i++)
{
arr[i]=(int)Math.pow(arr[i],2);
}
for(int value:arr)
{ 
System.out.println(value);
}}}
