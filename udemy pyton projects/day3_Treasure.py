print('''
*******************************************************************************
          |                   |                  |                     |
 _________|________________.=""_;=.______________|_____________________|_______
|                   |  ,-"_,=""     `"=.|                  |
|___________________|__"=._o`"-._        `"=.______________|___________________
          |                `"=._o`"=._      _`"=._                     |
 _________|_____________________:=._o "=._."_.-="'"=.__________________|_______
|                   |    __.--" , ; `"=._o." ,-"""-._ ".   |
|___________________|_._"  ,. .` ` `` ,  `"-._"-._   ". '__|___________________
          |           |o`"=._` , "` `; .". ,  "-._"-._; ;              |
 _________|___________| ;`-.o`"=._; ." ` '`."\` . "-._ /_______________|_______
|                   | |o;    `"-.o`"=._``  '` " ,__.--o;   |
|___________________|_| ;     (#) `-.o `"=.`_.--"_o.-; ;___|___________________
____/______/______/___|o;._    "      `".o|o_.--"    ;o;____/______/______/____
/______/______/______/_"=._o--._        ; | ;        ; ;/______/______/______/_
____/______/______/______/__"=._o--._   ;o|o;     _._;o;____/______/______/____
/______/______/______/______/____"=._o._; | ;_.--"o.--"_/______/______/______/_
____/______/______/______/______/_____"=.o|o_.--""___/______/______/______/____
/______/______/______/______/______/______/______/______/______/______/_____ /
*******************************************************************************
''')
derection =input("Welcome to Treasure Island, your mission is to find the treasure" 
      "\n You're at cross road. Where do you want to go? 'left' or 'right' ")
if derection != "left":
    print("Fall into a hole. Game Over")
    quit()

do=input("You come to a lake. There is a island in the middle of the lake. type 'wait' for wait to a boat. type 'swim' to swim across. ")    
if do != "wait":
    print("Attacked by trout.Game Over.")
    quit()

collor=input("You arrive to the island unharmed. There is a house with 3 doors. one red,one yellow, one blue. which door you choose?")    
if collor=="blue":
    print("Eaten by beasts. Game Over.")
    quit()
elif collor=="red":
    print("Burned by fire. Game Over")
    quit()  
elif collor != "yellow":
    print("Game over")
    quit()
else:
    print("You win!!!")    
