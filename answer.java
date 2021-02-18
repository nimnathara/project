Public class solution{
public static void main (string args[])
int A[]={5,7,3,9,12,8};
int num1=A[0];
int num2=num1;

for(int i=1;i<A.length;i++){

     if (num1 < A[i])
     num2= num1;
     num1= A[i];
     else if (num2 < A[i]){
          num2 ß A[i]
}
System.out.println(num2);
}