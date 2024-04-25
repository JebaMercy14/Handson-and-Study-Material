def find_prime (start, end):
    prime_list= []
    if start >end:
        print("Invalid range")
    elif start < 0 or end < 0:
        print("Invalid range")
    else:
        for num in range(start, end+1):
            if num > 1:
                for i in range(2, num):
                    if num % i == 0: 
                        break
                else:
                    prime_list.append(num)
        if len(prime_list) == 0:
            print("There is no prime numbers in this range")
        else:
            print(prime_list)

n=int(input())
k=int(input())
find_prime (n,k)
