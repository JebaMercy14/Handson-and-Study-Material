a=int(input("Dead Count:"))


print()
if(a<0):
    print("Invalid input")
    exit()
b=int(input("Injured Count:"))
print()
if(b<0):
    print("Invalid input")
    exit()
c=int(input("Safe Count:"))
print()
if(c<0):
    print("Invalid input")
    exit()
print("TSUNAMI REPORT OF JAPAN")
print("The number of people")
print("Dead: ", end="")
print(a)
print("Injured: ", end="")
print(b)
print("Safe:", end="")
print(c)
print("\nPlease help the people who are suffering!!!")
