n=int(input("Enter the no. of subjects: "))
if(n<=0):
     print("Invalid no. of subjects")
     exit() 
print("\nenter the marks: ")
a=[]
for i in range(n):
     k=int(input())
     if(k<0 or k>100):
          print("Invalid mark")
          exit()
     a.append(k)
b=0
c=0
for i in a:
     if(i<=50):
          b+=1
     else:
          c+=1
print("No. of subjects passed: ",c)
print("No. of subjects failed: ",b)
