import random
print("Heand or Tail?")
choise=input("your choise: ")
if(choise=="heand"):
    if random.randint(0,1)==1:
      print("coin: heand\n you win!!")
    else:
      print("coin: tail\n you lose!!")
if(choise=="tail"):
    if random.randint(0,1)==0:
      print("coin: tail\n you win!!")
    else:
      print("coin: heand\n you lose!!")         
