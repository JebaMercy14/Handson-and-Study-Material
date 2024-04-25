def create_student_details():
  n=int(input("Enter the no of student details to be created : \n"))
  if n <= 0:
     print("Invalid Input")
     return []
  student_list = []
  for i in range(n):
      name = input("Name: \n")
      age = int(input("Age: \n"))
      if age <= 10 or age > 20:
          print("Invalid Input")
          return[]
      location = input("Location: \n")
      student = {"Name": name, 'Age': age, 'Location': location}
      student_list.append(student)
  return student_list
def display_students_by_location(student_list):
      location = input("Enter the training location:\n")
      k=0
      for student in student_list:
          if student['Location'] == location:
              print("Student(s) enrolled in this training location:")
              break
      for student in student_list:
          if student['Location'] == location:
              print(student["Name"])
              k+=1
      if k == 0:
              print("Invalid location")
students = create_student_details()
if students:
     print("Here's the list of student details :")
     for student in students:
         print(student)
     display_students_by_location(students)