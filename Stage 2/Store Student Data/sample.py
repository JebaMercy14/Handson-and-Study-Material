n = int(input("Enter number of students: "))

with open("output_data.txt", "w") as f:
    for i in range(1, n+1):
        name = input(f"For student {i}\nEnter name: ")
        score = input("Enter the score: ")
        f.write(f"Name:{name} Score: {score}\n")

print("Data written to file successfully!")