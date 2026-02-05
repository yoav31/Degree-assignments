sum_height=0 
count_people=0
student_height=input().split()
for n in range(0, len(student_height)):
    student_height[n]=int(student_height[n])
    sum_height+=student_height[n]
    count_people+=1
    
average=round(sum_height/count_people)   
print(f"total height: {sum_height}")
print(f"number of students: {count_people}")
print(f"average height: {average}")