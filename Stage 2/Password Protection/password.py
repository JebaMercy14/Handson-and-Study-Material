n=int(input("Enter the total no.of plots: \n")) 
if(n>20 or n<1): 
     print("Invalid Input")
     exit()
a=[] 
print("Enter the numbers of each plot:") 
for i in range(n):
     k=int(input())
     if(k>0):
         a.append(k)
     else:
         print("Invalid Input")
         exit()
s=0
b=0
for i in range(n):
   if(a[i]%2!=0):
      s=s+a[i]
   else:
      b=b+a[i]
print("The password for the file is: ", end="")
if s>b:
      print("{:.2f}".format(b+(s-b)/2))
else:
      print("%.2f", (b+(b-s)/2))
