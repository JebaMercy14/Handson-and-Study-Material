print("Enter the number of names:")
n=int(input()) 
if(n <= 0) :
        print("Invalid Input") 
        exit()
a=[]
print("Enter the names: ")
for i in range(0,n): 
        a.append(input())
i = 0
while(i<n-1):
        j = i + 1
        while j<n:
            if (len(a[i])< len(a[j])):
                t=a[i] 
                a[i]=a[j] 
                a[j]=t
            elif(len(a[i])== len (a[j])): 
                if(a[i] < a[j]): 
                    t=a[i] 
                    a[i]=a[j]
                    a[j]=t
            j = j + 1 
        i = i + 1
print("The sorted name list is: ") 
for i in a:
        print(i)
