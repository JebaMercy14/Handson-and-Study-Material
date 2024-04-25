# Get age and income from user
age = int(input("Enter the age:\n"))
if age < 18 or age > 100:
    print("Invalid Age")
    exit()
income = float(input("Enter the income:\n"))
if income < 0:
    print("Invalid Income")
    exit()
else:
    # Calculate tax based on age and income
    if age <= 60:
        if income <= 250000:
            tax = 0
        elif income <= 500000:
            tax = (income) * 0.1
        elif income <= 1000000:
            tax = 25000 + (income) * 0.2
        else:
            tax = 125000 + (income) * 0.3
    elif age > 60 and age <= 80:
        if income <= 300000:
            tax = 0
        elif income <= 500000:
            tax = (income - 300000) * 0.1
        elif income <= 1000000:
            tax =  (income) * 0.2
        else:
            tax =  (income) * 0.3
    else:
        if income <= 500000:
            tax = 0
        elif income <= 1000000:
            tax = (income) * 0.2
        else:
            tax =  (income) * 0.3

    # Display the calculated tax amount
    print("The Tax amount is:", "{:.2f}".format(tax))
