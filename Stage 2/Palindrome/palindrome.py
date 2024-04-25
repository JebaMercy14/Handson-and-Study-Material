string = input("Enter the string: \n ")
string = string.replace(" ","").lower()
reverse_string = string[::-1]

if reverse_string == string:
    print("Yes, the string is a palindrome!")
else:
    print("No, the string is not a palindrome!")