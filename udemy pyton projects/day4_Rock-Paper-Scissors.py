import random
choose=int(input("What do you choose? type 0 for rock, 1 for paper and 2 for scissors\n"))
rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''
paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''
scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''
computer_num=random.randint(0,2)

if choose==0:
    print(rock+f"\ncomputer choose:{computer_num}")
elif choose==1:
     print(paper+f"\ncomputer choose:{computer_num}")
else:
     print(scissors+f"\ncomputer choose:{computer_num}") 

if computer_num==0:
     print(rock)

elif computer_num==1:
     print(paper)

else:
     print(scissors)
             
if choose==computer_num:
         print("its a draw!")
         quit()

if  choose==0:
    if computer_num==1:
        print("you lose!")
    if computer_num==2:
         print("you win!")

if  choose==1:
    if computer_num==2:
        print("you lose!")
    if computer_num==0:
         print("you win!")

if  choose==2:
    if computer_num==0:
        print("you lose!")
    if computer_num==1:
         print("you win!")         