student_score=input().split()
for n in range(0, len(student_score)):
    student_score[n]=int(student_score[n])
biggest=student_score[0]
for score in student_score:
    if biggest<score:
        biggest=score  
print(f"the highst score is {biggest}")