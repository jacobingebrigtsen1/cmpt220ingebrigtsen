public class TestsMyLong {

public static void main(String[] args) {

MyLong long1=new MyLong(293182741L);

if(long1.isEven())

{

System.out.println(long1.getValue()+" is Even.");

}

if(long1.isOdd())

{

System.out.println(long1.getValue()+" is Odd.");

}

if(long1.isPrime())

{

System.out.println(long1.getValue()+" is Prime.");

}

  

long v=198231824L;

if(MyLong.isEven(v))

{

System.out.println(v+" is Even.");

}

if(MyLong.isOdd(v))

{

System.out.println(v+" is Odd.");

}

if(MyLong.isPrime(v))

{

System.out.println(v+" is Prime.");

}

  

MyLong long2=new MyLong(821938172L);

if(MyLong.isEven(long2))

{

System.out.println(long2.getValue()+" is Even.");

}

if(MyLong.isOdd(long2))

{

System.out.println(long2.getValue()+" is Odd.");

}

if(MyLong.isPrime(long2))

{

System.out.println(long2.getValue()+" is Prime.");

}

char ch[]={'5','2','6','1','9','3','8','8','2','1','8','0'};

long g1=MyLong.parseLong(ch);

System.out.println(g1);

String str="90238429048202";

long g2=MyLong.parseLong(str);

System.out.println(g2);

}

}