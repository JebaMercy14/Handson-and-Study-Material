import Dates

year=int(input("Enter year as 4 digits (e.g: 2002):")) 
month= int(input("Enter month number:"))
if Dates.is_leap(year):
    print("Year: Leap Year")
else: 
    print("Year: Not Leap Year")
month_name = Dates.month_name(month)
if month_name == "Invalid month number":        
    print("Invalid month number")
else:
    print("Month Name:", month_name)
    print("Days in month: ",Dates.days_in_month(month, year))
