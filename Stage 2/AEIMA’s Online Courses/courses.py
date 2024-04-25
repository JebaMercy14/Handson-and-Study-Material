n=int(input("Enter number of courses: "))
if(n<1): 
        print("Invalid no. of courses")
        exit()
a=[]
b=[]
for i in range(n):
        print("Enter name of the subject and mark respectively: \n")
        b.append(input())
        k=int(input())
        if(k<=0 or k>100):
            print("Invalid mark")
            exit()
        a.append(k)
print("The courses you have cleared are:\n")
for i in range(n):
        if a[i]>=80:
            print(b[i],a[i])
