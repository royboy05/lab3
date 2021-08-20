class second { 
    public static void main(String args[]) {// args0=1, args1=+, args2=2, a b c
    int b,a,c,sum,mult,sub;
    float div;
    // char b;
    a=Integer.parseInt(args[0]);
    // b=Character(args[2]);  
    // b=Integer.parseInt(args[1]);
    c=Integer.parseInt(args[2]);
    System.out.println("a="+a);
    System.out.println("c="+c);
    sum=a+c;
    div=(float)a/(float)c;
    sub=a-c;
    mult=a*c;
    if(args[1].equals("+"))
    System.out.println("Addition-"+sum);
    else if(args[1].equals("-"))
    System.out.println("substraction-"+sub);
    else if(args[1].equals("x"))
    System.out.println("Multiplication-"+mult);
    else if(args[1].equals("/"))
    System.out.println("division-"+div);
    else
    System.out.println("Error");


    
}
    
}