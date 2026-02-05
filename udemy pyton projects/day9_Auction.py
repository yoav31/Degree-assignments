
from art import logo
print(logo)

name=input("your name: ")
price=int(input("your price: "))
bid=[{"name":name,
      "price":price}] 

answer=input("there are other users who want to bit? yes/no  ")
if answer=="yes":
    answer=True
else:
    answer=False  
      
while answer==True:
    name=input("your name: ")
    price=int(input("your price: "))
    bid.append({"name":name,
      "price":price})
    answer=input("there are other users who want to bit? yes/no  ")
    if answer=="yes":
        answer=True
    else:
        answer=False    

win_price=bid[0]["price"]
win_name=bid[0]["name"]
for i in bid:
    if i["price"] > win_price:
        win_price=i["price"]
        win_name=i["name"]
    
print(f"the winner is {name} with bid of {price}$")    
    
    


