line=input("enter the string..")
a=0
e=0
i=0
o=0
u=0
for r in line:
    if(r == 'a' or r == 'A'):
     a=a+1
     
    elif(r == 'e' or r == 'E'):
     e=e+1
     
    elif(r == 'i' or r == 'i'):
     i=i+1
   
    elif(r == 'o' or  r == 'O'):
     o=o+1
     
    elif(r == 'u'or  r == 'U'):
     u=u+1
     
print("a:",a)  
print("e:",e)
print("i:",i)
print("o:",o)
print("u:",u)