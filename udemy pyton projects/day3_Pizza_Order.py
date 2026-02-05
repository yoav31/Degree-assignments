print("welcome to pizza shop!!")
total=0
size=input("wich size of pizza: S, M ,L? ")
if size=="S":
    total=15
elif size=="M":
    total=20
else:
    total=25  
add_pepperoni=input("do you want pepperoni?: Y or N? ")
if add_pepperoni=="Y":
    if size=="S":
      total+=2
    else:
      total+=3  
extra_cheese=input("do you want extra cheese?: Y or N? ")
if extra_cheese=="Y":
   total+=1

print(f"you need to pay {total}$")
