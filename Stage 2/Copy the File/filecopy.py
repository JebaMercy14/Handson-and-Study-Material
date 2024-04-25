with open("file_in.txt", "r") as file_in: 
     content = file_in.readlines() 
modified_content = [line for line in content] 
with open("file_out.txt", "w") as file_out:
     file_out.writelines (modified_content)
with open("file_out.txt", "r") as file_out: 
     print("In output file, the content will be copied.") 
     print("Write the content to the output file (file name) : file_out.txt and display it.")
     print(file_out.read())
